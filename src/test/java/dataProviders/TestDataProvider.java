package dataProviders;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider(name = "loginData")
	public Object[][] getLoginData() {
		return new Object[][] { { "ValidUsername", "ValidPassword" }, };
	}

	@DataProvider(name = "excelLoginData")
	public Object[][] getExcelLoginData() {
		String excelFile = System.getProperty("user.dir") + "\\src\\test\\resources\\TestData.xlsx";
		FileInputStream fis;
		XSSFWorkbook workbook = null;
		Object[][] dataArray = null;
		try {
			fis = new FileInputStream(excelFile);
			workbook = new XSSFWorkbook(fis);
			// Get row count
			int rowCount = workbook.getSheet("LoginData").getPhysicalNumberOfRows();
			// Get column count
			int colCount = workbook.getSheet("LoginData").getRow(0).getPhysicalNumberOfCells();
			// Object to store data from excel.
			dataArray = new Object[rowCount - 1][colCount];
			for (int i = 1; i < rowCount; i++) {
				for (int j = 0; j < colCount; j++) {
					dataArray[i - 1][j] = workbook.getSheet("LoginData").getRow(i).getCell(j).getStringCellValue();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return dataArray;
	}

}
