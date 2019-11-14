package framework;

import static framework.DriverManagerFactoryFw.setDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseTestFw {
	
	private static WebDriver driver;
	
	public WebDriver getDriver() {
		this.driver = setDriver(DriverTypeFw.CHROME);
		return driver;
	}
	
	@BeforeClass
	public static void setUp() {
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}