package TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.AdactinBaseclass.BaseClass;
import com.propertyfile.Configurationhelper;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", glue = "com.adactin.Stepdefinition",
tags ="@TC-101", plugin = {"html:target/cucumber-html-report.html",
        "json:target/cucumber.json","junit:target/xmlreport.xml",
        
     },
 dryRun = false, monochrome = true)


public class TestRunner extends BaseClass{
	public static WebDriver driver;
	@BeforeClass
	public static void Browser() throws Throwable {
		String getbrowser = Configurationhelper.configurationinstaneCR().getbrowser();
		driver = browserLaunch("chrome");

	}
	@AfterClass
	public static void Browerclose() {
		driver.close();

	}
	
	
	
	
	
	
	
	
}
