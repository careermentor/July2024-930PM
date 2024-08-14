package org.wipro.fedexcouw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.fedexcouw.utilities.ReadPropFiles;

public class SignupPage 
{

	WebDriver driver;
	
	public SignupPage(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	public void click_createnewaccount_button() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("login_createnewaccount_xpath"))).click();
		
	}

	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropFiles.readelement("signup_firstname_name"))).sendKeys(fname);
	}
	
	public void select_dob_day_name(String dob_day) throws Exception
	{
		Select dob_day1 = new Select(driver.findElement(By.name(ReadPropFiles.readelement("signup_birthday_day_name"))));
		dob_day1.selectByVisibleText(dob_day);
	}
	
	public void gender_male() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("signup_male_xpath"))).click();
	}
	
	
	
}
