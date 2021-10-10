import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import files.Payloads;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		String resp =	
			given()
				.log().all()
				.queryParam("key", "qaclick123")
				.header("Content-Type","application/json")
				.body(Payloads.addPayload())
			.when()
				.post("maps/api/place/add/json")
			.then()
				.assertThat()
				.statusCode(200)
				.body("scope", equalTo("APP"))
				.body("status", equalTo("OK"))
				.header("Server","Apache/2.4.18 (Ubuntu)")
				.extract().response().asString();
		
		JsonPath js = new JsonPath(resp);
		String placeId = js.getString("place_id");
		System.out.println(placeId);
		
		//****** Update Place ******//
		
		String updateAddress = "70 winter walk, USA";
		
		given()
			.log().all()
			.queryParam("key", "qaClick123")
			.header("Content-Type","application/json")
			.body("{\r\n" + 
					"\"place_id\":\""+placeId+"\",\r\n" + 
					"\"address\":\""+updateAddress+"\",\r\n" + 
					"\"key\":\"qaclick123\"\r\n" + 
					"}")
		.when()
			.put("maps/api/place/update/json")
		.then()
			.log().all()
			.assertThat()
			.statusCode(200)
			.body("msg", equalTo("Address successfully updated"));
		
		//****** Get Place ******//
	
		String response = 
			given()
				.log().all()
				.queryParam("key", "qaclick123")
				.queryParam("place_id", placeId)
				.header("Content-Type","application/json")
			.when()
				.get("maps/api/place/get/json")
			.then()
				.log().all()	
				.assertThat()
				.statusCode(200)
				.header("Server","Apache/2.4.18 (Ubuntu)")
				//.body("address", equalTo(updateAddress)); OR extracting the response and then comparing
				.extract().response().asString();
		
		JsonPath js1 = new JsonPath(response);
		String respAddress = js1.getString("address");
		
		if(updateAddress.equals(respAddress)){
			System.out.println("Adress updated successfully");
		}
		else{
			System.out.println("Adress was ntot updated successfully");
		}
		
	}

}
