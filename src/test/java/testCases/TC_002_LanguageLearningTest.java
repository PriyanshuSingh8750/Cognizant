package testCases;

import java.io.IOException;

import org.testng.annotations.Test;


import pageObject.LanguageLearning;
import testBase.BaseClass;

public class TC_002_LanguageLearningTest extends BaseClass{
	@Test(priority = 1,groups= {"sanity","regression"})
	public void searchLanguage() throws IOException, Exception {
	    BaseClass.getLogger().info("Starting TC_002_LanguageLearningTest - searchLanguage");
	   
	        LanguageLearning ll = new LanguageLearning(driver);
	       	ll.search();
	        ll.showmore();
	   
	}

	@Test(priority = 2,groups= {"regression"})
	public void ExtractLanguages() throws IOException {
	    BaseClass.getLogger().info("Starting TC_002_LanguageLearningTest - ExtractLanguages");
	    
	        LanguageLearning ll = new LanguageLearning(driver);
	        ll.ExtractLanguage();
	   
	}
	@Test(priority= 3,groups= {"regression"})
	public void ExtractLevels() {
		BaseClass.getLogger().info("Starting TC_002_LanguageLearningTest - ExtractLevels");
		LanguageLearning ll=new LanguageLearning(driver);
		ll.levelList();
	}
}
