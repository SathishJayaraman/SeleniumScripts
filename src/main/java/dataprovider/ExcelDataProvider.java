package dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {

	
	public static Object[][] excelDataProvider(String fileName, String sheetName) throws IOException {

		Object[][] excelData = null;

		FileInputStream excel = new FileInputStream("./data/" + fileName + ".xlsx");

		XSSFWorkbook excelWb = new XSSFWorkbook(excel);

		XSSFSheet excelSheet = excelWb.getSheet(sheetName);

		int rows = excelSheet.getLastRowNum();

		int columns = excelSheet.getRow(0).getLastCellNum();

		excelData = new Object[rows][columns];

		for (int i = 1; i <= rows; i++) {

			XSSFRow row = excelSheet.getRow(i);

			for (int j = 0; j < row.getLastCellNum(); j++) {

				Object testData = null;

				try {

					if (row.getCell(j).getCellType() == 0) {
						testData = ""+row.getCell(j).getNumericCellValue();
						
					} else if (row.getCell(j).getCellType() == 1) {
						testData = row.getCell(j).getStringCellValue();
					}
				} catch (NullPointerException e) {
					System.out.println("The Excel is having blank values");
				}

				excelData[i - 1][j] = testData;

				System.out.println("The Excel values" + testData);

			}
			excel.close();
			excelWb.close();

		}

		return excelData;

	}

}
