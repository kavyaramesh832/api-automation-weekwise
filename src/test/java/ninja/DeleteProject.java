package ninja;

import io.restassured.RestAssured;

public class DeleteProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured
		.given()

		.when()
		.delete("http://49.249.28.218:8091/project/NH_PROJ_2952")

		.then()
		.statusCode(204)
		.log().all();

	}

}
