package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAppObject {
	private WebDriver driver;
	
	public LoginAppObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getCampoEmailTextField() {
		return driver.findElement(By.id("email"));
	}
	
	public WebElement getCampoSenhaTextField() {
		return driver.findElement(By.id("passwd"));		
	}
	
	public WebElement getSignInButton() {
		return driver.findElement(By.id("SubmitLogin"));
	}
	
	public WebElement getValidarSucessoLabel() {
		return driver.findElement(By.className("info-account"));
	}

}
