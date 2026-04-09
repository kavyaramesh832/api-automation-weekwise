package ninja;
import io.restassured.RestAssured;
public class CreateProject {

	public static void main(String[] args) {

		String projectName = "practice_" + System.currentTimeMillis();

		String body = "{\n" +
				"\"createdBy\":\"Kavya\",\n" +
				"\"projectName\":\"" + projectName + "\",\n" +
				"\"status\":\"Created\",\n" +
				"\"teamSize\":0\n" +
				"}";

		RestAssured.given()
		.contentType("application/json")
		.body(body)

		.when()
		.post("http://49.249.28.218:8091/addProject")

		.then()
		.statusCode(201)
		.log().all();
		
	}
}