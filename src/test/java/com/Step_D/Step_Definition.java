package com.Step_D;

import org.openqa.selenium.WebDriver;

import com.Adactin_Project.Base_Class;
import com.Config_Reader.File_Reader;
import com.Runner.Runner_Class;
import com.Singleton_Design.Singleton_Pom;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class{

	public static WebDriver driver = Runner_Class.driver;
	
	public static Singleton_Pom pom = new Singleton_Pom(driver);
	
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		
		geturl("http://adactinhotelapp.com/");
	}

	@When("^user Enter The Username in Username Field$")
	public void user_Enter_The_Username_in_Username_Field() throws Throwable {
		String username = File_Reader.getInstanceFR().getInstanceCR().getUsername();
		Inputvalues(pom.getInstanceLp().getUsername(), username);
	}

	@When("^user Enter The Password in Password Field$")
	public void user_Enter_The_Password_in_Password_Field() throws Throwable {
		String password = File_Reader.getInstanceFR().getInstanceCR().getPassword();
		Inputvalues(pom.getInstanceLp().getPassword(), password);
	} 

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstanceLp().getLogin());
		waitForSeconds(10);
	}

	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		dropdown(pom.getInstanceHotel().getLocation(), "Melbourne");
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		dropdown(pom.getInstanceHotel().getHotel_name(), "Hotel Sunshine");
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		dropdown(pom.getInstanceHotel().getRoom(), "Double");
	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		dropdown(pom.getInstanceHotel().getRoom_count(), "2");
	}

	@When("^user Select The Number Of Adults Per Room$")
	public void user_Select_The_Number_Of_Adults_Per_Room() throws Throwable {
		dropdown(pom.getInstanceHotel().getAdult_Per_Room(), "2");
		
	}

	@When("^user Select The Number Of Child Per Room$")
	public void user_Select_The_Number_Of_Child_Per_Room() throws Throwable {
		dropdown(pom.getInstanceHotel().getChild_Per_Room(), "1");
	}

	@Then("^user Click The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstanceHotel().getSubmit());
		waitForSeconds(10);
	}

	@When("^user Click The Select Button$")
	public void user_Click_The_Select_Button() throws Throwable {
		clickOnElement(pom.getInstanceClik_hot().getClick());
	}

	@Then("^user Click The Continue Button It Navigates To The Book A Hotel$")
	public void user_Click_The_Continue_Button_It_Navigates_To_The_Book_A_Hotel() throws Throwable {
		clickOnElement(pom.getInstanceClik_hot().getConti());
	}

	@When("^user Enter The Valid First Name$")
	public void user_Enter_The_Valid_First_Name() throws Throwable {
		String firstname = File_Reader.getInstanceFR().getInstanceCR().getFirstname();
		Inputvalues(pom.getInstanceBooking_Hotel().getFirst(), firstname);
	}

	@When("^user Enter The Valid Last Name$")
	public void user_Enter_The_Valid_Last_Name() throws Throwable {
		String lastname = File_Reader.getInstanceFR().getInstanceCR().getLastname();
		Inputvalues(pom.getInstanceBooking_Hotel().getLast(), lastname);
	}

	@When("^user Enter The Billing Address$")
	public void user_Enter_The_Billing_Address() throws Throwable {
		String address = File_Reader.getInstanceFR().getInstanceCR().getAddress();
		Inputvalues(pom.getInstanceBooking_Hotel().getAddres(), address);
	}

	@When("^user Enter The Valid Credit Card Number$")
	public void user_Enter_The_Valid_Credit_Card_Number() throws Throwable {
		String cardnumber = File_Reader.getInstanceFR().getInstanceCR().getCardnumber();
		Inputvalues(pom.getInstanceBooking_Hotel().getCard(), cardnumber);
	}

	@When("^user Choose The Credit Card Type$")
	public void user_Choose_The_Credit_Card_Type() throws Throwable {
		dropdown(pom.getInstanceBooking_Hotel().getCardType(), "VISA");
	}

	@When("^user Select The Select Month In The Expiry Date Box$")
	public void user_Select_The_Select_Month_In_The_Expiry_Date_Box() throws Throwable {
		dropdown(pom.getInstanceBooking_Hotel().getMonth(),"May");
	}

	@When("^user Select The Select Year In The Expiry Date Box$")
	public void user_Select_The_Select_Year_In_The_Expiry_Date_Box() throws Throwable {
		dropdown(pom.getInstanceBooking_Hotel().getYear(), "2022");
	}

	@When("^user Enter The Valid CVV Number$")
	public void user_Enter_The_Valid_CVV_Number() throws Throwable {
		String cvv = File_Reader.getInstanceFR().getInstanceCR().getCvv();
		Inputvalues(pom.getInstanceBooking_Hotel().getCvv(), cvv);
	}

	@Then("^user Click The Book Now Button And It Navigates To The Booking Confirmation$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation() throws Throwable {
		clickOnElement(pom.getInstanceBooking_Hotel().getBook());
		waitForSeconds(10);
	
	}

	@Then("^user Click The Search Hotel Button And It Navigates To The Search Hotel Page$")
	public void user_Click_The_Search_Hotel_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	  
		clickOnElement(pom.getInstanceCb().getSearch());
	}

	@Then("^user Click On Booked Itinerary And It Navigates To The Booked Itinerary page$")
	public void user_Click_On_Booked_Itinerary_And_It_Navigates_To_The_Booked_Itinerary_page() throws Throwable {
		clickOnElement(pom.getInstanceBb().getBooked());
		Sleep(3000);   
	}

	@When("^user Takescreenshot On Booked Itinerery Page$")
	public void user_Takescreenshot_On_Booked_Itinerery_Page() throws Throwable {
		screenshot("snap1.png");
	}

	@Then("^user Close The Window$")
	public void user_Close_The_Window() throws Throwable {
		close();
	}



}
