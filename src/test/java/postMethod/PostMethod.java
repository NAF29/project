package postMethod;

import java.util.HashMap;

import javax.mail.Message;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostMethod {

	@Test
	public void post() {
		
		RestAssured.baseURI="https://conappdevapi.badabusiness.co.in/";
		RestAssured.basePath="api/v3/billionare-blueprint-diploma/user-batch-allotment";
		
		RequestSpecification requestSpecification=RestAssured.given();
		
		HashMap<String, Object> payload = new HashMap<String, Object>();
		payload.put("program_id", "1");
		payload.put("user_id", "6ecbfccd15d1597dd023d93e");
		payload.put("invoice_date", "2023-10-01");
		
		
		HashMap<String, Object> head = new HashMap<String, Object>();
		head.put("Content-Type","application/json");
		head.put("client-key","823BBD");
		
		requestSpecification.headers(head);
		requestSpecification.headers(payload);
		
		Response response=requestSpecification.post();
		System.out.println(response.getBody());
		Assert.assertEquals(response.statusCode(),200);
		System.out.println(response.statusLine());
		System.out.println("body message" + response.asPrettyString());
		
		
		
		
	}
}
