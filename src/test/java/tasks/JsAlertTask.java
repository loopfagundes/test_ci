package tasks;

import org.openqa.selenium.WebDriver;
import appobjects.JsAlertAppObject;

public class JsAlertTask {
	private WebDriver driver;
	private JsAlertAppObject jsAlertAppObject;
	
	public JsAlertTask (WebDriver driver) {
		this.driver = driver;
		this.jsAlertAppObject = new JsAlertAppObject(driver);
	}
	
	public void jsAlert() {
		
	}

}
