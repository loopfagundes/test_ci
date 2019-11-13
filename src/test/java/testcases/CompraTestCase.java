package testcases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import framework.BaseTestFw;
import tasks.HomeTask;
import tasks.LoginTask;

public class CompraTestCase extends BaseTestFw {
	
	private WebDriver driver = getDriver();
	private LoginTask loginTask = new LoginTask(driver);
	private HomeTask homeTask = new HomeTask(driver);
	
	
	@Test
	public void test () {
		driver.get("http://automationpractice.com/index.php");
		loginTask.login("luk.ninja.91@gmail.com", "d8i5d2i0");
		homeTask.home("dress");
	}
}
