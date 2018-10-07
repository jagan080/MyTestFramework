package com.myapi.test;

import java.io.File;
import java.io.IOException;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReqBuilder {

	

	public static String run() {
		ObjectMapper mapper = new ObjectMapper();

		//hard coding
		JerseyReqClass jsonJr = createDummyObject();
		
		//From excel to 

		try {
			// Convert object to JSON string and save into a file directly
			mapper.writeValue(new File("resource/testdata/req.json"), jsonJr);

			// Convert object to JSON string
			String jsonInString = mapper.writeValueAsString(jsonJr);
			System.out.println(jsonInString);

			// Convert object to JSON string and pretty print
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonJr);
			System.out.println(jsonInString);
			return jsonInString;

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static JerseyReqClass createDummyObject() {

		JerseyReqClass jr = new JerseyReqClass();

		jr.setTitle("API");
		jr.setBody("Test");

		return jr;

	}

}