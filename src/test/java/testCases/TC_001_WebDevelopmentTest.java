package testCases;

import java.io.IOException;

import org.testng.annotations.Test;


import pageObject.CourseraHome;
import pageObject.WebDevelopmentPage;
import testBase.BaseClass;

public class TC_001_WebDevelopmentTest extends BaseClass{
	@Test(priority = 1, groups= {"sanity"})
	public void enterCourseNameAndSearch() throws Exception {
		BaseClass.getLogger().info("Starting TC_001_WebDevelopment - enterCourseNameAndSearch");
	    
	        CourseraHome ch = new CourseraHome(driver);
	        
	        ch.enterCourseName();
	        ch.clickSearch();
	       
	   
	}

	
	@Test(priority=2)
      public void selectLanguage() throws Exception {
		BaseClass.getLogger().info("Starting TC_001_WebDevelopment - selectLanguage");
	  
	    WebDevelopmentPage wp = new WebDevelopmentPage(driver);
	    Thread.sleep(3000);
	    wp.selectLanguage();
	}

	@Test(priority=3)
	public void scrollAfterLanguageSelection() {
		BaseClass.getLogger().info("Starting TC_001_WebDevelopment - scrollAfterLanguageSelection");
	  
	    WebDevelopmentPage wp = new WebDevelopmentPage(driver);
	    wp.scrollTillPixel(700);
	}

	@Test(priority=4)
	public void selectLevel() {
		BaseClass.getLogger().info("Starting TC_001_WebDevelopment - selectLevel");
	  
	    WebDevelopmentPage wp = new WebDevelopmentPage(driver);
	    wp.selectLevel();
	}

	@Test(priority=5)
	public void scrollAfterLevelSelection() {
		BaseClass.getLogger().info("Starting TC_001_WebDevelopment - scrollAfterLevelSelection");
	  
	    WebDevelopmentPage wp = new WebDevelopmentPage(driver);
	    wp.scrollTillPixel(60);
	}
	@Test(priority=6)
	public void clickOnFirstCourse() {
	    BaseClass.getLogger().info("Starting TC_001_WebDevelopment - Click on First Course");
	    WebDevelopmentPage wp = new WebDevelopmentPage(driver);
	    wp.clickOnFirstCourse();
	}
	
	@Test(priority=7)
	public void tabSwitchFirstCourse() {
	    BaseClass.getLogger().info("Starting TC_001_WebDevelopment - TabSwitch to First Course");
	    WebDevelopmentPage wp= new WebDevelopmentPage(driver);
	    wp.tabSwitchToFirstCourse();
	}

	@Test(priority = 8)
	public void Course1Details() throws IOException {
	    BaseClass.getLogger().info("Starting TC_001_WebDevelopment - Course1printDetails");
	   
	        WebDevelopmentPage wp = new WebDevelopmentPage(driver);
	        wp.printingDetailsCourse1();
	  
	}
	@Test(priority=9)
	public void tabSwitchDefaultPage() {
	    BaseClass.getLogger().info("Starting TC_001_WebDevelopment - TabSwitch to Default Page");
	    WebDevelopmentPage wp= new WebDevelopmentPage(driver);
	    wp.tabSwitchToDefaultPage();
	}
	@Test(priority=10)
	public void clickOnSecondCourse() {
	    BaseClass.getLogger().info("Starting TC_001_WebDevelopment - Click on Second Course");
	    WebDevelopmentPage wp = new WebDevelopmentPage(driver);
	    wp.clickOnSecondCourse();
	}

	@Test(priority=11)
	public void tabSwitchSecondCourse() {
	    BaseClass.getLogger().info("Starting TC_001_WebDevelopment - TabSwitch to Second Course");
	    WebDevelopmentPage wp= new WebDevelopmentPage(driver);
	    wp.tabSwitchToSecondCourse();
	}
	@Test(priority=12)
	public void Course2Details() throws IOException {
		BaseClass.getLogger().info("Starting TC_001_WebDevelopment - Course2printDetails");
		
		WebDevelopmentPage wp = new WebDevelopmentPage(driver);
		wp.printingDetailsCourse2();
		
	}
	@Test(priority=13)
	public void tabSwitchDefaultPageAgain() {
	    BaseClass.getLogger().info("Starting TC_001_WebDevelopment - Again TabSwitch to Default Page");
	    WebDevelopmentPage wp= new WebDevelopmentPage(driver);
	    wp.tabSwitchToDefaultPage();
	}
}
