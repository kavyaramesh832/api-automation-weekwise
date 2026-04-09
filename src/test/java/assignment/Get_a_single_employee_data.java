package assignment;

import io.restassured.RestAssured;

public class Get_a_single_employee_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
RestAssured.given()
		
		
		.when()
		.get("https://dummy.restapiexample.com/api/v1/employee/1")
		
		.then()
		.statusCode(200)
		.log().all();
	}

}
