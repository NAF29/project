package testValidation;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FileUploadBinaryFile {

	@Test
	public void uploadBinaryFile() {

		File file = new File("/Users/nafis/eclipse/RestAssuredApi/fileuplaodImages/download.jpeg");

		Response response = RestAssured.given().multiPart("file", file, "multipart/form/data")
				.post("https://the-internet.herokuapp.com/upload").thenReturn();
		System.out.println(response.andReturn().getBody().asPrettyString());

	}

}
