package getMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetMethod {
	
	@Test
	public void get() {
		
		RestAssured.baseURI="https://conappdevapi.badabusiness.co.in/";
		String endPoint="admin-api/v1/sessions/session-report/17";
		
		String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOnsiZGF0YVZhbHVlcyI6eyJpZCI6NDg4NjYsImFkX2liY19pZCI6ODY4NTU4LCJhZF9jcF9pZCI6MCwiYWRfcGFyZW50IjoyMDU0MCwiYWRfbmFtZSI6IkFuanUgQWdhcndhbCIsImFkX3Bhc3N3b3JkIjoiYkM5UmIyWnNhalpPS3poUVlYTkZSbWRrZUU1aWR6MDkiLCJhZF9jb2RlIjoiQklBQTA0ODg2NiIsImFkX2VtYWlsIjoiQW5qdTI3LmFhQGdtYWlsLmNvbSIsImFkX21vYmlsZSI6IjkwODk1NTY4NjMiLCJhZF9wcm9maWxlIjoicHJvZC91cGxvYWRzL3Byb2ZpbGUvMjQxMV8xNjgxMjMwNDY4NDg0LmpwZWciLCJvbmJvYXJkX3N0ZXAiOjUsInBheW1lbnRfc3RhdHVzIjoxLCJkZXNpZ25hdGlvbiI6OTMsImNvdW50cnlfaWQiOjEwMCwiY291bnRyeV9jYWxsaW5nX2NvZGUiOiIrOTEiLCJjbHViX2lkIjoyLCJpc19iYnAiOm51bGwsImFncmVlbWVudF92NV91cGRhdGVkIjoiTiIsImVtYWlsX3ZlcmlmaWVkIjoiSSIsImFkX2RhdGUiOiIyMDIyLTExLTI2VDE4OjA4OjA4LjAwMFoifSwiX3ByZXZpb3VzRGF0YVZhbHVlcyI6eyJpZCI6NDg4NjYsImFkX2liY19pZCI6ODY4NTU4LCJhZF9jcF9pZCI6MCwiYWRfcGFyZW50IjoyMDU0MCwiYWRfbmFtZSI6IkFuanUgQWdhcndhbCIsImFkX3Bhc3N3b3JkIjoiYkM5UmIyWnNhalpPS3poUVlYTkZSbWRrZUU1aWR6MDkiLCJhZF9jb2RlIjoiQklBQTA0ODg2NiIsImFkX2VtYWlsIjoiQW5qdTI3LmFhQGdtYWlsLmNvbSIsImFkX21vYmlsZSI6IjkwODk1NTY4NjMiLCJhZF9wcm9maWxlIjoicHJvZC91cGxvYWRzL3Byb2ZpbGUvMjQxMV8xNjgxMjMwNDY4NDg0LmpwZWciLCJvbmJvYXJkX3N0ZXAiOjUsInBheW1lbnRfc3RhdHVzIjoxLCJkZXNpZ25hdGlvbiI6OTMsImNvdW50cnlfaWQiOjEwMCwiY291bnRyeV9jYWxsaW5nX2NvZGUiOiIrOTEiLCJjbHViX2lkIjoyLCJpc19iYnAiOm51bGwsImFncmVlbWVudF92NV91cGRhdGVkIjoiTiIsImVtYWlsX3ZlcmlmaWVkIjoiSSIsImFkX2RhdGUiOiIyMDIyLTExLTI2VDE4OjA4OjA4LjAwMFoifSwiX2NoYW5nZWQiOnt9LCJfb3B0aW9ucyI6eyJpc05ld1JlY29yZCI6ZmFsc2UsIl9zY2hlbWEiOm51bGwsIl9zY2hlbWFEZWxpbWl0ZXIiOiIiLCJyYXciOnRydWUsImF0dHJpYnV0ZXMiOlsiaWQiLCJhZF9pYmNfaWQiLCJhZF9jcF9pZCIsImFkX3BhcmVudCIsImFkX25hbWUiLCJhZF9wYXNzd29yZCIsImFkX2NvZGUiLCJhZF9lbWFpbCIsImFkX21vYmlsZSIsImFkX3Byb2ZpbGUiLCJvbmJvYXJkX3N0ZXAiLCJwYXltZW50X3N0YXR1cyIsImRlc2lnbmF0aW9uIiwiY291bnRyeV9pZCIsImNvdW50cnlfY2FsbGluZ19jb2RlIiwiY2x1Yl9pZCIsImlzX2JicCIsImFncmVlbWVudF92NV91cGRhdGVkIiwiZW1haWxfdmVyaWZpZWQiLCJhZF9kYXRlIl19LCJpc05ld1JlY29yZCI6ZmFsc2V9LCJpYXQiOjE3MDQ3MTY4MTksImV4cCI6MTcyMDI2ODgxOX0.1Ybeg6tpEevKJUKpgcIXOEGEGshUaMqL5NexMFd8Cp4";
		
		RequestSpecification requestSpecification=RestAssured.given();
		requestSpecification.header("Content-Type","application/json");
		requestSpecification.header("Authorization",token);	
		
		Response response= requestSpecification.get(endPoint);
		System.out.println(response.getBody());
		Assert.assertEquals(response.getStatusCode(),200);
		response.getStatusLine();
		
	}

}