package testcases;

import org.testng.annotations.Test;

import keywords.ApplicationKeywords;

public class CreatePortfolioTest {

	ApplicationKeywords aKey = new ApplicationKeywords();
	
	@Test
	public void CreatePortfolio(){
		aKey.openBrowser("Chrome");
		aKey.navigate("url");
	}
}
