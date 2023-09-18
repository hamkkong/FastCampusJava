package kr.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ExcelRead {
    public static void main(String[] args) throws RuntimeException {
        try {
            FileInputStream file = new FileInputStream(new File("test.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);


            for (Sheet sheet : workbook) {
                int lastRowIndex = sheet.getLastRowNum();
                for (int rowIndex = 0; rowIndex < lastRowIndex; rowIndex++) {
                    Row row = sheet.getRow(rowIndex);
                    if (row != null) {
                        int lastCellIndex = row.getLastCellNum();
                        for (int cellIndex = 0; cellIndex < lastCellIndex-1; cellIndex++) {
                            Cell cell = row.getCell(cellIndex);
                            String value = "";
                            if (cell != null) {
                                switch (cell.getCellType()) {
                                    case FORMULA:
                                        value = cell.getCellFormula();
                                        break;
                                    case NUMERIC:
                                        value = cell.getNumericCellValue() + "";
                                        break;
                                    case STRING:
                                        value = cell.getStringCellValue();
                                        break;
                                    case BLANK:
                                        value = cell.getBooleanCellValue() + "";
                                        break;
                                    case ERROR:
                                        value = cell.getErrorCellValue() + "";
                                        break;


                                }
                            }
                            System.out.println((rowIndex+1) + "번 행 " + (cellIndex+1) + "번 열 값은 :" + value);
                        }
                    }
                }
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}