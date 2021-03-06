import org.testng.Assert;

import io.restassured.path.json.JsonPath;

public class Practice2 {

	public static String mockPayload(){
		return "{\r\n" + 
				"\r\n" + 
				"\"dashboard\": {\r\n" + 
				"\r\n" + 
				"\"purchaseAmount\": 910,\r\n" + 
				"\r\n" + 
				"\"website\": \"rahulshettyacademy.com\"\r\n" + 
				"\r\n" + 
				"},\r\n" + 
				"\r\n" + 
				"\"courses\": [\r\n" + 
				"\r\n" + 
				"{\r\n" + 
				"\r\n" + 
				"\"title\": \"Selenium Python\",\r\n" + 
				"\r\n" + 
				"\"price\": 50,\r\n" + 
				"\r\n" + 
				"\"copies\": 6\r\n" + 
				"\r\n" + 
				"},\r\n" + 
				"\r\n" + 
				"{\r\n" + 
				"\r\n" + 
				"\"title\": \"Cypress\",\r\n" + 
				"\r\n" + 
				"\"price\": 40,\r\n" + 
				"\r\n" + 
				"\"copies\": 4\r\n" + 
				"\r\n" + 
				"},\r\n" + 
				"\r\n" + 
				"{\r\n" + 
				"\r\n" + 
				"\"title\": \"RPA\",\r\n" + 
				"\r\n" + 
				"\"price\": 45,\r\n" + 
				"\r\n" + 
				"\"copies\": 10\r\n" + 
				"\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"]\r\n" + 
				"\r\n" + 
				"}";
	}

	public static void main(String[] args) {

		/*1. Print No of courses returned by API
		2.Print Purchase Amount
		3. Print Title of the first course
		4. Print All course titles and their respective Prices
		5. Print no of copies sold by RPA Course
		6. Verify if Sum of all Course prices matches with Purchase Amount
		 */

		JsonPath js = new JsonPath(Practice2.mockPayload());

		//1.Print No of courses returned by API
		int count = js.getInt("courses.size()"); 
		System.out.println("No. of courses: "+count);

		//2.Print Purchase Amount
		int amount = js.getInt("dashboard.purchaseAmount");
		System.out.println("Purchase Amount: "+amount);

		//3.Print Title of the first course
		String firstCourseTitle = js.getString("courses[0].title");
		System.out.println("First course title: "+firstCourseTitle);

		//4.Print All course titles and their respective Prices
		for(int i=0;i<count;i++){
			String title = js.getString("courses["+i+"].title");
			int price = js.getInt("courses["+i+"].price");
			System.out.println(title+": "+price);
		}

		//5.Print no of copies sold by RPA Course
		for(int i=0;i<count;i++){
			String title = js.getString("courses["+i+"].title");
			if(title.equals("RPA")){
				int copiesSold = js.getInt("courses["+i+"].copies");	
				System.out.println("Number of copies sold for "+title+": "+copiesSold);
			}	
		}

		//6.Verify if Sum of all Course prices matches with Purchase Amount
		int sum=0;
		for(int i=0;i<count;i++){
			int price = js.getInt("courses["+i+"].price");
			int copiesSold = js.getInt("courses["+i+"].copies");
			int cost = price*copiesSold;
			sum=sum+cost;
		}
		System.out.println("Calculated cost: "+sum);
		Assert.assertEquals(amount,sum);
		
	}

}

