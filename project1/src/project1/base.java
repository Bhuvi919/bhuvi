
package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class base {
	static  WebDriver driver;
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M\\eclipse-workspace\\project1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
		
	}
	
	public void loadUrl(String name) {
		driver.get(name);
	
	}
	public void type (WebElement element,String name) {
		element.sendKeys(name);
			
	}
	public void selectByIndex(WebElement element,int index) {
		new Select(element).selectByIndex(index);
		
	}
	public void selectByvalue(WebElement element,String name) {
		new Select(element).selectByValue(name);
		
		
	}
	public void selectBytext(WebElement element,String name) {
		new Select(element).selectByVisibleText(name);
		
	}
	public void btnClick(WebElement element) {
		element.click();
		
	}
	public void getAttribute(WebElement element) {
		String name = element.getAttribute("value");
		System.out.println(name);
		
	}
}