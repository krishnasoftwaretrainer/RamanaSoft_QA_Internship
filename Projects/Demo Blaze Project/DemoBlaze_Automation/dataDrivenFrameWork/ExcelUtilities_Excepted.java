package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities_Excepted 
{
	public static Object[][] readExcelData(String filePath, String sheetName) throws IOException
	{
	
		FileInputStream fis = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int row = sheet.getPhysicalNumberOfRows();  //6=0 1 2 3 4 5
		int col = sheet.getRow(0).getPhysicalNumberOfCells(); //2=0 1 2 
	
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
}
