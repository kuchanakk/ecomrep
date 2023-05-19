package projectsample1;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import comnmethods.ScreenShot;
import objrep.HomepageEle;
import objrep.Productdetail;
import testbase.Browser;
import xldriven.DataDriven11;

public class PopItemsTest extends Browser{
	
	
	@BeforeTest
	public static void starttest() {
		
		System.out.println("******TEST Started************");
		
	}
	
	@AfterTest
	public static void endtest() {
		
		System.out.println("******TEST ended************");
		
	}
	
	@BeforeMethod
	public static void openbrowser() {
		
		Browser b = new Browser();
		b.LaunchBrowser("firefox");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		
	}
	
	@Test
	public void tabtest() throws InterruptedException, IOException {
		Thread.sleep(10000);
		HomepageEle homepage = new HomepageEle(driver);
		homepage.popitems().click();
		Thread.sleep(5000);
		
		homepage.tablelink().click();
		
		Thread.sleep(5000);
		Productdetail product = new Productdetail(driver);
		String actaultabtext=product.producttext().getText();
		
		DataDriven11 excelinfo = new DataDriven11();
		String expectedttabtext=excelinfo.readdata(1, 0);
		
		if(actaultabtext.contains(expectedttabtext)) {
			
			excelinfo.writedata(1, 1, "valid data");
			
		}else {
			
			ScreenShot sc = new ScreenShot();
			sc.takescreenshot();
			excelinfo.writedata(1, 1, "invalid data");

			
		}
		
	}
	
	@Test
	public void laptest() throws InterruptedException, IOException {
		Thread.sleep(10000);
		HomepageEle homepage = new HomepageEle(driver);
		homepage.popitems().click();
		Thread.sleep(5000);
		
		homepage.laplink().click();
		
		Thread.sleep(5000);
		Productdetail product = new Productdetail(driver);
		String actaullaptext=product.producttext().getText();
		
		DataDriven11 excelinfo = new DataDriven11();
		String expectedtlaptext=excelinfo.readdata(2, 0);
		
		if(actaullaptext.contains(expectedtlaptext)) {
			
			excelinfo.writedata(2, 1, "valid data");
			
		}else {
			
			ScreenShot sc = new ScreenShot();
			sc.takescreenshot();
			excelinfo.writedata(2, 1, "invalid data");

			
		}
		
	}
	
	@Test
	public void spktest() throws InterruptedException, IOException {
		Thread.sleep(10000);
		HomepageEle homepage = new HomepageEle(driver);
		homepage.popitems().click();
		Thread.sleep(5000);
		
		homepage.spklink().click();
		
		Thread.sleep(5000);
		Productdetail product = new Productdetail(driver);
		String actaulspktext=product.producttext().getText();
		
		DataDriven11 excelinfo = new DataDriven11();
		String expectedtspktext=excelinfo.readdata(3, 0);
		
		if(actaulspktext.contains(expectedtspktext)) {
			
			excelinfo.writedata(3, 1, "valid data");
			
		}else {
			
			ScreenShot sc = new ScreenShot();
			sc.takescreenshot();
			excelinfo.writedata(3, 1, "invalid data");

			
		}
		
	}
	
	
	@AfterMethod
	public static void closebrowser() {
		
		driver.close();
	}
	
	

}
