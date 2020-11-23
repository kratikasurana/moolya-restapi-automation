package com.moolya.automation.test;
import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.testng.annotations.Test;

public class DeleteUserTest {
	
	@Test
	public void testDeleteUserAPI() {
	
	JSONObject request = new JSONObject();
	given().
	body(request.toJSONString()).
	when().
	delete("https://reqres.in/api/users/2").
	then().statusCode(204).
	log().all();

}

}
