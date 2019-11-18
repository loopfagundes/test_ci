package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleAppObject {
	private WebDriver driver;

	public GoogleAppObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getBuscarTextField() {
		return driver.findElement(By.name("q"));
	}

}
