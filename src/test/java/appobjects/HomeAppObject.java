package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeAppObject {
	private WebDriver driver;
	
	public HomeAppObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getCampoBuscarTextField() {
		return driver.findElement(By.id("search_query_top"));
	}
	
	public WebElement getProcurarButton() {
		return driver.findElement(By.name("submit_search"));
	}
	
	public WebElement getValidarLabel() {
		return driver.findElement(By.className("lighter"));
	}
	
	//iframe é aqui
	
//	public WebElement getQuickImagemButton() {
//		driver.switchTo().defaultContent();
//		WebElement iFrame = driver.findElement(By.cssSelector(".fancybox=iframe"));
//		WebDriver frameDriver = driver.switchTo().frame(iFrame);
//		return frameDriver.findElement(By.id("quantity_wanted"));
//	}
	
	public WebElement getImagemButton () {
		return driver.findElement(By.xpath("//img[@title='Printed Chiffon Dress']"));
	}
	
}