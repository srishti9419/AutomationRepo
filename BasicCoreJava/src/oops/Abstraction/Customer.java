package oops.Abstraction;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		RBI acc;
		acc=new VijayaBank();
		acc.creditcard();
		acc.currentaccount();
		acc.debditcard();
		acc.savingaccount();
		
		acc=new HDFC();
		
		acc.creditcard();
		acc.currentaccount();
		acc.debditcard();
		acc.savingaccount();
		
		
		
acc=new ICICI();
		
		acc.creditcard();
		acc.currentaccount();
		acc.debditcard();
		acc.savingaccount();
		
		
		
		

	}
	*/
		
	
		Customer cs= new Customer();
		cs.createAccount("HDFC");
		cs.createAccount("ICICI");
		cs.createAccount("ICICI");
		
		
	}
	
	public void createAccount( String bankname)
	{
		
		RBI acc=null;
		if(bankname.equals("VijayaBank"))
				{
		acc=new VijayaBank();
				}
		else if(bankname.equals("ICICI"))
		
		{
			acc=new ICICI();
		}
		
		else if(bankname.equals("HDFC"))
		{
			acc=new HDFC();
		}
		
		acc.creditcard();
		acc.currentaccount();
		acc.debditcard();
		acc.savingaccount();
		
	}
}

