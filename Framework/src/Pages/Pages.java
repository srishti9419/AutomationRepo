package Pages;


import org.openqa.selenium.WebDriver;

public class Pages {
	
	WebDriver dr;
	public HomePage homepage;
	public Flightfinder flightfinder;
	public BookFlight bookAFlight;
	
	public SelectFlight selectFlight;
	
	public FlightConfirmation flightconfirmation;
	
		
		public Pages(WebDriver dr)
		{
		
	 homepage=new HomePage(dr);
		flightfinder=new Flightfinder(dr);
		selectFlight= new SelectFlight(dr);
		bookAFlight=new BookFlight(dr);
	flightconfirmation=new FlightConfirmation(dr);
		
		
		}
	}



