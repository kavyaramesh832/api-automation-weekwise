package automation;

import io.restassured.RestAssured;

public class ToAllBrandsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.given()
		
		.when()
		.put("https://automationexercise.com/api/brandsList")
		
		.then()
		.statusCode(200)
		.log().all();

	}

}
