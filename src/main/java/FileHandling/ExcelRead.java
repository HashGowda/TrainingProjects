package FileHandling;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.soap.SOAPArrayType;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ExcelRead {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\HHRA1231\\IdeaProjects\\Practice\\Practice\\DataFiles\\FreeCrmTestData.xlsx";
        FileInputStream fis = new FileInputStream(path);

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);    //XSSFSheet sheet = wb.getSheet("sheet1");

        //Using for loop

        int row = sheet.getLastRowNum();
        int col = sheet.getRow(1).getLastCellNum();

        for (int r = 0; r < row; r++) {
            XSSFRow rw = sheet.getRow(r);

            for (int c = 0; c < col; c++) {
                XSSFCell cell = rw.getCell(c);
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue());
                        break;
                }
                System.out.print(" | ");
            }
            System.out.println();
        }

        //Using iterator

        Iterator it = sheet.iterator();

        while (it.hasNext()) {
            XSSFRow rw = (XSSFRow) it.next();

            Iterator cellIterator = rw.cellIterator();
            while (cellIterator.hasNext()) {
                XSSFCell cell = (XSSFCell) cellIterator.next();

                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue());
                        break;
                }
                System.out.print(" | ");
            }
            System.out.println();
        }

    }

}


