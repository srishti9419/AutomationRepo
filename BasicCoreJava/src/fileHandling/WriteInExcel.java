package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteInExcel {
	public static void main(String[] args) throws IOException {
		
	
	System.out.println(System.getProperty("user.dir"));
	
	String filepath=System.getProperty("user.dir")+"\\src\\fileHandling\\TestData.xls";
	
	System.out.println(filepath);
	
	FileInputStream file=new FileInputStream(filepath);
	HSSFWorkbook hs= new HSSFWorkbook(file);
	
HSSFSheet sheet=	hs.getSheet("Sheet1");
HSSFRow row =sheet.getRow(1);

HSSFCell cell=row.getCell(1);	




cell.setCellValue("akash");


 row =sheet.getRow(2);

 cell=row.getCell(2);	
 cell.setCellValue("shubhi");




FileOutputStream file2=new FileOutputStream(filepath);

hs.write(file2);


	}
}
