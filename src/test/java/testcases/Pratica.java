package testcases;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Pratica {
	private static WebDriver driver;
	
	@BeforeClass
	public static void setUp () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sala312\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test01 () throws InterruptedException {
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("luk.ninja.91@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("passwd")).sendKeys("d8i5d2i0");
		
		WebElement elementIn = driver.findElement(By.id("SubmitLogin"));
		elementIn.click();
		
		WebElement validarLoginSucess = driver.findElement(By.xpath("//*[@id='center_column']/p/text()"));
		
		System.out.println(driver.getTitle());
		
//		String validarExp = "My account - My Store";
//		String validarSis = driver.getTitle(); //tem que pegar xpath ou cssSelector ou Class ou id ou etc para validar
//		
//		Assert.assertEquals(validarExp, validarSis);

	}		
	
	@Test
	public void test () {
//		driver.findElement(By.id("SubmitLogin")).click();
//		WebElement element = driver.findElement(By.xpath("//*[@id='center_column']/div[1]/ol/li"));
//		System.out.println(element.getText());
		
//		String validarExp = "My account - My Store";
//		String validarSis = driver.getTitle();
		
//		Assert.assertEquals(validarExp, validarSis);	
	}
	
	@AfterClass
	public static void tearDown () {
		driver.quit();
	}

}
