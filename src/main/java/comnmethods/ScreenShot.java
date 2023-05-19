package comnmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import testbase.Browser;

public class ScreenShot extends Browser {
	
	
	public void takescreenshot() throws IOException {
		
		
		File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File("C:\\Users\\kiran\\eclipse-workspace\\projectsample1\\res\\scnshots\\error1.png"));
	}

}
