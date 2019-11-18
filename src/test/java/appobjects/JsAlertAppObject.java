package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JsAlertAppObject {
	private WebDriver driver;
	
	public JsAlertAppObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getJsAlertButton() {
		return driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));		
	}

}
