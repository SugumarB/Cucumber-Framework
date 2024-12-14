package com.omrbranch.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class MyBookingPage extends BaseClass {
	public MyBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='My Booking']")
	private WebElement mybookingbutton;
	@FindBy(xpath = "//h4[contains(text(),'Bookings')]")
	private WebElement Bookingscountmsg;
	@FindBy(xpath = "(//div[@class='room-code']//span)[1]")
	private WebElement mybookingorderId;
	@FindBy(xpath = "(//h5[contains(text(),'Golden Palms Hotel And Spa')])[1]")
	private WebElement mybookinghotelname;
	@FindBy(xpath = "(//strong[@class='total-prize'])[1]")
	private WebElement mybookinghotelamount;

	public WebElement getMybooking() {
		return mybookingbutton;
	}

	public WebElement getBooking() {
		return Bookingscountmsg;
	}

	public WebElement getMybookingorderId() {
		return mybookingorderId;
	}

	public WebElement getMybookinghotelname() {
		return mybookinghotelname;
	}

	public WebElement getMybookinghotelamount() {
		return mybookinghotelamount;
	}

	public void clickMyBooking() {
		elementClick(mybookingbutton);
	}

	public boolean bookingsCountMsg() {
		String bookingcount = elementGetText(Bookingscountmsg);
		boolean expectedmsg = bookingcount.contains("Bookings");
		return expectedmsg;
	}
	public String myBookingOrderId() {
		 String Mybookingorderid = elementGetText(mybookingorderId);
		return Mybookingorderid;

	}
	public String myBookingHotelName() {
		String MyBookingHotelName = elementGetText(mybookinghotelname);
		System.out.println(MyBookingHotelName);
		return MyBookingHotelName;
	}
	public String myBookingHotelPrice() {
		 String MyBookingHotelAmount = elementGetText(mybookinghotelamount);
		String trim = MyBookingHotelAmount.replaceAll("Rs", "").trim();
		System.out.println(trim);
		return trim;
	}
}
