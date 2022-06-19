package Tests;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Utilities.TestSuiteBase;

public class ElementPageTest extends TestSuiteBase {

	private String OsBrowser = "";

	@Test(priority = 1)
	public void ElementPage() throws InterruptedException {
		OsBrowser = (String) ((JavascriptExecutor) driver).executeScript("return navigator.userAgent;");
		Homepage.clickElement();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "ToolsQA");
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