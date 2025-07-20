package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import testBase.BaseClass;

public class TC003_LoginDDT extends BaseClass {

	
	@Test
	public void Login_DDT ()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-danger btn-block']")));
		driver.findElement(By.xpath("//button[@class='btn btn-danger btn-block']")).click();
		driver.findElement(By.id("username")).sendKeys("abhishake@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("test123");
		
	}
   

}
	