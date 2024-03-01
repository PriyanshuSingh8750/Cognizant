package pageObject;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.excelUtils;

public class WebDevelopmentPage extends BasePage{
	public WebDevelopmentPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="(//label[@class=\"cds-checkboxAndRadio-label\"])[5]")
	WebElement EnglishOption;
	
	@FindBy(xpath="//span[text()='Beginner']")
	WebElement Level;
	
	@FindBy(xpath="(//h3[@class='cds-CommonCard-title css-1sktkql'])[1]")
	WebElement FirstCourse;
	
	@FindBy(xpath="(//h3[@class='cds-CommonCard-title css-1sktkql'])[2]")
	WebElement SecondCourse;
	
	@FindBy(xpath="//h1[@class='cds-119 cds-Typography-base css-1xy8ceb cds-121']")
	WebElement CourseTitle;
	

	
	@FindBy(xpath="(//div[@class='css-lt1dx1'])[2]/div[1]/div")
	WebElement RatingType1;
	
	@FindBy(xpath="(//div[@class='cds-119 cds-Typography-base css-h1jogs cds-121'])[1]")
	WebElement RatingType2;
	
	@FindBy(xpath="(//div[@class='css-lt1dx1'])[2]/div[3]")
	WebElement DurationType1;
	
	@FindBy(xpath="//div[@class='cds-119 css-1h3hs08 cds-121']")
	WebElement DurationType2;
	

	public static JavascriptExecutor js=(JavascriptExecutor) driver;
	
	
	public void waitForElementVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
	
	public void selectLanguage() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(EnglishOption));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js.executeScript("arguments[0].click();",EnglishOption);
	}
	public void scrollTillPixel(int pixel) {
		
		js.executeScript("window.scrollBy(0,"+pixel+");");
	}
	public void selectLevel() {
		Level.click();
	}
	public void clickOnFirstCourse() {
		waitForElementVisible(FirstCourse);
		js.executeScript("arguments[0].click();",FirstCourse);
	}
	public void clickOnSecondCourse() {
		waitForElementVisible(SecondCourse);
		js.executeScript("arguments[0].click();",SecondCourse);
	}
	
	public void printingDetailsCourse1() throws IOException {
		String course =CourseTitle.getText();
		System.out.println(course);
		excelUtils.setCellData("./Excel/Excel2.xlsx", "CourseDetails", 1, 0,course);
		
		try {
			waitForElementVisible(RatingType1);
			System.out.println(RatingType1.getText());
			waitForElementVisible(DurationType1);
			System.out.println(DurationType1.getText());
			String rating=RatingType1.getText();
			String Duration=DurationType1.getText();
			excelUtils.setCellData("./Excel/Excel2.xlsx", "CourseDetails", 2, 0, rating);
			excelUtils.setCellData("./Excel/Excel2.xlsx", "CourseDetails", 3, 0, Duration);
		}catch(Exception e){
			waitForElementVisible(RatingType2);
			JavascriptExecutor ex=(JavascriptExecutor) driver;
			ex.executeScript("window.scrollIntoView(true);",RatingType2);
			System.out.println(RatingType2.getText());
			waitForElementVisible(DurationType2);
			System.out.println(DurationType2.getText());
			String rating=RatingType2.getText();
			String Duration=DurationType2.getText();
			excelUtils.setCellData("./Excel/Excel2.xlsx", "CourseDetails", 2, 0, rating);
			excelUtils.setCellData("./Excel/Excel2.xlsx", "CourseDetails", 3, 0, Duration);
		}
	
	    
	}
	public void printingDetailsCourse2() throws IOException {
		
		System.out.println(CourseTitle.getText());
		excelUtils.setCellData("./Excel/Excel2.xlsx", "CourseDetails", 4, 0, CourseTitle.getText());
		try {
			waitForElementVisible(RatingType1);
			System.out.println(RatingType1.getText());
			waitForElementVisible(DurationType1);
			System.out.println(DurationType1.getText());
			String rating=RatingType1.getText();
			String Duration=DurationType1.getText();
			excelUtils.setCellData("./Excel/Excel2.xlsx", "CourseDetails", 5, 0, rating);
			excelUtils.setCellData("./Excel/Excel2.xlsx", "CourseDetails", 6, 0, Duration);
		}catch(Exception e){
			waitForElementVisible(RatingType2);
			JavascriptExecutor ex=(JavascriptExecutor) driver;
			ex.executeScript("window.scrollIntoView(true);",RatingType2);
			System.out.println(RatingType2.getText());
			waitForElementVisible(DurationType2);
			System.out.println(DurationType2.getText());
			String rating=RatingType2.getText();
			String Duration=DurationType2.getText();
			excelUtils.setCellData("./Excel/Excel2.xlsx", "CourseDetails", 5, 0, rating);
			excelUtils.setCellData("./Excel/Excel2.xlsx", "CourseDetails", 6, 0, Duration);
		}
		
	}
	public void tabSwitchToFirstCourse() {
		String currentWindowHandle=driver.getWindowHandle();
		Set<String> allWindowHandles=driver.getWindowHandles();
		for(String windowHandle:allWindowHandles) {
			if(!windowHandle.equals(currentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
	}
	public void tabSwitchToDefaultPage() {
		 driver.switchTo().window(driver.getWindowHandles().iterator().next());	
		 }
	public void tabSwitchToSecondCourse() {
		 Set<String> windowHandles = driver.getWindowHandles();
		    Iterator<String> iterator = windowHandles.iterator();
		    String lastWindowHandle = null;
		    while (iterator.hasNext()) {
		        lastWindowHandle = iterator.next();
		    }
		    if (lastWindowHandle != null) {
		        driver.switchTo().window(lastWindowHandle);
		    }	
		    
	}
	
}
