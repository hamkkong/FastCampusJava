package kr.excel.example;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.UnitValue;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.*;

public class PDFFile {

    public static void main(String[] args) throws MalformedURLException, IOException {
        String dest = "book_table.pdf";
        new PDFFile().createPdf(dest);
    }
    public void createPdf(String dest)throws MalformedURLException, IOException{
        List<Map<String,String>> books = createDummyData();
        //Initialize PDF writer and PDF document
        PdfWriter writer = new PdfWriter(dest); // 메모리
        PdfDocument pdf = new PdfDocument(writer); // 저장방식
        Document document = new Document(pdf, PageSize.A4); // 출력물 크기

        //Initialize fonts
        PdfFont headerFont = null;
        PdfFont bodyFont = null;
        try{  // 폰트 깨짐방지 예외처리
            headerFont = PdfFontFactory.createFont("NanumBarunGothicLight.ttf", "Identity-H",true);
            bodyFont = PdfFontFactory.createFont("NanumBarunGothicLight.ttf", "Identity-H",true);
        }catch (IOException e){
            e.printStackTrace();
        }

        //Initialize table
        float[] columWidths = {1,2,2,2,2,2,};  // 각 표의 네모칸의 할당 크기
        Table table = new Table(UnitValue.createPercentArray(columWidths));
        table.setWidth(UnitValue.createPercentValue(100));  // 표의 전체 크기

        //Initialize table header cells
        Cell headerCell1 = new Cell().add(new Paragraph("순번")).setFont(headerFont);
        Cell headerCell2 = new Cell().add(new Paragraph("제목")).setFont(headerFont);
        Cell headerCell3 = new Cell().add(new Paragraph("저자")).setFont(headerFont);
        Cell headerCell4 = new Cell().add(new Paragraph("출판사")).setFont(headerFont);
        Cell headerCell5 = new Cell().add(new Paragraph("출판일")).setFont(headerFont);
        Cell headerCell6 = new Cell().add(new Paragraph("이미지")).setFont(headerFont);
        table.addHeaderCell(headerCell1); // 각 표마다 들어갈 내용을 할당
        table.addHeaderCell(headerCell2);
        table.addHeaderCell(headerCell3);
        table.addHeaderCell(headerCell4);
        table.addHeaderCell(headerCell5);
        table.addHeaderCell(headerCell6);
        // add table body cells
        int rowNum = 1;
        for (Map<String,String> book : books) {
            String title = book.get("title");
            String authors = book.get("authors");
            String publisher = book.get("publisher");
            String publishedDate = book.get("publishedDate");
            String thumbnail = book.get("thumbnail");

            Cell rowNumCell = new Cell().add(new Paragraph(String.valueOf(rowNum))).setFont(bodyFont);
            table.addCell(rowNumCell); //각 타이틀의 body에 들어갈 내용
            Cell titleCell = new Cell().add(new Paragraph(String.valueOf(title))).setFont(bodyFont);
            table.addCell(titleCell);
            Cell authorsCell = new Cell().add(new Paragraph(String.valueOf(authors))).setFont(bodyFont);
            table.addCell(authorsCell); //각 타이틀의 body에 들어갈 내용
            Cell publisherCell = new Cell().add(new Paragraph(String.valueOf(publisher))).setFont(bodyFont);
            table.addCell(publisherCell); //각 타이틀의 body에 들어갈 내용
            Cell publisherDateCell = new Cell().add(new Paragraph(String.valueOf(publishedDate))).setFont(bodyFont);
            table.addCell(publisherDateCell); //각 타이틀의 body에 들어갈 내용
            ImageData imageData = ImageDataFactory.create(new File(thumbnail).toURI().toURL());
            Image img = new Image(imageData);
            Cell imageCell = new Cell().add(img.setAutoScale(true));
            table.addCell(imageCell);
            rowNum++;
        }
            document.add(table);
            document.close();

    }
    private static List<Map<String, String>> createDummyData() {
        List<Map<String, String>> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("책 개수를 입력하세요 : ");
        int bookCount = scanner.nextInt();
        scanner.nextLine(); //개행 문자 제거
        for(int i=1;i<=bookCount; i++){
            Map<String,String> book = new HashMap<>();
            System.out.printf("\n[ (%d 번째 책 정보 입력 ]\n", i);
            System.out.print("제목 : ");
            book.put("title", scanner.nextLine());

            System.out.print("저자 : ");
            book.put("authors", scanner.nextLine());

            System.out.print("출판사 : ");
            book.put("publisher", scanner.nextLine());

            System.out.print("출판일(YYYY-MM-DD) : ");
            book.put("publishedDate", scanner.nextLine());

            System.out.print("썸네일 URL : ");
            book.put("thumbnail", scanner.nextLine());

            books.add(book);
        }
        scanner.close();
        return books;


    }
}
