package org.Day3;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class progOne {
	static WebDriver driver;
	File file = new File("D:\\screenshots");

	@BeforeClass
	public static void browserIntialization() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}

	@Before
	public void beforescreenShot() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		FileUtils.cleanDirectory(file);
		FileUtils.copyFileToDirectory(screenshotAs, file);
	}

	@After
	public void afterscreenShot() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		FileUtils.copyFileToDirectory(screenshotAs, file);
	}

	@Test
	public void businesslogic() {
		driver.findElement(By.id("email")).sendKeys("username");
		driver.findElement(By.id("pass")).sendKeys("password");
	}
}
