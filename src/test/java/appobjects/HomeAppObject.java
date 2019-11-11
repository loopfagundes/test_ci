package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeAppObject {
	private WebDriver driver;
	
	public HomeAppObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getCampoBuscarTextField() {
		return driver.findElement(By.id("search_query_top"));
	}
	
	public WebElement getProcurarButton() {
		return driver.findElement(By.name("submit_search"));
	}
	
	public WebElement getValidarLabel() {
		return driver.findElement(By.className("lighter"));
	}
		
	public WebElement getImagemButton() {
		return driver.findElement (By.cssSelector("div[class='product-container'] img[title='Printed Chiffon Dress']"));
	}
	
	public By getTamanhoButton() {
		return By.id("group_1");
	}
	
	public By getOpcaoTamanhoButton() {
		return By.xpath("//select[@id='group_1']/option[2]");
	}
	
	public WebElement getAddToCartButton() {
		WebElement iframe = driver.findElement(By.cssSelector(".fancybox-iframe"));// eu pego o elemento do iframe
		WebDriver iframeDriver = driver.switchTo().frame(iframe);// aqui eu troco o contexto para o iframe
		return iframeDriver.findElement(By.cssSelector("button[name='Submit']"));// e aqui eu faço a ação dentro do iframe
	}
	
}



//iframe é aqui

//	public WebElement getQuickImagemButton() {
//		driver.switchTo().defaultContent();
//		WebElement iFrame = driver.findElement(By.cssSelector(".fancybox=iframe"));
//		WebDriver frameDriver = driver.switchTo().frame(iFrame);
//		return frameDriver.findElement(By.id("quantity_wanted"));
//	}