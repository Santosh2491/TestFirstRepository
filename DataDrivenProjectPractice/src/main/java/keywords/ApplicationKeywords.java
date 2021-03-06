package keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ApplicationKeywords extends ValidationKeywords{
	
	String propPath = System.getProperty("user.dir")+"//src//test//resources//project.properties";
	
	public ApplicationKeywords(){
		
		prop = new Properties();
		System.out.println(System.getProperty(("user.dir")));
		try {
			FileInputStream fis = new FileInputStream(propPath);
			prop.load(fis);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
