package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
	public static String getData(String sheetName, int rownum, int cellnum) throws EncryptedDocumentException, IOException	{
		FileInputStream file = new FileInputStream("D:\\automation\\amazon\\src\\test\\resources\\Worksheet.xlsx");
		String data = WorkbookFactory.create(file).getSheet(sheetName).getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
	}
	
	
	
	
	
	
	
	
	
	

}
