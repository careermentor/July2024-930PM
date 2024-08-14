package org.xyz.auto.prj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation 
{

	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		
		driver = new ChromeDriver();  //launch a chrome browser;
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	}
	
	
	@Test(enabled=false)
	public void validate_signupFunction() throws Exception
	{
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//Thread.sleep(5000);
		
		
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		
		
	}
	
	@Test(enabled=true)
	public void tw_project()
	{
		driver.findElement(By.name("fld_username")).sendKeys("java");
		driver.findElement(By.cssSelector("[value='office']")).click();
		
		
		WebElement abc = driver.findElement(By.name("sex"));
		
		
		Select gen = new Select(abc);
		
		int a = 20;
		System.out.println(a);
		
		System.out.println(20);
		
		
		//gen.selectByIndex(1); //Male
		//gen.selectByValue("2");
		gen.selectByVisibleText("Female");
		
		//gen.deselectAll();
		
		boolean checkbox = driver.findElement(By.name("terms")).isSelected();
		
		Assert.assertEquals(checkbox, false);
		
		driver.findElement(By.name("terms")).click();
		//driver.findElement(By.className("displayPopup")).click();
		
		boolean checkbox1 = driver.findElement(By.name("terms")).isSelected();
		
		Assert.assertEquals(checkbox1, true);
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		
		Select ct = new Select(driver.findElement(By.name("country")));
		ct.selectByVisibleText("United States");
		
		
		Select st = new Select(driver.findElement(By.name("state")));
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Florida"));
		
		System.out.print(checkbox1);
		
		st.selectByVisibleText("Hawaii");
		
	}
	
	@Test(enabled=false)
	public void validate_loginFunction()
	{
		driver.findElement(By.id("email")).sendKeys("modi.santosh@yahoo.com");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("user1");
		driver.findElement(By.name("pass")).sendKeys("pass12345");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
	}
	
}
