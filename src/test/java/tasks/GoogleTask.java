package tasks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import appobjects.GoogleAppObject;

public class GoogleTask {
	private WebDriver driver;
	private GoogleAppObject googleAppObject;
	
	public GoogleTask (WebDriver driver) {
		this.driver = driver;
		this.googleAppObject = new GoogleAppObject(driver);
	}
	
	public void google(String busca) {
		googleAppObject.getBuscarTextField().sendKeys(busca);
		googleAppObject.getBuscarTextField().sendKeys(Keys.ENTER);
	}

}
