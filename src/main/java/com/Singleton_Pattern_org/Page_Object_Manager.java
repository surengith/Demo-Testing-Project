package com.Singleton_Pattern_org;

import org.openqa.selenium.WebDriver;

import com.Pom.org.Alert_Page;
import com.Pom.org.Register_Page;

public class Page_Object_Manager {

	public WebDriver driver;
	
	public Page_Object_Manager(WebDriver pomdriver) {
		this.driver = pomdriver;
	}
	
	private Register_Page rp;

	public Register_Page getInstanceRegisterPage() {

		rp = new Register_Page(driver);

		return rp;
	}

	private Alert_Page ap;

	public Alert_Page getInstanceAlertPage() {

		ap = new Alert_Page(driver);

		return ap;
	}

}
