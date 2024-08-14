package org.xyz.auto.prj;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FetchDataRunTime 
{

	WebDriver driver;
	
	@Test
	public void fetchdata() throws Exception
	{
		
		driver = new ChromeDriver();  //launch a chrome browser;
		
		String ExpURL="https://www.facebook.com/";
		
		driver.get(ExpURL);
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		Assert.assertEquals(ActURL, ExpURL);
		
		String ExpTitle = "Facebook – log in or sign up";
		
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		
		Assert.assertEquals(ActTitle, ExpTitle);
		
		
		String ExpUname="Email address or phone number";
		String ActUname = driver.findElement(By.id("email")).getAttribute("placeholder");
				
		Assert.assertEquals(ActUname, ExpUname);
		
		String ExpLogin = "Log in";
		String ActLogin = driver.findElement(By.name("login")).getText();
		Assert.assertEquals(ActLogin, ExpLogin);
		
		Point loginloc = driver.findElement(By.name("login")).getLocation();
		System.out.println(loginloc);
		
		System.out.println(driver.getPageSource());
		
		
	}
		
}
