package com.Pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alert_Page {

	public WebDriver driver;

	public Alert_Page(WebDriver apdriver2) {
		this.driver = apdriver2;
		PageFactory.initElements(apdriver2, this);
	}

	public WebElement getSwitchTo() {
		return switchTo;
	}

	public WebElement getAlerts() {
		return alerts;
	}

	public WebElement getPopup1() {
		return popup1;
	}

	public WebElement getAlert1() {
		return alert1;
	}

	public WebElement getPopup2() {
		return popup2;
	}

	public WebElement getAlert3() {
		return alert3;
	}

	public WebElement getPopup3() {
		return popup3;
	}

	@FindBy(xpath = "//a[text()='SwitchTo']")
	private WebElement switchTo;

	@FindBy(xpath = "//a[text()='Alerts']")
	private WebElement alerts;

	@FindBy(xpath = "//button[@class='btn btn-danger']")
	private WebElement popup1;

	@FindBy(xpath = "//a[contains(text(),'Alert with OK &')]")
	private WebElement alert1;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	private WebElement popup2;

	@FindBy(xpath = "//a[text()='Alert with Textbox ']")
	private WebElement alert3;

	@FindBy(xpath = "//button[@class='btn btn-info']")
	private WebElement popup3;

}
