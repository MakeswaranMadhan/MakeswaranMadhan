package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_Hotel {
	
	public WebDriver driver;
	
	
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement click;
	
	@FindBy(xpath = "//input[@name='continue']")
	private WebElement conti;
	
	
	public Click_Hotel(WebDriver click_C) {
		this.driver = click_C;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getConti() {
		return conti;
	}

}
