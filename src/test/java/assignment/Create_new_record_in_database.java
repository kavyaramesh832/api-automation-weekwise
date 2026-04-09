package assignment;

import io.restassured.RestAssured;

public class Create_new_record_in_database {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.given()
		.body("{\"name\":\"vimal\",\"salary\":\"150000,\"age\":\"23\"}")
		
		.when()
		.post("https://dummy.restapiexample.com/api/v1/create")
		
		.then()
		.statusCode(200)
		.log().all();

	}

}
