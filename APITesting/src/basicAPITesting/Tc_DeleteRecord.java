package basicAPITesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Tc_DeleteRecord {

	@Test
	
	public void test1()
	
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/delete/71748";
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		Response response = request.request(Method.DELETE);
		int statusCode = response.getStatusCode();
		
		System.out.println(statusCode);
		System.out.println(response.asString());
		
	}
}
