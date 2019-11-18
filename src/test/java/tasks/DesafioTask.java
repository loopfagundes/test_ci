package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import appobjects.HomeAppObject;
import framework.Utils;
import junit.framework.Assert;

public class DesafioTask {
	private WebDriver driver;
	private HomeAppObject homeAppObject;
	
	public DesafioTask (WebDriver driver) {
		this.driver = driver;
		this.homeAppObject = new HomeAppObject(driver);
	}
	
	public void home(String busca) throws InterruptedException{
		homeAppObject.getCampoBuscarTextField().sendKeys(busca);
		homeAppObject.getProcurarButton().click();homeAppObject.getImagemButton().click();
		
		Utils.visibilityOfElementLocated(driver, By.cssSelector(".fancybox-iframe"));		
		
		homeAppObject.getQtdTextField().clear();	
		
		homeAppObject.getQtdTextField().sendKeys("5");	
		
		homeAppObject.tamanhoComboBox().selectByValue("2");
		
		homeAppObject.getAddToCartButton().click();
		
		Thread.sleep(2000);
		
		homeAppObject.getProceedButton().click();
		
		Utils.waitElementClickable(driver, this.homeAppObject.getRemoveButton());
		homeAppObject.getRemoveButton().click();
		
		Thread.sleep(2000);
		
		String expected = "Your shopping cart is empty.";
		String actual = homeAppObject.getValidarRemoveLabel().getText();
		
		Assert.assertEquals(expected, actual);
	}
}