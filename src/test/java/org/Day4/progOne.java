package org.Day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class progOne {

	
	
	static WebDriver driver;
	
	@Test(invocationCount=2, threadPoolSize=1)
	
	public static void browserLanuch() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
	
		driver.findElement(By.id("username")).sendKeys("Lakshran");
		driver.findElement(By.id("password")).sendKeys("Madhav@211022");
		driver.findElement(By.id("login")).click();
			
		List<WebElement> multipleDropDown = driver.findElements(By.xpath("//select[@class='search_combobox']"));

		for (int i = 0; i <multipleDropDown.size(); i++) {
			WebElement webElement = multipleDropDown.get(i);
			Select select = new Select(webElement);
			select.selectByIndex(2);
		}
		
		
		 driver.findElement(By.id("datepick_in")).clear();
		 driver.findElement(By.id("datepick_in")).sendKeys("01/07/2023");
		
		 driver.findElement(By.id("datepick_out")).clear();
		 driver.findElement(By.id("datepick_out")).sendKeys("03/07/2023");
		 
		 driver.findElement(By.id("Submit")).click();
		 
		 driver.findElement(By.id("radiobutton_0")).click();
		 driver.findElement(By.id("continue")).click();
		 
		 driver.findElement(By.id("first_name")).sendKeys("Ranjith");
		 driver.findElement(By.id("last_name")).sendKeys("K");
		 driver.findElement(By.id("address")).sendKeys("Chennai, Tamil Nadu");
		 driver.findElement(By.id("cc_num")).sendKeys("5865858123452562");
		 WebElement cctype = driver.findElement(By.id("cc_type"));
		 Select njk = new Select(cctype);
		 njk.selectByIndex(4);
		 
		 WebElement expdate = driver.findElement(By.xpath("//option[text()='May']"));
		 expdate.click();
		 
		 WebElement expYear = driver.findElement(By.xpath("//option[text()='2023']"));
		 expYear.click();
		 
		 driver.findElement(By.id("cc_cvv")).sendKeys("256");
		 driver.findElement(By.id("book_now")).click();
		 		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("order_no")));
		 WebElement orderno = driver.findElement(By.id("order_no"));
		 String attribute = orderno.getAttribute("value");
		 System.out.println(attribute);

}
}
