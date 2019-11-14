package POM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFCell cell;
	public static XSSFRow row;

public static void main(String[]args) throws IOException, InterruptedException {
		    
	
	String fileName = "C:\\Users\\mukri2\\test.xlsx";
	File src=new File(fileName);
		    FileInputStream fis =new FileInputStream(src);
		    XSSFWorkbook wob= new XSSFWorkbook(fis);
		    XSSFSheet sheet=wob.createSheet("Data");
		    String[][] data = new String[3][2];
		    data[0][0] = "Name";
			data[0][1] = "City";
		/*
		 * data[1][0] = "Shekhar"; data[1][1] = "Bangalore"; data[2][0] = "Manan";
		 * data[2][1] = "Delhi";
		 */
			//Row count array
			int dataRows = data.length;
			//Column count
			int dataColumn = data[1].length;
			
			//for loop for iterating over the data 
			for(int i=0;i<dataRows;i++){
				 row =sheet.createRow(i);
				for(int j=0;j<dataColumn;j++){
					String fillData = data[i][j];
					System.out.println(fillData+"--");
			    	 cell = row.createCell(j);
			    	 //Set value into cell
					cell.setCellValue(fillData); 
		    FileOutputStream fos= new FileOutputStream(src);
		    wob.write(fos);
		    Thread.sleep(10000);
		    wob.close();
		    

}
		    
		    
}
}
}
		    
		    
		    
		    
