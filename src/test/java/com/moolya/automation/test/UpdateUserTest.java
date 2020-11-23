package com.moolya.automation.test;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import org.json.simple.JSONObject;
import org.junit.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.apache.http.HttpStatus;

public class UpdateUserTest {
	
	@Test
	public void testUpdateUserAPI()
	{
		JSONObject request = new JSONObject();
		request.put("name", "morpheus");
		request.put("job", "zion resident");

		System.out.println(request);
		System.out.println(request.toString());

		
		Response response = given().body(request.toJSONString()).when().put("https://reqres.in/api/users");
		Assert.assertEquals(response.getStatusCode(), 200);
		
		System.out.println(response.body().asPrettyString());

	}

}
