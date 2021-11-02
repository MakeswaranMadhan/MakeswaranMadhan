package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver;

	@FindBy(xpath = "(//input[@class='login_input'])[1]")
	private WebElement username;

	@FindBy(xpath = "(//input[@class='login_input'])[2]")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement Login;

	public Login_Page(WebDriver home) {
		this.driver = home;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return Login;
	}

}
