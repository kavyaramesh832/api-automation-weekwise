package crudOperations_PetStore;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Pet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// pre-condition
		
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"Scooby\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"available\"\r\n"
				+ "}")
		
		//HTTP method
		
		.when()
		.post("https://petstore.swagger.io/v2/pet")
		
		.then()
		.statusCode(200)
		.log().all();
	}

}
