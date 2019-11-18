package testcases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import framework.BaseTestFw;
import tasks.GoogleTask;


public class GoogleTestCase extends BaseTestFw {
	
	private WebDriver driver = getDriver();
	private GoogleTask googleTask = new GoogleTask(driver);
	
	@Test
	public void test() {
		driver.get("https://www.google.com.br/");
		googleTask.google("DBServer");
		
	}
}
