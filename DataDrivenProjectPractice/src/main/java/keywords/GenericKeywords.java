package keywords;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericKeywords {
	public WebDriver driver;
	public Properties prop;

	public void openBrowser(String browserKey){
		if(browserKey.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Santosh A M\\Desktop\\Eclipse\\LatestChrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserKey.equals("Mozilla")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Santosh A M\\Desktop\\Eclipse\\LatestDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserKey.equals("Edge")) {
			//			System.setProperty("webdriver.edge.driver", "D:\\Common\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void navigate(String urlKey){
		System.out.println("Navigating to url: "+urlKey);
		driver.get(prop.getProperty(urlKey));
	}

	public void click(String locator){

	}

	public void type(String locator, String data){

	}
	
	public WebElement getElement(String locator){
		
		if(!isElementPresent(locator)){
			
		}
		if(!isElementVisible(locator)){
			
		}
		
		WebElement e=null;
		
		return e;
	}
	
	public boolean isElementPresent(String locator){
		WebDriverWait wait = new WebDriverWait(driver,10);
		try{
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
		}
		catch(Exception e){
			return false;
		}
		return true;
	}
	
	public boolean isElementVisible(String locator){
		WebDriverWait wait = new WebDriverWait(driver,10);
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
		}
		catch(Exception e){
			return false;
		}
		return true;
	}
}
