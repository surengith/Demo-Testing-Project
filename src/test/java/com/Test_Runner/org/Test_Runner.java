package com.Test_Runner.org;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Base.org.Base_class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Feature", glue = "com.Step_Definition.org", plugin = {
		"html:Report/Cucumber_Report.html" })
public class Test_Runner extends Base_class {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = launchBrowser("chrome");
	}

	@AfterClass
	public static void tearDown() {

		closeBrowser();
	}
}