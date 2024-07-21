package screenshotsDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotsDemo {
private WebDriver driver;

    
    public ScreenshotsDemo(WebDriver driver) {
        this.driver = driver;
    }

    public void captureScreenShot(String fileName) throws IOException {
    	        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    	        try {
    	            FileUtils.copyFile(scrFile, new File("C:/Users/LENOVO/Downloads/" + fileName));
    	        } catch (IOException e) {
    	            e.printStackTrace();
    	        }
    }
}
