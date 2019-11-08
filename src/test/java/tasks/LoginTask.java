package tasks;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import appobjects.LoginAppObject;

public class LoginTask {
	private WebDriver driver;
	private LoginAppObject loginAppObject;
	
	public LoginTask (WebDriver driver) {
		this.driver = driver;
		this.loginAppObject = new LoginAppObject(driver);
	}
	
	public void loginAppObject (String email, String senha) throws InterruptedException {
		this.loginAppObject.getCampoEmailTextField().sendKeys(email);
		Thread.sleep(3000);
		this.loginAppObject.getCampoSenhaTextField().sendKeys(senha);
		this.loginAppObject.getSignInButton().click();
		Thread.sleep(3000);
		
		String expected = "Welcome to your account. Here you can manage all of your personal information and orders.";
		String actual = loginAppObject.getValidarSucessoLabel().getText();
		
		Assert.assertEquals(expected, actual);
	}

}
