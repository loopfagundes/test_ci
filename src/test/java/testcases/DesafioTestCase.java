package testcases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.DesafioTask;

public class DesafioTestCase {
	private static WebDriver driver;
	private static DesafioTask desafioTask;
	
	@BeforeClass
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		desafioTask = new DesafioTask(driver);
	}
	
	@Test
	public void test () throws InterruptedException{
		desafioTask.home("dress");
		
	}
	
	@AfterClass
	public static void tearDown () {
			driver.quit();
	}
}


