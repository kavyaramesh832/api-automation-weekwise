package assignment;

import io.restassured.RestAssured;

public class Update_an_employee_record {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		RestAssured.given()
		.body("{\"name\":\"Kamal\",\"salary\":\"200000,\"age\":\"25\"}")
		
		.when()
		.put("https://dummy.restapiexample.com/api/v1/update/21")
		
		.then()
		.statusCode(200)
		.log().all();


	}

}
