package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.ForEnterprise;
import testBase.BaseClass;
public class TC_003_ForEnterpriseTest extends BaseClass{
	@Test(priority = 1,groups= {"sanity"})
	public void reachForm() throws IOException {
	    BaseClass.getLogger().info("Starting TC_003_LanguageLearningTest - reachForm");
	   
	        ForEnterprise fe = new ForEnterprise(driver);
	        fe.ReachForm();
	    
	}

	@Test(priority = 2)
	public void fillForm() throws IOException {
	    BaseClass.getLogger().info("Starting TC_003_LanguageLearningTest - fillForm");
	    
	        ForEnterprise fe = new ForEnterprise(driver);
	        fe.fillForm();
	  
	}
	@Test(priority=3)
	public void submit() {
		BaseClass.getLogger().info("Starting TC_003_LanguageLearningTest - Submit Button");
	    ForEnterprise fe = new ForEnterprise(driver);
	    fe.clickSubmit();
	}

	@Test(priority = 4)
	public void captureError() throws IOException {
	    BaseClass.getLogger().info("Starting TC_003_LanguageLearningTest - captureError");
	    
	        ForEnterprise fe = new ForEnterprise(driver);
	        fe.captureError();
	  
	}
	
}
