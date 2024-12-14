package com.omrbranch.object;

import com.omrbranch.Pages.BookHotelPage;
import com.omrbranch.Pages.BookingConfirmPage;
import com.omrbranch.Pages.LoginPage;
import com.omrbranch.Pages.MyBookingPage;
import com.omrbranch.Pages.SearchHotelPage;
import com.omrbranch.Pages.SelectHotelPage;

public class PageObjectManager {
 private LoginPage loginpage;
 SearchHotelPage searchHotelPage;
 SelectHotelPage selectHotelPage;
 BookHotelPage bookHotelPage;
 BookingConfirmPage bookingConfirmpage;
 MyBookingPage myBookingPage;
public LoginPage getLoginpage() {
	return (loginpage== null)? loginpage = new LoginPage():loginpage;
}
public SearchHotelPage getSearchHotelPage() {
	return (searchHotelPage == null)? searchHotelPage = new SearchHotelPage():searchHotelPage;
}
public SelectHotelPage getSelectHotelPage() {
	return (selectHotelPage == null)? selectHotelPage = new SelectHotelPage():selectHotelPage;
}
public BookHotelPage getBookHotelPage() {
	return (bookHotelPage == null)? bookHotelPage = new BookHotelPage():bookHotelPage;
}
public BookingConfirmPage getBookingConfirmpage() {
	return (bookingConfirmpage== null)? bookingConfirmpage= new BookingConfirmPage():bookingConfirmpage;
}
public MyBookingPage getMyBookingPage() {
	return (myBookingPage== null)? myBookingPage = new MyBookingPage():myBookingPage;
}
}
