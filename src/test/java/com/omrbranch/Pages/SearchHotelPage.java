package com.omrbranch.Pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[contains(@class,'font35 font-weight-bold')]")
	private WebElement selecthotel;
	@FindBy(xpath = "(//div[@class='prize']//h2)")
	private List<WebElement> Allprices;
	@FindBy(xpath = "//label[text()='Price low to high']")
	private WebElement pricelowtohigh;
	@FindBy(xpath = "//label[text()='Price High to low']")
	private WebElement pricehightolow;
	@FindBy(xpath = "//label[text()='Name Ascending']")
	private WebElement nameAscendingorder;
	@FindBy(xpath = "//label[text()='Name Descending']")
	private WebElement nameDescendingorder;
	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement loginsuccessmsg;
	@FindBy(id = "state")
	private WebElement stateName;
	@FindBy(id = "city")
	private WebElement cityname;
	@FindBy(id = "room_type")
	private WebElement roomtype;
	@FindBy(name = "check_in")
	private WebElement checkindate;
	@FindBy(name = "check_out")
	private WebElement checkoutdate;
	@FindBy(id = "no_rooms")
	private WebElement noofrooms;
	@FindBy(id = "no_adults")
	private WebElement noofadults;
	@FindBy(id = "no_child")
	private WebElement noofchild;
	@FindBy(xpath =  "//button[@id='searchBtn']")
	private WebElement btnsearch;
	@FindBy(id = "hotelsearch_iframe")
	private WebElement hotelsearchiframe;
	@FindBy(id = "invalid-state")
	private WebElement invalidstate;
	@FindBy(id = "invalid-city")
	private WebElement invalidscity;
	@FindBy(id = "invalid-check_in")
	private WebElement invalidcheckin;
	@FindBy(id = "invalid-check_out")
	private WebElement invalidcheckout;
	@FindBy(id = "invalid-no_rooms")
	private WebElement invalidnorooms;
	@FindBy(id = "invalid-no_adults")
	private WebElement invalidnoadults;

	public WebElement getSelecthotel() {
		return selecthotel;
	}

	public List<WebElement> getAllprices() {
		return Allprices;
	}

	public WebElement getPricelowtohigh() {
		return pricelowtohigh;
	}

	public WebElement getPricehightolow() {
		return pricehightolow;
	}

	public WebElement getNameAscendingorder() {
		return nameAscendingorder;
	}

	public WebElement getNameDescendingorder() {
		return nameDescendingorder;
	}

	public WebElement getHotelsearchiframe() {
		return hotelsearchiframe;
	}

	public WebElement getInvalidstate() {
		return invalidstate;
	}

	public WebElement getInvalidscity() {
		return invalidscity;
	}

	public WebElement getInvalidcheckin() {
		return invalidcheckin;
	}

	public WebElement getInvalidcheckout() {
		return invalidcheckout;
	}

	public WebElement getInvalidnorooms() {
		return invalidnorooms;
	}

	public WebElement getInvalidnoadults() {
		return invalidnoadults;
	}

	public WebElement getHotelsearch_iframe() {
		return hotelsearchiframe;
	}

	public WebElement getLoginsuccessmsg() {
		return loginsuccessmsg;
	}

	public WebElement getStateName() {
		return stateName;
	}

	public WebElement getCityname() {
		return cityname;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getNoofadults() {
		return noofadults;
	}

	public WebElement getNoofchild() {
		return noofchild;
	}

	public WebElement getBtnsearch() {
		return btnsearch;
	}

	public void searchHotel(String state, String city, String RoomType, String Checkindate, String Checkoutdate,
			String Noofrooms, String Noofadults, String Noofchild) {
		selectOptionByText(stateName, state);
		selectOptionByText(cityname, city);
		elementSendKeysJs(checkindate, Checkindate);
		elementSendKeysJs(checkoutdate, Checkoutdate);
		selectOptionByText(noofrooms, Noofrooms);
		selectOptionByText(noofadults, Noofadults);
		elementSendKeys(noofchild, Noofchild);
		switchFrameByFrameId("hotelsearch_iframe");
		elementClick(btnsearch);
		switchToParentWindow();
	}

	public void searchHotelMandatoryField(String state, String city, String Checkindate, String Checkoutdate,
			String Noofrooms, String Noofadults) {
		selectOptionByText(stateName, state);
		selectOptionByText(cityname, city);
		elementSendKeysJs(checkindate, Checkindate);
		elementSendKeysJs(checkoutdate, Checkoutdate);
		selectOptionByText(noofrooms, Noofrooms);
		selectOptionByText(noofadults, Noofadults);
		switchFrameByFrameId("hotelsearch_iframe");
		elementClickButtonJs(btnsearch);
	}

	public void searchWithoutClickingFields() {
		switchFrameByFrameId("hotelsearch_iframe");
		elementClick(btnsearch);
		switchToParentWindow();
	}

	public String welcomeMsg() {
		String expectedloginsuccessmsg = elementGetText(loginsuccessmsg);
		return expectedloginsuccessmsg;
	}

	public String getStateErrormsg() {
		String statemsg = elementGetText(invalidstate);
		boolean containstate = statemsg.contains("state");
		return statemsg;
	}

	public String getCityErrorMsg() {
		String citymsg = elementGetText(invalidscity);
		boolean containcity = citymsg.contains("city");
		return citymsg;
	}

	public String getCheckInErrorMsg() {
		String checkin = elementGetText(invalidcheckin);
		boolean containchekin = checkin.contains("Check-in");
		return checkin;
	}

	public String getCheckOutErrorMsg() {
		String checkout = elementGetText(invalidcheckout);
		boolean containcheckout = checkout.contains("Check-out");
		return checkout;
	}

	public String getNoRoomsErrorMsg() {
		String norooms = elementGetText(invalidnorooms);
		boolean containnorooms = norooms.contains("no. of rooms");
		return norooms;
	}

	public String getNoAdultsErrorMsg() {
		String noadults = elementGetText(invalidnoadults);
		return noadults;

	}

	public void setSelecthotel(WebElement selecthotel) {
		this.selecthotel = selecthotel;
	}

	public String hotelMsg() {
		String hotemessage = elementGetText(selecthotel);
		return hotemessage;
	}

	public void priceSortByLowToHigh() throws InterruptedException {
		elementClick(pricelowtohigh);
		Thread.sleep(2000);
	}

	public boolean verifyPriceLowToHigh() throws InterruptedException {
		switchToParentWindow();
		List<Integer> dev = new ArrayList<>();
		for (WebElement num : Allprices) {
			String prices = num.getText();
			String removeDoller = prices.replace("$", "");
			removeDoller.replace(",", "").trim();
			try {
			int inttostring = Integer.parseInt(removeDoller);
			dev.add(inttostring);
			}catch(NumberFormatException e) {}
		
		}
		Thread.sleep(5000);
		List<Integer> qa = new ArrayList<>();
		qa.addAll(dev);
		Collections.sort(qa);
		return qa.equals(dev);
	}
}

