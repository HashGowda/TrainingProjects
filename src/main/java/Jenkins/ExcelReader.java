package Jenkins;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    public static void main(String[] args) throws IOException {
        File src= new File("E:\\Software Testing\\Java\\git\\EmployeeSampleData.xlsx");
        //String excelFilePath = "E:\\Software Testing\\Java\\git\\";
        FileInputStream inputStream = new FileInputStream(new File(src.toURI()));
        XSSFWorkbook wb = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = wb.getSheetAt(0);

        System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());

        // Skip the first 25 rows
//        for (int i = 0; i < 25; i++) {
//            sheet.removeRow(sheet.getRow(i));
//        }
//
//        // Loop through the remaining rows
//        for (Row row : sheet) {
//            // Do something with the row
//            System.out.println(row);
//        }
//
//        // Close the workbook and input stream
//        wb.close();
//        inputStream.close();
    }
}
