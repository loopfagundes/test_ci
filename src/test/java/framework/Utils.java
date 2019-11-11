package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	private WebDriver driver;
	static final int WAIT_SEC = 30;
	
	public Utils (WebDriver driver) {
		this.driver = driver;
	}
	
	public void waitElementClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, WAIT_SEC);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void visibilityOfElementLocated(By by) {
		WebDriverWait wait = new WebDriverWait(driver, WAIT_SEC);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

}
