package com.omrbranch.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.omrbranch.Pages.SelectHotelPage;
import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.object.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC4_BookingHotelStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();


	@Then("user should save the first hotel name and hotel price")
	public void user_should_save_the_first_hotel_name_and_hotel_price() {
		pom.getSelectHotelPage().getFirstHotelName();
		pom.getSelectHotelPage().getFirstHotelPrice();
	
	}
	@Then("user should  select the first hotel name and price")
	public void user_should_select_the_first_hotel_name_and_price() {
		pom.getSelectHotelPage().selectFirstHotel();

	}
	@Then("user should accept the booking popup alert")
	public void user_should_accept_the_booking_popup_alert() {
		pom.getSelectHotelPage().alertAccept();
	 
	}
	@Then("user should verify the booking confirmation message as {string}")
	public void user_should_verify_the_booking_confirmation_message_as(String string) {
		org.junit.Assert.assertTrue("Verify the bookhotelmessage",pom.getBookHotelPage().expectedBookMsg().contains(string));

	}
	@Then("user should add the guest details {string},{string},{string},{string},{string}")
	public void user_should_add_the_guest_details(String Salutation, String FirstName, String LastName, String MobileNo, String Email) {
	pom.getBookHotelPage().addGuestDetails(Salutation, FirstName, LastName, MobileNo, Email);
	}
	@Then("user should add the GST details {string},{string},{string}")
	public void user_should_add_the_gst_details(String RegNo, String CmpnyName, String CmpnyAddress) {
     pom.getBookHotelPage().addGSTDetails(RegNo, CmpnyName, CmpnyAddress);
	}
	@Then("user should not add the GST details")
	public void user_should_not_add_the_gst_details() {
	 pom.getBookHotelPage().withoutGSTDetails();
	}
	@Then("user should add the special request as {string}")
	public void user_should_add_the_special_request_as(String specialrequest) {
    pom.getBookHotelPage().otherRequests(specialrequest);
	}
	@Then("user should not add the special request as {string}")
	public void user_should_not_add_the_special_request_as(String string) {
	  pom.getBookHotelPage().withoutSpecialRequest();
	}
	@Then("user  should add the payment details proceed with card type {string}")
	public void user_should_add_the_payment_details_proceed_with_card_type(String paymentType, io.cucumber.datatable.DataTable dataTable) {
    List<Map<String,String>>emp = dataTable.asMaps();
    Map<String, String> map =emp.get(0);
    String s1 = map.get("select card");
    String s2 = map.get("cardNo");
    String s3 = map.get("cardName");
    String s4 = map.get("month");
    String s5 = map.get("year");
    String s6 = map.get("CVV");
    pom.getBookHotelPage().cardDetails(paymentType, s1, s2, s3, s4, s5, s6);
	}

	@Then("user  should add the payment details proceed with payment option as UPID {string}")
	public void user_should_add_the_payment_details_proceed_with_payment_option_as_upid(String UPIID) {
		pom.getBookHotelPage().upiDetails(UPIID);
		
	}

	@Then("user should verify after booking success message {string} and save the order ID")
	public void user_should_verify_after_booking_success_message_and_save_the_order_id(String confirmmsg) {
	org.junit.Assert.assertTrue("verify the booking confirmation msg",pom.getBookingConfirmpage().bookingConfirmMsg().contains(confirmmsg));
	pom.getBookingConfirmpage().getBookconfirmmsg();
	}
	@Then("user should verify the the booking ID")
	public void user_should_verify_the_the_booking_id() {
    pom.getBookingConfirmpage().getConfirmId();
	}
	@Then("user should save the booked hotel name  and booking order ID is present or not")
	public void user_should_save_the_booked_hotel_name_and_booking_order_id_is_present_or_not() {
    Assert.assertTrue(SelectHotelPage.FirstHotelName.contains(pom.getBookingConfirmpage().bookedHotelName()));

	}



}





