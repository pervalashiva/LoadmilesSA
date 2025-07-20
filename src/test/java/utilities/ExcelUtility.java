package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUtility {
	
	@Test
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testData\\lgoinDDT.xlsx");
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("Sheet1");

        int totalRows = sheet.getLastRowNum(); // Excludes header
        int totalCells = sheet.getRow(0).getLastCellNum(); // Header row is at index 0

        System.out.println("Number of rows: " + totalRows);
        System.out.println("Number of cells: " + totalCells);

        for (int r = 1; r <= totalRows; r++) { // Start from 1 to skip header
            XSSFRow currentRow = (XSSFRow) sheet.getRow(r);
            if (currentRow == null) continue;

            for (int c = 0; c < totalCells; c++) {
                XSSFCell cell = currentRow.getCell(c);
                String cellValue = (cell != null) ? cell.toString() : "";
                System.out.print(cellValue + "\t");
            }
            System.out.println();
        }

        workbook.close();
        file.close();
    }
}
