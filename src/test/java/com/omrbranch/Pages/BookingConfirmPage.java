package com.omrbranch.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookingConfirmPage extends BaseClass {
	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()=' Booking is Confirmed ']")
	private WebElement bookconfirmmsg;
	@FindBy(xpath = "//h2[@class='couppon-code']//strong")
	private WebElement orderId;
	@FindBy(xpath = "//p[text()='Hotel ']//strong")
	private WebElement bookedhotelname;
	
	public WebElement getBookconfirmmsg() {
		return bookconfirmmsg;
	}

	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getBookedhotelname() {
		return bookedhotelname;
	}

	public String bookingConfirmMsg() {
		String confirmmsg = elementGetText(bookconfirmmsg);
		boolean expectedmsg = confirmmsg.contains("Booking");
		System.out.println(expectedmsg);
		return confirmmsg;
	}

	public static String OrderId;

	public String getConfirmId() {
		 return OrderId = elementGetText(orderId);
	}

	public static String HotelName;

	public String bookedHotelName() {
		HotelName = elementGetText(bookedhotelname);
		System.out.println(HotelName);
		return HotelName;
	}
	
}
