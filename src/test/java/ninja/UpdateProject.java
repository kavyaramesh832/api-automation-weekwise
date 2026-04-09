package ninja;

import io.restassured.RestAssured;

public class UpdateProject {

	public static void main(String[] args) {

		String body = "{\n" +
				"\"createdBy\":\"kavi\",\n" +
				"\"projectName\":\"practice_updated success\",\n" +
				"\"status\":\"On Going process completed\",\n" +
				"\"teamSize\":0,\n" +
				"\"projectId\":\"NH_PROJ_2952\"\n" +
				"}";

		RestAssured
		.given()
		.contentType("application/json")
		.body(body)

		.when()
		.put("http://49.249.28.218:8091/project/NH_PROJ_2952")

		.then()
		.statusCode(200)
		.log().all();
	}
}