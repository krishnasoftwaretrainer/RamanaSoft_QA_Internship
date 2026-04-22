package hybridFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities extends BaseClass {
	public static Object[][] readExcelData(String filePath, String sheetName) throws IOException {

		FileInputStream fis = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("SwagTestData");
		int row = sheet.getPhysicalNumberOfRows(); // 10
		// int row = sheet.getLastRowNum(); //5+1=6 0 1 2 3 4 5
		int col = sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] data = new Object[row - 1][col];

		for (int i = 1; i < row; i++) // 8 12 22 32 42 52 62 72
		{
			XSSFRow currentRow = sheet.getRow(i);
			for (int j = 0; j < col; j++) // 2
			{
				data[i - 1][j] = currentRow.getCell(j).toString();
			}
		}
		return data;
	}

}
