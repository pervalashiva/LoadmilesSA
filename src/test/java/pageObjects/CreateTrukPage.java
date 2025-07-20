package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateTrukPage extends BasePage{

	public CreateTrukPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	@FindBy(partialLinkText = "Setup")
	WebElement setupLink;
	
	@FindBy(xpath = "//button[contains(text(),'ADD')]")
	WebElement addButton;
	
	@FindBy(name = "truckUnitNumber")
	WebElement unitNumber;
	
	 @FindBy(id = "truckType")
	 WebElement truckTypeDropdown;

		@FindBy(id = "registerdState")
		WebElement rState;
		
	 public void setUp()
	 {
		 setupLink.click();
	 }
	 public void plusButton()
	 {
		 addButton.click();
	 }
	 public void unitNum(String unit)
	 {
		unitNumber.sendKeys(unit); 
	 }
	 
	 public void selectTruckType(String truckType) {
	        Select select = new Select(truckTypeDropdown);
	        select.selectByVisibleText(truckType);
	    }
	 public void regState(String rNum)
	 {
		 rState.sendKeys(rNum);
	 }
}
