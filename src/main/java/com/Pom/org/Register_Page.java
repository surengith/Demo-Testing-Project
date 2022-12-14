package com.Pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {
	
	public WebDriver driver;

	public Register_Page(WebDriver rpdriver) {
		this.driver = rpdriver;
		PageFactory.initElements(rpdriver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhnum() {
		return phnum;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getHobbies() {
		return hobbies;
	}

	public WebElement getLanguages() {
		return Languages;
	}

	public WebElement getLanguage() {
		return language;
	}

	public WebElement getSkills() {
		return skills;
	}

	public WebElement getCountries() {
		return countries;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getFpassword() {
		return fpassword;
	}

	public WebElement getSpassword() {
		return spassword;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastname;

	@FindBy(xpath = "//textarea[@ng-model='Adress']")
	private WebElement address;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;

	@FindBy(xpath = "//input[@type='tel']")
	private WebElement phnum;

	@FindBy(xpath = "//input[@value='Male']")
	private WebElement gender;

	@FindBy(xpath = "//input[@value='Movies']")
	private WebElement hobbies;

	@FindBy(id = "msdd")
	private WebElement Languages;

	@FindBy(xpath = "//a[text()='English']")
	private WebElement language;

	@FindBy(xpath = "//select[@id='Skills']")
	private WebElement skills;

	@FindBy(xpath = "//select[@id='countries']")
	private WebElement countries;

	@FindBy(xpath = "//select[@id='country']")
	private WebElement country;

	@FindBy(xpath = "//select[@id='yearbox']")
	private WebElement year;

	@FindBy(xpath = "//select[@placeholder='Month']")
	private WebElement month;

	@FindBy(xpath = "//select[@placeholder='Day']")
	private WebElement day;

	@FindBy(xpath = "//input[@id='firstpassword']")
	private WebElement fpassword;

	@FindBy(xpath = "//input[@id='secondpassword']")
	private WebElement spassword;

	@FindBy(xpath = "//button[@id='submitbtn']")
	private WebElement submit;

}
