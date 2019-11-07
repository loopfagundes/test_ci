package tasks;

import org.openqa.selenium.WebDriver;

import appobjects.StoreAppObject;
import junit.framework.Assert;

public class StoreTask {
	private WebDriver driver;
	private StoreAppObject storeAppObject;
	
	public StoreTask (WebDriver driver) {
		this.driver = driver;
		this.storeAppObject = new StoreAppObject(driver);
	}
	
	public void storeAppObject(String buscar) throws InterruptedException {
		this.storeAppObject.getBuscarTextField().sendKeys(buscar);
		Thread.sleep(3000);
		this.storeAppObject.getProcurarButton().click();
		
		String expected = "\"DRESS\"";
		String actual = storeAppObject.getValidarLabel().getText();
		Assert.assertEquals(expected, actual);
	}

}
