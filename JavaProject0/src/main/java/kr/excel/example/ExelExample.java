package kr.excel.example;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExelExample {
    public static void main(String[] args) {
        try{
            FileInputStream file = new FileInputStream(new File("example.xlsx")); //가상의 엑셀파일(workbook) 만들어야함
            Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);
            for(Row row : sheet){
                for (Cell cell : row){
                    switch (cell.getCellType()){
                        case NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)){  // 숫자의 날짜부분 형태 지정
                                Date dateValue = cell.getDateCellValue();
                                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                String formattedDate = dateFormat.format(dateValue);
                                System.out.print(formattedDate + "\t");
                            } else { // 일반 숫자의 형태 지정
                                double numericValue = cell.getNumericCellValue();  // 현재는 실수형 타입으로 표현됨
                                if (numericValue == Math.floor(numericValue)){  // 정수형으로 나타내기
                                    int intValue = (int) numericValue;
                                    System.out.print(intValue + "\t");
                                }else {  // 실수형으로 나타내기
                                    System.out.print(numericValue + "\t");
                                }
                            }
                            break;
                        case STRING:
                            String stringValue = cell.getStringCellValue();
                            System.out.print(stringValue + "\t");
                            break;
                        case BOOLEAN:
                            boolean booleanValue = cell.getBooleanCellValue();
                            System.out.print(booleanValue + "\t");
                            break;
                        case BLANK:
                            System.out.print("\t");
                        default:
                            System.out.print("\t");
                            break;
                    }

                }
                System.out.println();  // 줄바꿈 (다음 열로 넘어가기)
            }
            file.close();
            System.out.println("엑셀에서 데이터 읽어오기 성공");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
