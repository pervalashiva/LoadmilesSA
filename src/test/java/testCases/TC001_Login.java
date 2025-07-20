package testCases;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testBase.BaseClass;

public class TC001_Login extends BaseClass {

    @Test(dataProvider = "testData")
    public void verifyLogin(String username, String password ) throws InterruptedException
    {

        boolean isInitialLoginClicked = false;
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

          // Only click the login button once, before entering credentials
          if (!isInitialLoginClicked) {
              try {
                  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                  WebElement loginButton = wait.until(ExpectedConditions
                          .elementToBeClickable(By.xpath("//button[contains(@class, 'btn-danger') and contains(@class, 'btn-block')]")));
                  loginButton.click();
                  isInitialLoginClicked = true;
              } catch (Exception e) {
                  System.out.println("Login button not found or already clicked.");
              }
          }
	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys(username);
	    driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("kc-login")).click();
    }
    
    @DataProvider(name = "testData")
    public Object[][] tData()
    {
    	return new Object[][]
    			{
//    				{"re@gmail.com", "1234"},
//    				{"fef@gmail.com", "51551"},
//    				{"ga@gmail.com", "ag689"},	
    				{"abhishake@yopmail.com", "test1234"}
    			};
    }
}



	