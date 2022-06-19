package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		// PageFactory.initElements(driver, this);
	}

	@FindBy(css="#app > div > div > div.home-body > div > div:nth-child(1) > div > div.card-body > h5")
	public WebElement element;
	
	@FindBy(css="#app > div > div > div.home-body > div > div:nth-child(2) > div > div.card-body > h5")
	public WebElement forms;
	
	public void clickElement() {
		this.element.click();
	}

	public void clickForms() {
		this.forms.click();
	}
}