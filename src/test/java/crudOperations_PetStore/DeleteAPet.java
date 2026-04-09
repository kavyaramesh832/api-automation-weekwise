package crudOperations_PetStore;

import io.restassured.RestAssured;

public class DeleteAPet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pre-Condition
		
		RestAssured.given()
		
		//HTTP Method
		
		.when()
		.delete("https://petstore.swagger.io/v2/pet/9223372036854775807")
		
		//Response Section
		
		.then()
		.log().all();

	}

}
