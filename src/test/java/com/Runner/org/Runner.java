package com.Runner.org;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import com.Base.org.Base_class;
import com.Pom.org.Alert_Page;
import com.Pom.org.Register_Page;
import com.Properties.org.File_Reader_Manager;
import com.Singleton_Pattern_org.Page_Object_Manager;

public class Runner extends Base_class {

	public static WebDriver driver = launchBrowser("Chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
//		ChromeOptions op = new ChromeOptions();
//		op.addArguments("--disable-notification");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		launchUrl(url);
//		driver.get("https://demo.automationtesting.in/Register.html");

//		Register_Page rp = new Register_Page(driver);

//		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
//		firstname.sendKeys("Mohan");

		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstname();
		passInput(pom.getInstanceRegisterPage().getFirstname(), firstname);

//		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
//		lastname.sendKeys("Kumar");
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastname();
		passInput(pom.getInstanceRegisterPage().getLastname(), lastname);

//		WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
//		address.sendKeys("Iraiyamankalam, Tamil Nadu");
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		passInput(pom.getInstanceRegisterPage().getAddress(), address);

//		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
//		email.sendKeys("mohankumar@gmail.com");
		String email = File_Reader_Manager.getInstanceFRM().getInstanceCR().getEmail();
		passInput(pom.getInstanceRegisterPage().getEmail(), email);

//		WebElement phnum = driver.findElement(By.xpath("//input[@type='tel']"));
//		phnum.sendKeys("1234567890");
		String phoneNumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPhoneNumber();
		passInput(pom.getInstanceRegisterPage().getPhnum(), phoneNumber);

//		WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
//		gender.click();
		clikOnElement(pom.getInstanceRegisterPage().getGender());

//		WebElement hobbies = driver.findElement(By.xpath("//input[@value='Movies']"));
//		hobbies.click();
		clikOnElement(pom.getInstanceRegisterPage().getHobbies());

//		WebElement Languages = driver.findElement(By.id("msdd"));
//		Languages.click();
		clikOnElement(pom.getInstanceRegisterPage().getLanguages());

//		Thread.sleep(1000);
		wait(1000);

//		WebElement language = driver.findElement(By.xpath("//a[text()='English']"));
//		language.click();
		clikOnElement(pom.getInstanceRegisterPage().getLanguage());

//		WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
//		Select s = new Select(skills);
//		s.selectByVisibleText("Adobe Photoshop");
		String skills = File_Reader_Manager.getInstanceFRM().getInstanceCR().getSkills();
		selectByVisibleText(pom.getInstanceRegisterPage().getSkills(), skills);

//		WebElement countries = driver.findElement(By.xpath("//select[@id='countries']"));
//		Select s0 = new Select(countries);
//		s0.selectByVisibleText("Select Country");
		String countries = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCountries();
		selectByVisibleText(pom.getInstanceRegisterPage().getCountries(), countries);

//		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
//		Select s1 = new Select(country);
//		s1.selectByVisibleText("India");
		String country = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCountry();
		selectByVisibleText(pom.getInstanceRegisterPage().getCountry(), country);

//		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
//		Select s2 = new Select(year);
//		s2.selectByVisibleText("year");
		String year = File_Reader_Manager.getInstanceFRM().getInstanceCR().getYear();
		selectByVisibleText(pom.getInstanceRegisterPage().getYear(), year);

//		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
//		Select s3 = new Select(month);
//		s3.selectByVisibleText("August");
		String month = File_Reader_Manager.getInstanceFRM().getInstanceCR().getMonth();
		selectByVisibleText(pom.getInstanceRegisterPage().getMonth(), month);

//		WebElement day = driver.findElement(By.xpath("//select[@placeholder='Day']"));
//		Select s4 = new Select(day);
//		s4.selectByVisibleText("10");
		String day = File_Reader_Manager.getInstanceFRM().getInstanceCR().getDay();
		selectByVisibleText(pom.getInstanceRegisterPage().getDay(), day);

//		WebElement fpassword = driver.findElement(By.xpath("//input[@id='firstpassword']"));
//		fpassword.sendKeys("abcd");
		String first_Password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirst_Password();
		passInput(pom.getInstanceRegisterPage().getFpassword(), first_Password);

//		WebElement spassword = driver.findElement(By.xpath("//input[@id='secondpassword']"));
//		spassword.sendKeys("abcd");
		String Second_Password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getSecond_Password();
		passInput(pom.getInstanceRegisterPage().getSpassword(), Second_Password);

//		WebElement submit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
//		submit.click();
		clikOnElement(pom.getInstanceRegisterPage().getSubmit());

		screenShot("Loginpage");
//		TakesScreenshot screenshot = (TakesScreenshot) driver;
//		File source = screenshot.getScreenshotAs(OutputType.FILE);
//		File destination = new File("screenshot" + "\\Login.png");
//		FileUtils.copyFile(source, destination);
//		

		// Alert_Page

//		Alert_Page ap = new Alert_Page(driver);

//		WebElement switchTo = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
//		switchTo.click();
		clikOnElement(pom.getInstanceAlertPage().getSwitchTo());

//		WebElement alerts = driver.findElement(By.xpath("//a[text()='Alerts']"));
//		alerts.click();
		clikOnElement(pom.getInstanceAlertPage().getAlerts());

//		WebElement popup1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
//		popup1.click();
		clikOnElement(pom.getInstanceAlertPage().getPopup1());

//		Alert alert = driver.switchTo().alert();
//		System.out.println("Alert text: " + alert.getText());
//		alert.accept();

		alertGetText();
		alert_Accept("accept");

//		WebElement alert1 = driver.findElement(By.xpath("//a[contains(text(),'Alert with OK &')]"));
//		alert1.click();
		clikOnElement(pom.getInstanceAlertPage().getAlert1());

//		WebElement popup2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
//		popup2.click();
		clikOnElement(pom.getInstanceAlertPage().getPopup2());

//		driver.switchTo().alert().dismiss();
		alert_Accept("dismiss");

//		WebElement alert3 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
//		alert3.click();
		clikOnElement(pom.getInstanceAlertPage().getAlert3());

//		WebElement popup3 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
//		popup3.click();
		clikOnElement(pom.getInstanceAlertPage().getPopup3());

//		Alert alert2 = driver.switchTo().alert();
//		alert2.sendKeys("suren");
//		System.out.println("Alert text1: " + alert2.getText());
//		alert2.accept();
		alertSendkeys("suren");
		alertGetText();
		alert_Accept("accept");

		screenShot("Alertpage");
//		TakesScreenshot screenshot1 = (TakesScreenshot) driver;
//		File source1 = screenshot1.getScreenshotAs(OutputType.FILE);
//		File destination1 = new File("screenshot" + "\\Alert.png");
//		FileUtils.copyFile(source1, destination1);

//		Thread.sleep(3000);
		wait(3000);

//		driver.close();
		closeBrowser();
	}

}
