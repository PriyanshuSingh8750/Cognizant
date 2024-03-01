package stepDefinitions;
 
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.LanguageLearning;
 
public class Step2_LangLearnPage {

    LanguageLearning ll=new LanguageLearning(BaseClass.getDriver());
 
 
    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() throws InterruptedException {
    }
 
    @When("the user searches for language learning courses")
    public void the_user_searches_for_language_learning_courses() throws Exception {
    	BaseClass.getLogger().info("Starting TC_001_WebDevelopment - Searching Language Learning");
    	ll.search();
        ll.showmore();
    }
	@When("they extract all available languages and their total counts")
	public void they_extract_all_available_languages_and_their_total_counts() throws Exception {
		BaseClass.getLogger().info("Starting TC_001_WebDevelopment - Extracting Languages");
		Thread.sleep(3000);
		ll.ExtractLanguage();
	}
 
	@When("they extract all different levels and their total counts")
	public void they_extract_all_different_levels_and_their_total_counts() {
		BaseClass.getLogger().info("Starting TC_001_WebDevelopment - Extracting Levels");
		ll.levelList();
	}
	
 
 
 
}