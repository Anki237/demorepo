package testsdemo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Objectpagesdemo.AccountpageDemo;
import Objectpagesdemo.Loginpagedemo;
import screenshotsDemo.ScreenshotsDemo;
import utilityDemo.DiversImportedDemo;
import utilityDemo.Driversdemo;

public class TestDemo {
private WebDriver driver;
private String baseurld;
private Loginpagedemo loginpagedemo;
private AccountpageDemo accountpagedemo;
private ScreenshotsDemo screenShotdemo;
ExtentHtmlReporter htmlrptr;
ExtentReports extnt;
ExtentTest test;
@BeforeTest
public void setUpdemo() throws Exception {
	
}
}
