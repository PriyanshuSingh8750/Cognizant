package stepDefinitions;

import org.openqa.selenium.WebDriver;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.CourseraHome;
import pageObject.WebDevelopmentPage;
 
public class Step1_WebDevelopPage {
    static WebDriver driver;
	CourseraHome ch;
	WebDevelopmentPage wp;
    @Given("the user is on the homepage of the Coursera website")
    public void the_user_is_on_the_homepage_of_the_Coursera_website() {
    	BaseClass.getLogger().info("Starting TC_001_WebDevelopment - Coursera Home Page");
    	driver = BaseClass.getDriver();
		ch = new CourseraHome(BaseClass.getDriver());
		wp= new WebDevelopmentPage(BaseClass.getDriver());
    }
 
    @When("the user searches for web development courses")
    public void the_user_searches_for_web_development_courses() throws Exception {
    	  BaseClass.getLogger().info("Starting TC_001_WebDevelopment - Searching web Development");
    	  ch.enterCourseName();
	      ch.clickSearch();   	
    }
 
    @When("the user filters the courses for English language")
    public void the_user_filters_the_courses_for_english_language() {
    	BaseClass.getLogger().info("Starting TC_001_WebDevelopment - Selecting English Language");
    	wp.selectLanguage();    
	}
 
    @When("the user filters the courses for beginners level")
    public void the_user_filters_the_courses_for_beginners_level() {
    	BaseClass.getLogger().info("Starting TC_001_WebDevelopment - Selecting Beginner Level");
    	wp.scrollTillPixel(700);
    	wp.selectLevel();
    	wp.scrollTillPixel(60);
    }
 
    @When("the user selects the first course displayed to take its title, rating, and duration")
    public void the_user_selects_the_first_course_displayed_to_take_its_title_rating_and_duration() throws Exception {
    	BaseClass.getLogger().info("Starting TC_001_WebDevelopment - Extracting Details for First Course");
    	wp.clickOnFirstCourse();
    	wp.tabSwitchToFirstCourse();
    	wp.printingDetailsCourse1();
    }
 
    @When("the user selects the second course displayed to take its title, rating, and duration")
    public void the_user_selects_the_second_course_displayed_to_take_its_title_rating_and_duration() throws Exception {
    	BaseClass.getLogger().info("Starting TC_001_WebDevelopment - Extracting Details for Second Course");
    	wp.tabSwitchToDefaultPage();
    	wp.clickOnSecondCourse();
    	wp.tabSwitchToSecondCourse();
    	wp.printingDetailsCourse2();
    	wp.tabSwitchToDefaultPage();
    }
 
  
 
    
}