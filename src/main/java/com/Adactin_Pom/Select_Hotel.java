package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public WebDriver driver;
	
	
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotel_name;
	
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement room;
	
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement room_count;
	
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adult_Per_Room;
	
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement child_Per_Room;
	
	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement submit;
	
	
	
	
	public Select_Hotel(WebDriver hotel) {
		this.driver = hotel;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel_name() {
		return hotel_name;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoom_count() {
		return room_count;
	}

	public WebElement getAdult_Per_Room() {
		return adult_Per_Room;
	}

	public WebElement getChild_Per_Room() {
		return child_Per_Room;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
