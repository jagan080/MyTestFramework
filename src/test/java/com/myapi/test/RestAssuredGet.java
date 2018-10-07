package com.myapi.test;

import org.json.JSONArray;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.get; 	
import com.jayway.restassured.response.Response;

public class RestAssuredGet {
	@Test
	public void getRequestFindCapital() throws JSONException {
		
		//make get request to fetch capital of norway
		Response resp = get("http://restcountries.eu/rest/v1/name/norway");
		
		//Fetching response in JSON
		JSONArray jsonResponse = new JSONArray(resp.asString());
		
		//Fetching value of capital parameter
		String capital = jsonResponse.getJSONObject(0).getString("capital");
		
		//Asserting that capital of Norway is Oslo
		Assert.assertEquals(capital, "Oslo");
	}
}
