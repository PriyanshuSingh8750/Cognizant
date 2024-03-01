package pageObject;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.excelUtils;

public class ForEnterprise extends BasePage{

	public ForEnterprise(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="(//a[@class='rc-SubFooterSection__content-column-link-text'])[58]")
	WebElement ForEnterprise;
	@FindBy(xpath="(//a[@class='rc-GlobalFooter_column_list_item_link'])[2]")
	WebElement WhatWeOfferOption;
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root jss1 jss104 MuiButton-contained MuiButton-containedPrimary MuiButton-disableElevation']")
	WebElement LearnMoreButton;
	
	@FindBy(xpath="(//h2)[7]")
	WebElement h2;
	@FindBy(xpath="//input[@name='FirstName']")
	WebElement FirstName;
	@FindBy(xpath="//input[@name='LastName']")
	WebElement LastName;
	@FindBy(xpath="//input[@name='Email']")
	WebElement Email;
	@FindBy(xpath="//input[@name='Phone']")
	WebElement Phone;
	@FindBy(xpath="//select[@name='Institution_Type__c']")
	WebElement Institution;
	@FindBy(xpath="//*[@id='Institution_Type__c']/option[3]")
	WebElement Option;
	@FindBy(xpath="//input[@name='Company']")
	WebElement Job;
	@FindBy(xpath="//select[@name='Title']")
	WebElement Title;
	@FindBy(xpath="//*[@id='Title']/option[13]")
	WebElement TitleOption;
	@FindBy(xpath="//select[@name='Department']")
	WebElement Department;
	@FindBy(xpath="//*[@id='Department']/option[2]")
	WebElement DepartmentOption;
	@FindBy(xpath="//select[@name='What_the_lead_asked_for_on_the_website__c']")
	WebElement DescribeOption;
	@FindBy(xpath="//*[@id='What_the_lead_asked_for_on_the_website__c']/option[6]")
	WebElement TechSupport;
	@FindBy(xpath="//select[@name='Country']")
	WebElement Country;
	@FindBy(xpath="//*[@id='Country']/option[106]")
	WebElement India;
	@FindBy(xpath="//select[@name='State']")
	WebElement State;
	@FindBy(xpath="//*[@id='State']/option[30]")
	WebElement StateOption;
	@FindBy(xpath="//button[@class='mktoButton']")
	WebElement SubmitButton;
	@FindBy(xpath="//div[@role='alert' and contains(@class, 'mktoErrorMsg')]")
	WebElement Error;
	public void ReachForm() throws IOException {
		driver.get("https://www.coursera.org/");
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);",ForEnterprise);
		executor.executeScript("arguments[0].click();",ForEnterprise);
		executor.executeScript("arguments[0].scrollIntoView(true);",WhatWeOfferOption);
		executor.executeScript("arguments[0].click();",WhatWeOfferOption);
	
		executor.executeScript("arguments[0].scrollIntoView(true);",LearnMoreButton);
		executor.executeScript("arguments[0].click();",LearnMoreButton);
		
		executor.executeScript("arguments[0].scrollIntoView(true);",h2);
		
		

	}
	public void fillForm() throws IOException {
		String fn=excelUtils.getCellData("./Excel/Excel1.xlsx", "Sheet1",0 ,1 );
		FirstName.sendKeys(fn);
		
		String ln=excelUtils.getCellData("./Excel/Excel1.xlsx", "Sheet1",0 ,2 );
		LastName.sendKeys(ln);
		
		String em=excelUtils.getCellData("./Excel/Excel1.xlsx", "Sheet1",0 ,3 );
		Email.sendKeys(em);
		
		String pn=excelUtils.getCellData("./Excel/Excel1.xlsx", "Sheet1",0 ,4 );
		Phone.sendKeys(pn);
		
		Institution.click();
		
		Option.click();
		
		String cl=excelUtils.getCellData("./Excel/Excel1.xlsx", "Sheet1",0 ,5 );
		Job.sendKeys(cl);
		//job
		Title.click();
		//student
		TitleOption.click();
		//department
		Department.click();
		//Academic affair
		DepartmentOption.click();
		//what best describes
		DescribeOption.click();
		//Tech Support
		TechSupport.click();
		//Country
		Country.click();
		//India
		India.click();
		//State
		State.click();
		StateOption.click();
		
	}
	public void clickSubmit() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",SubmitButton);
	}
	public void captureError() throws IOException {
		String error=Error.getText();
		excelUtils.setCellData("./Excel/Excel2.xlsx","ErrorMessage", 0, 0, error);
		System.out.println(error);
	}
}
