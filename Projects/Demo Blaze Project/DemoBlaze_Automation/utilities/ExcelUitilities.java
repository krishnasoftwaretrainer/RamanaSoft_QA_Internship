package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUitilities {
	public static Object[][] readExcelData(String filePath, String sheetName) throws Exception {

		FileInputStream fis = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int row = sheet.getPhysicalNumberOfRows();  //10
		//int row = sheet.getLastRowNum(); //5+1=6 0 1 2 3 4 5
		int col = sheet.getRow(0).getPhysicalNumberOfCells();
	
		Object[][] data = new Object[row-1][col];
		for(int i=1; i<row; i++)
		{
			XSSFRow currentRow = sheet.getRow(i);
			for(int j=0; j<col; j++)
			{
				data[i-1][j] = currentRow.getCell(j).toString();
			}
		}
		return data;
	}
/**
 * 
 * 
 */
}
