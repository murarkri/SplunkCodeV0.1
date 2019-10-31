package POM;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ServerListfromExcel  {

	
	public static void ExcelConnection() throws IOException {
		File src= new File("C:\\Users\\mukri2\\eclipse-workspace\\splunk_automation\\ServerExcel\\Splunk Integ Server.xlsx");
		 FileInputStream fis=new FileInputStream(src);
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 XSSFSheet sheet=wb.getSheetAt(0);
		 int RowCount=sheet.getLastRowNum();
		 System.out.println("Total row is "+ RowCount);
		 String Server1;
		 for(int i=0;i<=RowCount;i++) {
			 Server1 = sheet.getRow(i).getCell(0).getStringCellValue();
			 System.out.println("Server from row" + i + "is" + Server1);
			 wb.close();
			 
		}
		 
		 
	}

}
