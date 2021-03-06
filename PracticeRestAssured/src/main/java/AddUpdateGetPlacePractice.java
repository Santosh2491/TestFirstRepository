import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.Payloads;
import files.Reusable;

public class AddUpdateGetPlacePractice {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
	
	System.out.println("---------- Adding Place ---------");	
	String addResp = 
		given()
			.queryParam("key", "qaclick123")
			.header("Content-Type","application/json")
			.body(Payloads.addPayload())
		.when()
			.post("maps/api/place/add/json")
		.then()
			.log().all()
			.assertThat()
			.statusCode(200)
			.body("scope", equalTo("APP"))
			.extract().response().asString();
			
	JsonPath j1 = Reusable.rawStringToJSON(addResp);
	String placeId = j1.getString("place_id");
	System.out.println(placeId);
	
	System.out.println("---------- Updating Address ---------");
	String newAddress = "150 Street New York";
		
		given()
		 	.queryParam("key", "qaclick123")
		 	.header("Content-Type","application/json")
		 	.body(Payloads.updatePayload(placeId, newAddress))
		.when()
			.put("maps/api/place/update/json")
		.then()
			.log().all()
			.assertThat()
			.statusCode(200)
			.body("msg", equalTo("Address successfully updated"));
	
	System.out.println("---------- Get Place ---------");	
	
	String respGet = 
		given()
	 		.queryParam("key", "qaclick123")
		 	.queryParam("place_id", placeId)
		 	.header("Content-Type","application/json")
		 	
	   .when()
			.put("maps/api/place/get/json")
	   .then()
			.log().all()
			.assertThat()
			.statusCode(200)
			.extract().response().asString();
	
	JsonPath j2 = Reusable.rawStringToJSON(respGet);
	String updatedActualAddress = j2.getString("address");
	
	Assert.assertEquals(newAddress, updatedActualAddress);
	System.out.println("New Address: "+newAddress+" ---- ActualAddress: "+updatedActualAddress);

	}

}
