package pageObject;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.excelUtils;

public class LanguageLearning extends BasePage {
	public LanguageLearning(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//input[@placeholder='What do you want to learn?']")
	WebElement SearchArea;
	
	@FindBy(xpath="//button[@aria-label='Show more Language options']")
	WebElement ShowMoreButton;
	
	@FindBy(xpath = "(//span[text()='Close'])[2]")
	WebElement closeLang ;
	
//	@FindBy(xpath="//*[@id=\"search-results-header-wrapper\"]/div/div[1]/div/div[3]/div[1]/div[2]")
	@FindBy(xpath="//*[@id=\"checkbox-group\"]/div")
	List<WebElement> Languages;
	
	@FindBy(xpath = "//*[@data-testid='search-filter-group-Level']//div[1]/div[1]/div")
	List<WebElement> Levels;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public void waitForElementVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
	
	public void search() throws InterruptedException, Exception {
		SearchArea.click();
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		actions.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(4000);
		String text = excelUtils.getCellData("./Excel/Excel1.xlsx", "Sheet1", 0, 1);

		SearchArea.sendKeys(text);
		SearchArea.sendKeys(Keys.ENTER);
//		Thread.sleep(5000);
		
//		

	}
	public void showmore() throws InterruptedException {
		
		
		waitForElementVisible(ShowMoreButton);
     	js.executeScript("arguments[0].click();",ShowMoreButton);
		//ShowMoreButton.click();
		
	}
	public void ExtractLanguage() throws IOException {
		
	
		//Languages***************************************
		

		  int rowNum = 1;
		    for (WebElement l : Languages) {
		        String language = l.getText();
		        try {
//			        
	 
		            excelUtils.setCellData("./Excel/Excel2.xlsx","Languages", rowNum, 0, language);
		            System.out.println(language);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		        rowNum++;
		    }
	        System.out.println("Total Number of Languages: "+Languages.size());
	 
		    js.executeScript("arguments[0].click();", closeLang);	
	 }
	public void levelList() {
	

	    int rowNum = 1;
	    for (WebElement l : Levels) {
	        String Levels = l.getText();
	        try {
	            excelUtils.setCellData("./Excel/Excel2.xlsx","Languages", rowNum, 1, Levels);
	            System.out.println(Levels);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        rowNum++;
	    }
        System.out.println("Total Number of Levels: "+Levels.size());
 
	}
	
}
