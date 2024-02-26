package testValidation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostMethodValidation {

	@Test
	public void postValidtaiona() {

		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "api/users?page=2";

		RequestSpecification request = RestAssured.given();

		request.header("Content-Type", "application/json");
		Response response = request.get();
		System.out.println(response.getBody());
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		ValidatableResponse vla = response.then().log().all();
		System.out.println(vla);
		String cookieString = response.getCookie("session");
		System.out.println(cookieString);

	}
}
