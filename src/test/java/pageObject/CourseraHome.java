package pageObject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.excelUtils;



public class CourseraHome extends BasePage {
	public CourseraHome(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//input[@placeholder='What do you want to learn?']")
	WebElement SearchArea;

	@FindBy(xpath="//button[@class='nostyle search-button']//div[@class='magnifier-wrapper']//*[name()='svg']")
	WebElement SearchButton;
	
	public void enterCourseName() throws Exception {
		String name = excelUtils.getCellData("./Excel/Excel1.xlsx", "Sheet1", 0, 0);
		SearchArea.sendKeys(name);
	}
	
	public void clickSearch() {
		SearchButton.click();
	}
	
}
