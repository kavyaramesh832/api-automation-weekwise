package automation;

import io.restassured.RestAssured;

public class GetAllProductsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.given()
		
		.when()
		.get("https://automationexercise.com/api/productsList")
		
		.then()
		.statusCode(200)
		.log().all();
	}

}
