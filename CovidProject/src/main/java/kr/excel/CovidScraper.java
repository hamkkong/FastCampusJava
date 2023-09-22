package kr.excel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CovidScraper { //문서가 사라져서 코드를 확인할 수 없는 상황. 이정도만 하고 마무리

    public static void main(String[] args) throws ParseException {
        String url = "https://ncov.kdca.go.kr/bdBoardList_Real.do?brdId=1&brdGubun=13&ncvContSeq=&contSeq=&board_id=&gubun=";

        try {
            // 웹페이지에서 HTML 문서 가져오기
            Document doc = Jsoup.connect(url).get();
            // 일자 정보 가져오기(HTML 데이터에서 직접 파싱)
            Element dateElement = doc.select("span.date").first();

            String dateStr = null;
            if (dateElement != null) {
                dateStr = dateElement.text();
                //나머지 코드
            } else {
                System.out.println("날짜 정보를 찾을 수 없습니다.");
                return;
            }
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm");
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm");
            Date date = inputFormat.parse(dateStr);
            String formattedDate = outputFormat.format(date);

            //원하는 데이터를 포함하고 있는 테이블을 찾는다.
            Element table = doc.select("table.num").first();
            Elements rows = table.select("tbody>tr");

            List<CovidStatus> covidStatusList = new ArrayList<>();

            for (Element row : rows) {
                // 각 셀의 값을 추출한다.
                String region = row.select("th").text();
                int total = Integer.parseInt(row.select("td:nth-child(2)").text().replaceAll(",", ""));
                int domestic = Integer.parseInt(row.select("td:nth-child(3)").text().replaceAll(",", ""));
                int abroad = Integer.parseInt(row.select("td:nth-child(4)").text().replaceAll(",", ""));
                int confirmed = Integer.parseInt(row.select("td:nth-child(5)").text().replaceAll(",", ""));
                int deaths = Integer.parseInt(row.select("td:nth-child(6)").text().replaceAll(",", ""));
                String rateStr = row.select("td:nth-child(7)").text().replaceAll(",", "");
                double rate = rateStr.equals("-") ? 0.0 : Double.parseDouble(rateStr);

                covidStatusList.add(new CovidStatus(region, total, domestic, abroad, confirmed, deaths, rate));
            }
            System.out.println("일일 코로나 바이러스 감염 현황(" + date + ")");
            System.out.println("시도 | 합계 | 국내발생 | 확진환자 | 사망자 | 발생률");

            for (CovidStatus covidStatus : covidStatusList) {
                System.out.println(covidStatus);
            }

            // 엑셀 파일로 저장
            String excelFileName = "covid_status_" + formattedDate + ".xlsx";
            ExcelExporter.exportToExcel(dateStr, covidStatusList, excelFileName);
            System.out.println("엑셀 파일로 저장 완료 : " + excelFileName);

            // pdf파일로 저장
            String pdfFileName = "covid_status_" + formattedDate + ".pdf";
            PdfExporter.exportToPdf(dateStr, covidStatusList, pdfFileName);
            System.out.println("PDF 파일로 저장 완료 : " + pdfFileName);


        }catch (IOException e){
            e.printStackTrace();
        }
    }

}