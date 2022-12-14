package com.Properties.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws IOException {
		File f = new File(
				"C:\\Users\\Surendhar\\eclipse-workspace\\Maven_Demo_Testing_Project\\src\\main\\java\\com\\Properties\\org\\Demo.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);
	}

	public String getBrowser() throws IOException {

		String browser = p.getProperty("Browser");
		return browser;

	}

	public String getUrl() {
		String url = p.getProperty("Url");
		return url;
	}

	public String getFirstname() {
		String firstnamne = p.getProperty("Firstname");
		return firstnamne;
	}

	public String getLastname() {
		String Lastnamne = p.getProperty("Lastname");
		return Lastnamne;
	}

	public String getAddress() {
		String Address = p.getProperty("Address");
		return Address;
	}

	public String getEmail() {
		String Email = p.getProperty("Email");
		return Email;
	}

	public String getPhoneNumber() {
		String PhoneNumber = p.getProperty("Phnum");
		return PhoneNumber;
	}

	public String getSkills() {
		String Skills = p.getProperty("Skills");
		return Skills;
	}

	public String getCountries() {
		String Countries = p.getProperty("Countries");
		return Countries;
	}

	public String getCountry() {
		String Country = p.getProperty("Country");
		return Country;
	}

	public String getYear() {
		String Year = p.getProperty("Year");
		return Year;
	}

	public String getMonth() {
		String Month = p.getProperty("Month");
		return Month;
	}

	public String getDay() {
		String Day = p.getProperty("Day");
		return Day;
	}

	public String getFirst_Password() {
		String First_Password = p.getProperty("First_Password");
		return First_Password;
	}

	public String getSecond_Password() {
		String Second_Password = p.getProperty("Second_Password");
		return Second_Password;
	}

}
