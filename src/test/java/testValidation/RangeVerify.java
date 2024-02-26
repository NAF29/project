package testValidation;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RangeVerify {

	@Test
	public void orderRange() {
		
		RestAssured.baseURI="https://petstore.swagger.io";
		RestAssured.basePath="/v2/store/order";
		
		RequestSpecification request=RestAssured.given();
		
		HashMap<String, Object> payload= new HashMap<String, Object>();
		payload.put("id", "1");
		payload.put("petId", "2");
		payload.put("quantity", "50");
		payload.put("shipDate", "2024-02-08T09:50:53.827Z");
		payload.put("status", "placed");
	
		System.out.println("The original hashMap follow :" + payload);
		System.out.println("The collection view as follow :" + payload.values());
		
		request.contentType("application/json");
		request.body(payload);
	
		Response response=request.post();
		System.out.println(response.getHeaders());
		System.out.println(response.getBody().asPrettyString());
		Assert.assertEquals(response.statusCode(),200);
		
		for(String iString : payload.keySet()) {
			System.out.println(iString);
			System.out.println("key :" + iString + "  Value :" + payload.get(iString) );
		}
			for(Object vString: payload.values()) {
				System.out.println(vString);
			
		}
			

	}

}
