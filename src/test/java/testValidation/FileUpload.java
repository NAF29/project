package testValidation;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FileUpload {

	@Test
	public void uploadFile() {

		File fileUpload = new File("/Users/nafis/eclipse/RestAssuredApi/fileuplaodImages/sample3.txt");

		RequestSpecification request = RestAssured.given();
		
		request.contentType("multipart/form-data");

		request.baseUri("http://httpbin.org/post");

		request.multiPart("file", fileUpload);

		Response response = request.post();

		System.out.println(response.getBody().asPrettyString());

		Assert.assertEquals(response.statusCode(), 200, "Check for status code");

	}
}
