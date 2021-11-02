package com.Config_Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Read_Config {

	public static Properties p;

	public Read_Config() throws Throwable {
		File f = new File(
				"C:\\Users\\Madhan\\eclipse-workspace\\Adactin_Project\\src\\main\\java\\com\\Config\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}

	public String getUsername() throws Throwable {

		String username = p.getProperty("username");
		return username;

	}

	public String getPassword() throws Throwable {

		String password = p.getProperty("password");
		return password;
	}

	public String getFirstname() {

		String firstname = p.getProperty("firstname");
		return firstname;

	}

	public String getLastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}

	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}

	public String getCardnumber() {
		String card = p.getProperty("cardnumber");
		return card;

	}

	public String getCvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}

}
