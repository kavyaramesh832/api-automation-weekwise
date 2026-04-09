package crudOperations_PetStore;

import java.io.File;

import io.restassured.RestAssured;

public class UploadImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1= new File("C:\\Users\\kavya\\Downloads\\beautiful-rain-forest-ang-ka-nature-trail-doi-inthanon0-national-park-thailand-36703721.jpg");
		
		RestAssured.given()
		.pathParam("petId", 1)
		.multiPart("file",f1)
		.formParam("additionalMetadata", "Greenery")
		
		
		//HTTP Method
		.when()
		.post("https://petstore.swagger.io/v2/pet/{petId}/uploadImage")
		
			
		
		.then()
		.statusCode(200)
		.log().all();
		

	}

}