package com.Step_Definition.org;

import org.openqa.selenium.WebDriver;
import com.Base.org.Base_class;
import com.Properties.org.File_Reader_Manager;
import com.Singleton_Pattern_org.Page_Object_Manager;
import com.Test_Runner.org.Test_Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_class {

	public static  WebDriver driver=Test_Runner.driver;
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		launchUrl(url);
	}

	@When("^user Enter The First Name In The First Name Field$")
	public void user_Enter_The_First_Name_In_The_First_Name_Field() throws Throwable {
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstname();
		passInput(pom.getInstanceRegisterPage().getFirstname(), firstname);
	}

	@When("^user Enter The Last Name In The Last Name Field$")
	public void user_Enter_The_Last_Name_In_The_Last_Name_Field() throws Throwable {
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastname();
		passInput(pom.getInstanceRegisterPage().getLastname(), lastname);
	}

	@When("^user Enter The Address In The Address Field$")
	public void user_Enter_The_Address_In_The_Address_Field() throws Throwable {
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		passInput(pom.getInstanceRegisterPage().getAddress(), address);
	}

	@When("^user Enter The Email In The Email Field$")
	public void user_Enter_The_Email_In_The_Email_Field() throws Throwable {
		String email = File_Reader_Manager.getInstanceFRM().getInstanceCR().getEmail();
		passInput(pom.getInstanceRegisterPage().getEmail(), email);
	}

	@When("^user Enter The Phone Number In The Phone Number Field$")
	public void user_Enter_The_Phone_Number_In_The_Phone_Number_Field() throws Throwable {
		String phoneNumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPhoneNumber();
		passInput(pom.getInstanceRegisterPage().getPhnum(), phoneNumber);
	}

	@When("^user Click The Radio Button To Select The Gender$")
	public void user_Click_The_Radio_Button_To_Select_The_Gender() throws Throwable {
		clikOnElement(pom.getInstanceRegisterPage().getGender());
	}

	@When("^user Click The Checkbox To Select The Hobbies$")
	public void user_Click_The_Checkbox_To_Select_The_Hobbies() throws Throwable {
		clikOnElement(pom.getInstanceRegisterPage().getHobbies());
	}

	@When("^user Select The Language In The Language Field$")
	public void user_Select_The_Language_In_The_Language_Field() throws Throwable {
		clikOnElement(pom.getInstanceRegisterPage().getLanguages());
		wait(1000);
		clikOnElement(pom.getInstanceRegisterPage().getLanguage());
	}

	@When("^user Select The Skills In The Skills Field$")
	public void user_Select_The_Skills_In_The_Skills_Field() throws Throwable {
		String skills = File_Reader_Manager.getInstanceFRM().getInstanceCR().getSkills();
		selectByVisibleText(pom.getInstanceRegisterPage().getSkills(), skills);
	}

	@When("^user Select The Country In The Country Field$")
	public void user_Select_The_Country_In_The_Country_Field() throws Throwable {
		String countries = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCountries();
		selectByVisibleText(pom.getInstanceRegisterPage().getCountries(), countries);
	}

	@When("^user Select The Country In Select Country Field$")
	public void user_Select_The_Country_In_Select_Country_Field() throws Throwable {
		String country = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCountry();
		selectByVisibleText(pom.getInstanceRegisterPage().getCountry(), country);
	}

	@When("^user Select The Year In The Year Field$")
	public void user_Select_The_Year_In_The_Year_Field() throws Throwable {
		String year = File_Reader_Manager.getInstanceFRM().getInstanceCR().getYear();
		selectByVisibleText(pom.getInstanceRegisterPage().getYear(), year);
	}

	@When("^user Select The Month In The Month Field$")
	public void user_Select_The_Month_In_The_Month_Field() throws Throwable {
		String month = File_Reader_Manager.getInstanceFRM().getInstanceCR().getMonth();
		selectByVisibleText(pom.getInstanceRegisterPage().getMonth(), month);
	}

	@When("^user Select The Day In The Day Field$")
	public void user_Select_The_Day_In_The_Day_Field() throws Throwable {
		String day = File_Reader_Manager.getInstanceFRM().getInstanceCR().getDay();
		selectByVisibleText(pom.getInstanceRegisterPage().getDay(), day);
	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
		String first_Password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirst_Password();
		passInput(pom.getInstanceRegisterPage().getFpassword(), first_Password);
	}

	@When("^user Enter The Password In The Confirm Password Field$")
	public void user_Enter_The_Password_In_The_Confirm_Password_Field() throws Throwable {
		String Second_Password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getSecond_Password();
		passInput(pom.getInstanceRegisterPage().getSpassword(), Second_Password);
	}

	@When("^user Click The Submit Button To Register The Registration$")
	public void user_Click_The_Submit_Button_To_Register_The_Registration() throws Throwable {
		clikOnElement(pom.getInstanceRegisterPage().getSubmit());
		Thread.sleep(3000);
	}

	@Then("^user Take ScreenShot$")
	public void user_Take_ScreenShot() throws Throwable {
		screenShot("Loginpage");
		Thread.sleep(3000);
	}

	@When("^user Click The SwitchTo Option$")
	public void user_Click_The_SwitchTo_Option() throws Throwable {
		clikOnElement(pom.getInstanceAlertPage().getSwitchTo());
	}

	@When("^user Click The Alerts In The SwitchTo Option$")
	public void user_Click_The_Alerts_In_The_SwitchTo_Option() throws Throwable {

		clikOnElement(pom.getInstanceAlertPage().getAlerts());
	}

	@When("^user Click The Click The Button To Display An Alert Box Button$")
	public void user_Click_The_Click_The_Button_To_Display_An_Alert_Box_Button() throws Throwable {

		clikOnElement(pom.getInstanceAlertPage().getPopup1());
		Thread.sleep(3000);
	}

	@When("^user Accept The Popup Alert Message$")
	public void user_Accept_The_Popup_Alert_Message() throws Throwable {
		//alertGetText();
		Thread.sleep(3000);
		alert_Accept("accept");

	}

	@When("^user Click The Alert With Ok & Cancel Option$")
	public void user_Click_The_Alert_With_Ok_Cancel_Option() throws Throwable {
		clikOnElement(pom.getInstanceAlertPage().getAlert1());
	}

	@When("^user Click The Click The Button To Display A Confirm Box Button$")
	public void user_Click_The_Click_The_Button_To_Display_A_Confirm_Box_Button() throws Throwable {
		clikOnElement(pom.getInstanceAlertPage().getPopup2());
		Thread.sleep(3000);
	}

	@When("^user Dismiss The Popup Alert Message$")
	public void user_Dismiss_The_Popup_Alert_Message() throws Throwable {
		alert_Accept("dismiss");
	}

	@When("^user Click The Alert With Textbox Option$")
	public void user_Click_The_Alert_With_Textbox_Option() throws Throwable {
		clikOnElement(pom.getInstanceAlertPage().getAlert3());
	}

	@When("^user Click The Click The Button To Demonstrate The Prompt Box Button$")
	public void user_Click_The_Click_The_Button_To_Demonstrate_The_Prompt_Box_Button() throws Throwable {
		clikOnElement(pom.getInstanceAlertPage().getPopup3());
		Thread.sleep(3000);
	}

	@When("^user Enter The Text In Alert Text Field$")
	public void user_Enter_The_Text_In_Alert_Text_Field() throws Throwable {
		alertSendkeys("suren");
		alertGetText();
		Thread.sleep(3000);
		alert_Accept("accept");
	}

	@Then("^user Take ScreenShot(\\d+)$")
	public void user_Take_ScreenShot(int arg1) throws Throwable {
		screenShot("Alertpage");
	}

}
