package testcases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.HomeTask;
import tasks.LoginTask;

public class CompraTestCase {
	
	private static WebDriver driver;
	private static LoginTask loginTask;
	private static HomeTask homeTask;
	
	@BeforeClass
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		loginTask = new LoginTask(driver);	
		homeTask = new HomeTask(driver);
	}
	
	@Test
	public void test () {
		loginTask.login("luk.ninja.91@gmail.com", "d8i5d2i0");
		homeTask.home("dress");
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

}
