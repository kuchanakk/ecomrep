package objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Productdetail {
	
	static WebDriver driver;
	
	public Productdetail(WebDriver driver) {
		this.driver = driver;
		
	}

	
	public WebElement producttext() {
		
		return driver.findElement(By.xpath("//*[@id=\"Description\"]/h1"));
	}
	
	
}
