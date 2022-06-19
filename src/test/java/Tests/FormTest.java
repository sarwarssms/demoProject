package Tests;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Utilities.TestSuiteBase;

public class FormTest extends TestSuiteBase {

	private String OsBrowser = "";

	@Test(priority = 1)
	public void ElementPage() throws InterruptedException {
		OsBrowser = (String) ((JavascriptExecutor) driver).executeScript("return navigator.userAgent;");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Homepage.forms));
		Homepage.clickForms();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "ToolsQA");
		FormsPage.clickPractiseForm();
		Thread.sleep(5000);
	}


	

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {

			try {
				String error = "Reason of Failure :\n" + result.getThrowable();
				System.out.println(error);

			} catch (Exception e) {
				String exep = e.toString();
				System.out.println(exep);
			}
		}
		
		if (result.getStatus() == ITestResult.SUCCESS) {

			try {
				String success = result.getName() + ":" + "Test ran Successfully \n";
				System.out.println(success);

			} catch (Exception e) {
				String exep = e.toString();
				System.out.println(exep);
			}
		}

	}
}