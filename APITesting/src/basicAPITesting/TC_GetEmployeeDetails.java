package basicAPITesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_GetEmployeeDetails {
	
	@Test
	/*
	public void test1()
	
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employee/1160";
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		Response response = request.request(Method.GET);
		int statusCode = response.getStatusCode();
		
		System.out.println(statusCode);
		System.out.println(response.asString());
		
	}
	*/
	//__________________________________________________________________________________
	
	public void test2()
	{
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employee/1188";
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/json");
		Response response=request.request(Method.GET);
		
int statusCode=response.getStatusCode();

System.out.println(statusCode);
	}

}
