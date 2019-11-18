package testcases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import framework.BaseTestFw;
import tasks.DesafioTask;

public class DesafioTestCase extends BaseTestFw{
	private WebDriver driver = getDriver();
	private DesafioTask desafioTask = new DesafioTask(driver);
	
	
	@Test
	public void test () throws InterruptedException{
		driver.get("http://automationpractice.com/index.php");
		desafioTask.home("dress");
	}
}


