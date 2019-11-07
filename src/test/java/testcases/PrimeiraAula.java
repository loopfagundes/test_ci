package testcases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class PrimeiraAula {
	private static WebDriver driver;
	

	@BeforeClass
	public static void SetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sala312\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com.br");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test01 () {
		String tituloExp = "Google";
		String tituloSis = driver.getTitle();
		
		Assert.assertEquals(tituloExp, tituloSis);
	}
	
	@Test
	public void test () {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("DBServer");
		element.sendKeys(Keys.ENTER);
	}
	
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}
}
