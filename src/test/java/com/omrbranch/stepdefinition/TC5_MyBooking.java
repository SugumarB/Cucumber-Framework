package com.omrbranch.stepdefinition;

import com.omrbranch.Pages.BookingConfirmPage;
import com.omrbranch.Pages.SelectHotelPage;
import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.object.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class TC5_MyBooking extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	@When("user should navigate to the My booking page")
	public void user_should_navigate_to_thw_my_booking_page() {
		pom.getMyBookingPage().clickMyBooking();
	}

	@Then("user should verify the success message as {string}")
	public void user_should_verify_the_success_message_as(String bookingcount) {
		org.junit.Assert.assertTrue(bookingcount, pom.getMyBookingPage().bookingsCountMsg());
	}

	@Then("user should verify same order Id present or not")
	public void user_should_verify_same_order_id_present_or_not() {
		org.junit.Assert.assertTrue(BookingConfirmPage.OrderId.contains(pom.getMyBookingPage().myBookingOrderId()));
	}

	@Then("user should Verify same hotel name present or not")
	public void user_should_verify_same_hotel_name_present_or_not() {
		org.junit.Assert.assertTrue(SelectHotelPage.FirstHotelName.contains(pom.getMyBookingPage().myBookingHotelName()));
	}

	@Then("user should verify same price present or not")
	public void user_should_verify_same_price_present_or_not() {
		org.junit.Assert.assertTrue(SelectHotelPage.FirstHotePrice.contains(pom.getMyBookingPage().myBookingHotelPrice()));
	}

	@When("user should edit checkindate {string}")
	public void user_should_edit_checkindate(String string) {

	}

	@Then("user should verify after modified checkin date update message as {string}")
	public void user_should_verify_after_modified_checkin_date_update_message_as(String string) {

	}
	

}
