package com.omrbranch.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='col-md-5 hotel-suites']//h5)[1]")
	private WebElement firsthotelname;
	@FindBy(xpath = "(//div[@class='prize']//h2)[1]")
	private WebElement firsthotelprice;
	@FindBy(xpath = "(//div[@class='prize']//a)[1]")
	private WebElement selectfirsthotel;

	public WebElement getFirsthotelname() {
		return firsthotelname;
	}

	public WebElement getFirsthotelprice() {
		return firsthotelprice;
	}

	public WebElement getSelecthotelbutton() {
		return selectfirsthotel;
	}

	public static String FirstHotelName;
	public static String FirstHotePrice;

	public String getFirstHotelName() {
		FirstHotelName = elementGetText(firsthotelname);
		System.out.println(FirstHotelName);
		return FirstHotelName;
	}

	public String getFirstHotelPrice() {
		 FirstHotePrice = elementGetText(firsthotelprice);
		String trim = FirstHotePrice.replace("$", "").trim();
		System.out.println(trim);
		return trim;
		
	}

	public void selectFirstHotel() {
		elementClick(selectfirsthotel);
	}

}
