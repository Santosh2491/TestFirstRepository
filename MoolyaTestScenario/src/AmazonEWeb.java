import java.util.concurrent.TimeUnit;

public class AmazonEWeb {

	public static void main(String[] args) {
		
		
//		use before test annotation launch chrome browser and use @test annotation 
//		land on amazon.com website then search for iphone12 and display price of iphone on 
//		console finally quit the browser using after test annotation
		
		WebDriver driver;
		@BeforeTest
		public void launchBrowser(String Browser){
			if(browser.equals("Chrome")){
				System.setProperty("webdriver.chromedriver", <path of the schrome driver>);
				driver = new ChromeDriver;
			}
			<similarly we will check for other browsers>
		}
		
		@Test
		public void navigation(){
			driver.get("amazon.com");
			
			//after getting the locator for search box - say id=search
			driver.findElement(By.id("search")).sendKeys("iphone12");
			//getting the locator for search icon and click, if we have got xpath
			driver.findElement(By.xpath("//button[@id="search-icon"]")).click();
			
			driver.manage().implicitlywaut(20,TimeUnit.SECONDS);
			
			//gertting the count of search results
			List<WebElement> searhRes = driver.findElements(By.id("searchRes"));
			
			if(searchRes.size()>0){
				//get the locator for the iphone text
				String iphonePrice = driver.findElement(By.id("somevalue")).getText();
				System.out.println("Price of Iphone12 is: "+iphonePrice);
			}
			
			@AfterTest
			public void quitBrowser(){
				driver.quit();
			}
			
		}
		
	}

}
