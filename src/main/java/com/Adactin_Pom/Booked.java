package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked {
	public WebDriver driver;
	
	@FindBy(xpath = "//a[normalize-space()='Booked Itinerary']")
	private WebElement Booked;
	
	public Booked(WebDriver book) {
		this.driver = book;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBooked() {
		return Booked;
	}
	
	

}
