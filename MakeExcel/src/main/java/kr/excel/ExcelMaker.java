package kr.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExcelMaker {

    public static String filePath = "/Users/User_name/Desktop/(폴더명)"; // 본인 데스크탑 경로로 설정할것
    public static String fileName ="test.xlsx"; // 엑셀파일 이름
    public static void main(String[] args) {
        //빈 workbook 생성
        XSSFWorkbook workbook = new XSSFWorkbook();
        //빈 sheet 생성
        XSSFSheet sheet = workbook.createSheet("employs data");

        //sheet를 채우기 위한 데이터들을 Map에 저장
        Map<String,Object[]> data = new TreeMap<>();
        data.put("1", new Object[]{"ID", "NAME", "PHONE_NUMBER"});
        data.put("2", new Object[]{"1", "cookie", "010-1111-1111"});
        data.put("3", new Object[]{"2", "bread", "010-2222-2222"});
        data.put("4", new Object[]{"3", "cheese", "010-3333-3333"});
        data.put("5", new Object[]{"4D", "candy", "010-4444-4444"});

        // data에서 KeySet을 가져온다 이 Set 값들을 조회하면서 데이터들을 sheet에 입력한다.
        Set<String> keyset = data.keySet();
        int rownum = 0;

        // 알아야할 점. TreeMAp을 통해 생성된 KeySet는 for를 조회시, 키캆이 오름차순으로 조회된다.
        for (String key : keyset){
            Row row = sheet.createRow(rownum++);  // 행 생성
            Object[] objArr = data.get(key);
            int cellnum = 0;  // 열(셀) 생성
            for (Object obj : objArr){
                Cell cell = row.createCell(cellnum++);
                if(obj instanceof String){
                    cell.setCellValue((String)obj);
                }else if (obj instanceof  Integer){
                    cell.setCellValue((Integer)obj);
                }
            }

        }
        try (FileOutputStream out = new FileOutputStream(new File(filePath, fileName))){
            workbook.write(out);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
