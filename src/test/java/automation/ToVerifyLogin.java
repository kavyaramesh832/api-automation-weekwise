package automation;

import io.restassured.RestAssured;

public class ToVerifyLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
RestAssured.given()
		
		.when()
		.delete("https://automationexercise.com/api/verifyLogin")
		
		.then()
		.statusCode(200)
		.log().all();

	}

}
