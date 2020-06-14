package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadWriteExcel {


	
	
		public static void main(String[] args) throws FileNotFoundException {
			
			System.out.println(System.getProperty("user.dir"));
			
			String filepath=System.getProperty("user.dir")+"\\src\\fileHandling\\TestData.xls";
			
			System.out.println(filepath);
			
			
			FileInputStream fl= new FileInputStream(filepath);
			
			
			HSSFWorkbook wb=new HSSFWorkbook();
			
			HSSFSheet s=wb.getSheet("Sheet1");
			
			HSSFRow rs=s.getRow(0);
			
			HSSFCell cl=rs.getCell(0);
			
			
			
			
		}
		
	}
		
		
		
	
	
