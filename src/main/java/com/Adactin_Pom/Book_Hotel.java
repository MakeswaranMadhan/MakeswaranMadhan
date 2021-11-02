package com.Adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public WebDriver driver;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement first;
	
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement last;
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement addres;
	
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement card;
	
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cardType;
	
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement month;
	
	@FindBy (xpath = "//select[@name='cc_exp_year']")
	private WebElement year;
	
	@FindBy (xpath = "//input[@name='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement book;
	
	
	public Book_Hotel(WebDriver home) {
		this.driver = home;
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getAddres() {
		return addres;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

}
