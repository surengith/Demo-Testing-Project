package com.Base.org;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_class {

	public static WebDriver driver;

	public static WebDriver launchBrowser(String Browsername) {

		if (Browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (Browsername.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

		} else if (Browsername.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}

		return driver;
	}

	public static void launchUrl(String Url) {
		driver.get(Url);

	}

	public static void passInput(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clikOnElement(WebElement element) {
		element.click();
	}

	public static void wait(int value) throws InterruptedException {
		Thread.sleep(value);
	}

	public static void selectByVisibleText(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	public static void screenShot(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("screenShots" + "\\" + location + ".png");
		FileUtils.copyFile(source, destination);

	}

	public static void alert_Accept(String value) {
		if (value.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		}

		else if (value.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
	}

	public static void alertSendkeys(String value) {
		driver.switchTo().alert().sendKeys(value);
	}

	public static void alertGetText() {
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
	}

	public static void closeBrowser() {
		driver.close();
	}

}
