package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoreAppObject {
	private WebDriver driver;
	
	public StoreAppObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getBuscarTextField () {
		return driver.findElement(By.id("search_query_top"));
	}
	
	public WebElement getProcurarButton () {
		return driver.findElement(By.name("submit_search"));
	}
	
	public WebElement getValidarLabel () {
		return driver.findElement(By.className("lighter"));
	}

}
