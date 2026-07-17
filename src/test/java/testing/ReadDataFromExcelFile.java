package testing;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class ReadDataFromExcelFile {
	@Test
	public void getExcelLoginData() {
		String excelFile = System.getProperty("user.dir") + 
				"\\src\\test\\resources\\TestData.xlsx";
		FileInputStream fis;
		XSSFWorkbook workbook = null;
		try {
			fis = new FileInputStream(excelFile);
			workbook = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// create Sheet to get row count
		XSSFSheet sheet = workbook.getSheet("LoginData");
		int rowCount = sheet.getPhysicalNumberOfRows();
		// Using row getting the column count
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getPhysicalNumberOfCells();
		// Object to store data from excel.
		Object[][] dataArray = new Object[rowCount][colCount];
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				dataArray[i][j] = sheet.getRow(i).getCell(j);
				System.out.print(dataArray[i][j] + "\t");
			}
			System.out.println();
		}
	}
}