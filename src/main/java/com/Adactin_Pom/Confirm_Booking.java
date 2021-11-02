package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Booking {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='search_hotel']")
	private WebElement Search;
	
	public Confirm_Booking(WebDriver confirm) {
		this.driver = confirm;
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getSearch() {
		return Search;
	}

}
