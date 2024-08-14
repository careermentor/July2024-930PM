package org.wipro.fedexcouw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.fedexcouw.utilities.ReadPropFiles;

public class LoginPages 
{

	WebDriver driver;
	
	public LoginPages(WebDriver driver)
	{
		
		this.driver = driver;
	}

	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(ReadPropFiles.readelement("login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropFiles.readelement("login_paasord_name"))).sendKeys(pass);
		
		
	}
	
	public void click_login_button() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFiles.readelement("login_loginbttn_css"))).click();
		
	}
	
}
