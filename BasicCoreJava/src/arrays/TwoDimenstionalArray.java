package arrays;

public class TwoDimenstionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data[][]=new String [5][2];
		//row1
		data[0][0]="username";
		data[0][1]="password";
		data[1][0]="U1";
		data[1][1]="P1";
		
		data[2][0]="U2";
		data[2][1]="P2";
		
		
		data[3][0]="U3";
		data[3][1]="P3";
		
		
		data[4][0]="U4";
		data[4][1]="P4";
		
		
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}

	}

}
