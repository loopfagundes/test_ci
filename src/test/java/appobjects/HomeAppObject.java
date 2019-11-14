package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import framework.Utils;

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
	
	public WebElement getQtdTextField() {
		driver.switchTo().defaultContent();
		WebElement iframe = driver.findElement(By.cssSelector(".fancybox-iframe"));// eu pego o elemento do iframe
		WebDriver iframeDriver = driver.switchTo().frame(iframe);// aqui eu troco o contexto para o iframe
		return iframeDriver.findElement(By.id("quantity_wanted"));// e aqui eu faço a ação dentro do iframe
	}
	
	public Select tamanhoComboBox() {
		return new Select(this.driver.findElement(By.id("group_1")));
	}
	
	public WebElement getAddToCartButton() {
		return driver.findElement(By.cssSelector("button[name='Submit']"));
	}
	
	public WebElement getProceedButton() {
		driver.switchTo().defaultContent();
		return driver.findElement(By.cssSelector("a[class='btn btn-default button button-medium']"));
	}
	
	public WebElement getRemoveButton() {
		return driver.findElement(By.xpath("//i[@class='icon-trash']"));
	}
	
	public WebElement getValidarRemoveLabel() {
		return driver.findElement(By.xpath("//p[@class='alert alert-warning']"));
	}
	
//	public WebElement getProceedToCheckoutAddress() {
//		return driver.findElement(By.name("processAddress"));
//	}
	
//	public WebElement getTermsOfServiceClick() {
//		return driver.findElement(By.id("cgv"));
//	}
	
//	public WebElement getProceedToCheckoutSubmitButton() {
//		return driver.findElement(By.name("processCarrier"));
//	}
	
//	public WebElement getPayByBankWireButton() {
//		return driver.findElement(By.className("bankwire"));
//	}
	
//	public WebElement getConfirmButton() {
//		return driver.findElement(By.cssSelector("button[class='button btn btn-default button-medium']"));
//	}
	
//	 public WebElement getConfirmLabel() {
//	    return driver.findElement(By.cssSelector("div.box strong.dark"));
//	}


}