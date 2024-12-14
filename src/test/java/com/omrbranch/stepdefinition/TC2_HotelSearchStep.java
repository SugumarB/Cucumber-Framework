package com.omrbranch.stepdefinition;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.object.PageObjectManager;

import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class TC2_HotelSearchStep extends BaseClass {
PageObjectManager pom = new PageObjectManager();

	@Then("user should search hotel  {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_search_hotel(String state, String city, String roomtype, String checkin, String checkout, String norooms, String noadults, String nochild) {
		pom.getSearchHotelPage().searchHotel(state, city, roomtype, checkin, checkout, norooms, noadults, nochild);
	}

	@Then("user should search hotel  {string},{string},{string},{string},{string},{string}")
	public void user_should_search_hotel(String state, String city, String checkin, String checkout, String norooms, String noadults) {
		pom.getSearchHotelPage().searchHotelMandatoryField(state, city, checkin, checkout, norooms, noadults);
	}
	
	@Then("user should click the search button without clicking any field")
	public void user_should_click_the_search_button_without_clicking_any_field() {
	   pom.getSearchHotelPage().searchWithoutClickingFields();
	}

	@Then("user should verify error messages {string},{string},{string},{string},{string},{string}")
	public void user_should_verify_error_messages(String state, String city, String checkin, String checkout, String noofrooms, String noofadults) {
		pom.getSearchHotelPage().getStateErrormsg();
        pom.getSearchHotelPage().getCityErrorMsg();
        pom.getSearchHotelPage().getCheckInErrorMsg();
        pom.getSearchHotelPage().getCheckOutErrorMsg();
        pom.getSearchHotelPage().getNoRoomsErrorMsg();
        pom.getSearchHotelPage().getNoAdultsErrorMsg();
       
	}
	@Then("user Should verify error messages as {string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_error_messages_as_and(String stateerrormsg, String cityerrormsg, String checkinerrormsg, String checkouterrormsg, String noroomserrormsg, String noadultserrormsg) {
        org.junit.Assert.assertEquals(stateerrormsg,pom.getSearchHotelPage().getStateErrormsg());
        org.junit.Assert.assertEquals(cityerrormsg,pom.getSearchHotelPage().getCityErrorMsg());
        org.junit.Assert.assertEquals(checkinerrormsg,pom.getSearchHotelPage().getCheckInErrorMsg());
        org.junit.Assert.assertEquals(checkouterrormsg,pom.getSearchHotelPage().getCheckOutErrorMsg());
        org.junit.Assert.assertEquals(noroomserrormsg,pom.getSearchHotelPage().getNoRoomsErrorMsg());
        org.junit.Assert.assertEquals(noadultserrormsg,pom.getSearchHotelPage().getNoAdultsErrorMsg());  
	}

	@Then("user should verify after the search hotel success message as {string}")
	public void user_should_verify_after_the_search_hotel_success_message_as(String expectedhotelmsg) throws InterruptedException {
		org.junit.Assert.assertEquals(expectedhotelmsg,pom.getSearchHotelPage().hotelMsg());
	}
	@Then("user should click the price sort by low to high button")
	public void user_should_click_the_price_sort_by_low_to_high_button() throws InterruptedException {
	 pom.getSearchHotelPage().priceSortByLowToHigh();
	 pom.getSearchHotelPage().verifyPriceLowToHigh();
	}




	
}
