package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import appobjects.HomeAppObject;
import framework.Utils;
import junit.framework.Assert;

public class HomeTask {
	private WebDriver driver;
	private HomeAppObject homeAppObject;
	private Utils utils;
	
	public HomeTask (WebDriver driver) {
		this.driver = driver;
		this.homeAppObject = new HomeAppObject(driver);
		this.utils = new Utils (this.driver);
	}
	
	public void home(String busca) {
		
		homeAppObject.getCampoBuscarTextField().sendKeys(busca);
		homeAppObject.getProcurarButton().click();
		
//		String expected = "\"DRESS\"";
//		String actual = homeAppObject.getValidarLabel().getText();
//		
//		Assert.assertEquals(expected, actual);

		homeAppObject.getImagemButton().click();
					
		utils.visibilityOfElementLocated(By.cssSelector(".fancybox-iframe"));		
		
		homeAppObject.getQtdTextField().clear();		
		homeAppObject.getQtdTextField().sendKeys("5");	
		homeAppObject.tamanhoComboBox().selectByValue("3");
		homeAppObject.getAddToCartButton().click();
		
		utils.waitElementClickable(this.homeAppObject.getProceedButton());
		homeAppObject.getProceedButton().click();
		
		homeAppObject.getProceedToCheckoutButton().click();
		homeAppObject.getProceedToCheckoutAddress().click();
		homeAppObject.getTermsOfServiceClick().click();
		homeAppObject.getProceedToCheckoutSubmitButton().click();
		homeAppObject.getPayByBankWireButton().click();
		
		//usar assert
	}
}
