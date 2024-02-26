package testValidation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PostWithMultiplePayloadsFromProperties {
    public static void main(String[] args) throws IOException {
        // Load properties file
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/testValidation/config.properties");
        properties.load(fileInputStream);
        fileInputStream.close();

        // Iterate through each payload
        for (int i = 1; i <= properties.size(); i++) {
            String payloadKey = "payload" + i;
            String payload = properties.getProperty(payloadKey);
            
            String urString="https://reqres.in/api/users";

            // Send POST request
            Response response = RestAssured.given()
                    .contentType(ContentType.JSON)
                    .body(payload)
                    .post(urString);

            // Print response
            System.out.println("Payload " + i + " - Response status code: " + response.getStatusCode());
            System.out.println("Payload " + i + " - Response body: " + response.getBody().asPrettyString());
        }
    }
}
