package tasks;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import appobjects.LoginAppObject;
import framework.Utils;

public class LoginTask {
	private WebDriver driver;
	private LoginAppObject loginAppObject;
	
	public LoginTask (WebDriver driver) {
		this.driver = driver;
		this.loginAppObject = new LoginAppObject(driver);
		
	}
	
	public void login(String email, String senha) {
		
		this.loginAppObject.getLoginButton().click();
		
		this.loginAppObject.getCampoEmailTextField().sendKeys(email);

		this.loginAppObject.getCampoSenhaTextField().sendKeys(senha);
		
		this.loginAppObject.getSignInButton().click();
		
//		String expected = "Welcome to your account. Here you can manage all of your personal information and orders.";
//		String actual = loginAppObject.getValidarSucessoLabel().getText();
//		
//		Assert.assertEquals(expected, actual);
		
	}
}
