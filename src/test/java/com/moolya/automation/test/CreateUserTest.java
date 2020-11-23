package com.moolya.automation.test;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import org.json.simple.JSONObject;
import org.junit.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.apache.http.HttpStatus;

public class CreateUserTest {

	@Test
	public void CreateUserAPI() {

		JSONObject request = new JSONObject();
		request.put("name", "morpheus");
		request.put("job", "leader");

		System.out.println(request);
		System.out.println(request.toString());

		Response response = given().body(request.toJSONString()).when().post("https://reqres.in/api/users");
		Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_CREATED);
		
		System.out.println(response.body().asPrettyString());

	}

}
