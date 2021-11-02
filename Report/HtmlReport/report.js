$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The Username in Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Password in Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 5050536200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Username_in_Username_Field()"
});
formatter.result({
  "duration": 193767800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Password_in_Password_Field()"
});
formatter.result({
  "duration": 159980500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 3525520500,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Search Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user Select The Location",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user Select The Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Select The Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Select The Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Select The Number Of Adults Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Select The Number Of Child Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Click The Search Button And It Navigates To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Location()"
});
formatter.result({
  "duration": 165556100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel()"
});
formatter.result({
  "duration": 154753000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Room_Type()"
});
formatter.result({
  "duration": 151168100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Rooms()"
});
formatter.result({
  "duration": 140300600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Adults_Per_Room()"
});
formatter.result({
  "duration": 167468600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Child_Per_Room()"
});
formatter.result({
  "duration": 130449300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1300006700,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User Confirm The Room In Search Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-confirm-the-room-in-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "user Click The Select Button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user Click The Continue Button It Navigates To The Book A Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Select_Button()"
});
formatter.result({
  "duration": 63436200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Continue_Button_It_Navigates_To_The_Book_A_Hotel()"
});
formatter.result({
  "duration": 1199661600,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "User Book The Room And Payment Details In Search Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-book-the-room-and-payment-details-in-search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "user Enter The Valid First Name",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user Enter The Valid Last Name",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Enter The Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Enter The Valid Credit Card Number",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Choose The Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user Select The Select Month In The Expiry Date Box",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user Select The Select Year In The Expiry Date Box",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Enter The Valid CVV Number",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Click The Book Now Button And It Navigates To The Booking Confirmation",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Valid_First_Name()"
});
formatter.result({
  "duration": 97351600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Valid_Last_Name()"
});
formatter.result({
  "duration": 62854100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Billing_Address()"
});
formatter.result({
  "duration": 168082100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Valid_Credit_Card_Number()"
});
formatter.result({
  "duration": 120902900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Choose_The_Credit_Card_Type()"
});
formatter.result({
  "duration": 145841300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Select_Month_In_The_Expiry_Date_Box()"
});
formatter.result({
  "duration": 167609900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Select_Year_In_The_Expiry_Date_Box()"
});
formatter.result({
  "duration": 130775800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Valid_CVV_Number()"
});
formatter.result({
  "duration": 81717700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation()"
});
formatter.result({
  "duration": 80985600,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "User Click On Search Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-click-on-search-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 35,
  "name": "user Click The Search Hotel Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_The_Search_Hotel_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 6656851200,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "User Click On Booked Itinerary",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-click-on-booked-itinerary",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "user Click On Booked Itinerary And It Navigates To The Booked Itinerary page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Booked_Itinerary_And_It_Navigates_To_The_Booked_Itinerary_page()"
});
formatter.result({
  "duration": 4849540100,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "User Take Screenshot On Booked Itinerery Page And Close The Window",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-take-screenshot-on-booked-itinerery-page-and-close-the-window",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 41,
  "name": "user Takescreenshot On Booked Itinerery Page",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "user Close The Window",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Takescreenshot_On_Booked_Itinerery_Page()"
});
formatter.result({
  "duration": 330203100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Close_The_Window()"
});
formatter.result({
  "duration": 157083300,
  "status": "passed"
});
});