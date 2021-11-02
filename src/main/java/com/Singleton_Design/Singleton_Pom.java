package com.Singleton_Design;

import org.openqa.selenium.WebDriver;

import com.Adactin_Pom.Book_Hotel;
import com.Adactin_Pom.Booked;
import com.Adactin_Pom.Click_Hotel;
import com.Adactin_Pom.Confirm_Booking;
import com.Adactin_Pom.Login_Page;
import com.Adactin_Pom.Select_Hotel;

public class Singleton_Pom {

	public WebDriver driver;

	private Login_Page lp;
	private Select_Hotel hotel;
	private Click_Hotel clik_hot;
	private Book_Hotel booking_Hotel;
	private Confirm_Booking cb;
	private Booked bb;

	public Singleton_Pom(WebDriver driver2) {
		this.driver = driver2;

	}

	public Login_Page getInstanceLp() {
		lp = new Login_Page(driver);
		return lp;
	}

	public Select_Hotel getInstanceHotel() {
		hotel = new Select_Hotel(driver);
		return hotel;
	}

	public Click_Hotel getInstanceClik_hot() {
		clik_hot = new Click_Hotel(driver);
		return clik_hot;
	}

	public Book_Hotel getInstanceBooking_Hotel() {
		booking_Hotel = new Book_Hotel(driver);
		return booking_Hotel;
	}

	public Confirm_Booking getInstanceCb() {
		cb = new Confirm_Booking(driver);
		return cb;
	}

	public Booked getInstanceBb() {
		bb = new Booked(driver);
		return bb;
	}
}
