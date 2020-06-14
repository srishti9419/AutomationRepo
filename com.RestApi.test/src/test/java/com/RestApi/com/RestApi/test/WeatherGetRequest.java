package com.RestApi.com.RestApi.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
public class WeatherGetRequest {
	
	// get request
	
	/*@Test
	public void test1()
	{
		Response res=when().
				get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
		//res.getStatusCode();
		
		System.out.println("statusCode"+res.getStatusCode());
		
	Assert.assertEquals(res.getStatusCode(), 200);
				
	}
	
	@Test//use parameters in get request
	public void test2()
	{
		Response res=given().param("q", "London").param("appid", "439d4b804bc8187953eb36d2a8c26a02").
				
				get("https://samples.openweathermap.org/data/2.5/weather");
		//res.getStatusCode();
		
		System.out.println("statusCode"+res.getStatusCode());
		
	Assert.assertEquals(res.getStatusCode(), 200);
	
	System.out.println(res.asString());
	
	
	//Also write as
	given().param("q", "London").param("appid", "439d4b804bc8187953eb36d2a8c26a02").
	
	get("https://samples.openweathermap.org/data/2.5/weather").then().assertThat().statusCode(200);
	
				
	}
	
	*/
	public void  test3(){
		
		Response res=given().parameter("id","2172797").parameter("appid","439d4b804bc8187953eb36d2a8c26a02").when().get("http://samples.openweathermap.org/data/2.5/weather");
		String weatherReport=res.then().contentType(ContentType.JSON).extract().path("weather[0].description");
		
		System.out.println("weather response:"+ weatherReport);
		
	}

}
