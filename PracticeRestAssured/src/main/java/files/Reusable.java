package files;

import io.restassured.path.json.JsonPath;

public class Reusable {
	
	public static JsonPath rawStringToJSON(String JSON){
		JsonPath js = new JsonPath(JSON);
		return js;
	}
}
