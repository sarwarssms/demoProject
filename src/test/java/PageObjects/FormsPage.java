package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage {
	public WebDriver driver;

	public FormsPage(WebDriver driver) {
		this.driver = driver;
		// PageFactory.initElements(driver, this);
	}

	@FindBy(css =".show .text")
	public WebElement practiseForm;
	
	
	
	public void clickPractiseForm() {
		this.practiseForm.click();
	}

}