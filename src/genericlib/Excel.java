package genericlib;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel implements Constants {
	public static String ExcelSheet(String path, String sheet, int r, int c) {
		String data=" ";
		try {
			FileInputStream f = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(f);
			data = wb.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();

		} catch (Exception e) {
			Reporter.log("Data Not Found",true);
		}
		return data;
	}
	
	}
	

