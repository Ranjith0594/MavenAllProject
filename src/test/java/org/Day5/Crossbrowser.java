package org.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	WebDriver driver;

	@Parameters()
	@Test
	public void LoginTest(String browserName) {
		if (browserName.equals("Chrome")) {
			driver=new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("crossTest");
	}
	
}
