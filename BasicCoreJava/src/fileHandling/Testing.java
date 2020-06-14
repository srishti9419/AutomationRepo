package fileHandling;

import java.io.IOException;

public class Testing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filepath=System.getProperty("user.dir")+"\\src\\fileHandling\\TestData.xls";
		
		Xls_Reader xl= new Xls_Reader(filepath);
		
		String str=xl.getCellData("Sheet1", 1, 1);
		
		System.out.println(str);
		
		int rows=xl.getRowCount("Sheet1");
		int cols=xl.getColumnCount("Sheet1");
		
		for(int i=1; i<=rows; i++)
		{
			for(int c=1; c<=cols; c++)
			{
				xl.setCellData("Sheet2", i, c, xl.getCellData("Sheet1", i, c));
			}
			
		}

	}

}
