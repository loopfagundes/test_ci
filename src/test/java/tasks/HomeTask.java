package tasks;

import org.openqa.selenium.WebDriver;

import appobjects.HomeAppObject;
import junit.framework.Assert;

public class HomeTask {
	private WebDriver driver;
	private HomeAppObject homeAppObject;
	
	public HomeTask (WebDriver driver) {
		this.driver = driver;
	}
	
	public void homeAppObject(String busca) throws InterruptedException {
		this.homeAppObject.getCampoBuscarTextField().sendKeys(busca);
		this.homeAppObject.getProcurarButton().click();
		Thread.sleep(3000);
		this.homeAppObject.getImagemButton().click();
		
		String expected = "\"DRESS\"";
		String actual = homeAppObject.getValidarLabel().getText();
		
		Assert.assertEquals(expected, actual);
	}
}
