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
		
		this.homeAppObject.getCampoBuscarTextField().sendKeys(busca);
		
		this.homeAppObject.getProcurarButton().click();
		
//		String expected = "\"DRESS\"";
//		String actual = homeAppObject.getValidarLabel().getText();
//		
//		Assert.assertEquals(expected, actual);

		this.homeAppObject.getImagemButton().click();
			
		utils.visibilityOfElementLocated(By.cssSelector(".fancybox-iframe"));
		
		this.homeAppObject.getAddToCartButton().click();
	}
}
