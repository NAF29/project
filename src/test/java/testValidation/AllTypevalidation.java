package testValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AllTypevalidation {

	@Test
	public void validate() {
		
		RestAssured.baseURI="https://reqres.in/";
		String basePath="api/users?page=2";
		
		RequestSpecification requestSpecification=RestAssured.given();
		
		requestSpecification.headers("Content-Type","application/json");
		
		Response response =requestSpecification.get(basePath);
		
		System.out.println(response.getBody());
		System.out.println(response.getStatusLine());
		System.out.println(response.asPrettyString());
		
		//How will you write a simple Rest Assured testcase that validates sample json response?
		
		String email = response.jsonPath().getString("data[0].email");
        System.out.println("The email is: " + email);
        
        
		
		
	}
				
}
