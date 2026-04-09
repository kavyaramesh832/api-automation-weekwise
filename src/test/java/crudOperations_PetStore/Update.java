package crudOperations_PetStore;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pre-condition
		
		RestAssured.given()
		.contentType(ContentType.JSON)
		.body("{\r\n"
				+ "  \"id\": 9223372036854775807,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"subramani\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"InStock\"\r\n"
				+ "}")
		
		//HTTP method
		.when()
		.put("https://petstore.swagger.io/v2/pet")
		
		//Response section
		
		.then()
		.statusCode(200)
		.log().all();
		
		

	}

}
