package testcases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.StoreTask;

public class StoreTestCase {
	private static WebDriver driver;
	private static StoreTask storeTask;
	
	@BeforeClass
	public static void setUp () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		storeTask = new StoreTask(driver);
	}
	
	@Test
	public void test () throws InterruptedException {
		storeTask.storeAppObject("dress");
		
	}
	
}
