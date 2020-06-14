package basicAPITesting;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_UpdateRecord {
	
	@Test
	public void test1()
	
	
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/update/71748";
		
		RequestSpecification request = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("name", "Arti123");
		requestParams.put("salary", "3244353");
		requestParams.put("age", "56");
		request.header("Content-Type", "application/json");
		// Add the Json to the body of the request
		request.body(requestParams.toJSONString());
		Response response = request.request(Method.PUT);
int statusCode = response.getStatusCode();
		
		
		System.out.println(statusCode);
		System.out.println(response.asString());
		JsonPath jsonPathEvaluator = response.jsonPath();
		String id = jsonPathEvaluator.get("id");

		System.out.println(id);
		
	}
	

}
