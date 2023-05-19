package objrep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepageEle {
	
	static WebDriver driver;
	
	
	public HomepageEle(WebDriver driver) {
		
		this.driver = driver;
		
	}
			
	
	public WebElement popitems() {
		
		return driver.findElement(By.linkText("POPULAR ITEMS"));
	}
	
	
	public WebElement tablelink() {
		
		return driver.findElement(By.id("details_16"));
	}	
	
    public WebElement laplink() {
		
		return driver.findElement(By.id("details_10"));
	}	
    
    public WebElement spklink() {
		
		return driver.findElement(By.id("details_21"));
	}	
	

}
