package crudOperations_PetStore;

import io.restassured.RestAssured;

public class GetByStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pre-conditions
				RestAssured.given()
				
				
				//HTTP Method
				.when()
				.get("https://petstore.swagger.io/v2/pet/findByStatus?status=sold")
				
					
				
				.then()
				.statusCode(200)
				.log().all();

	}

}
