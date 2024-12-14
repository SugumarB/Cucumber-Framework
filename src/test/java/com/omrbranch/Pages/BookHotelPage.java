package com.omrbranch.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[@class='px-3 py-2']")
	private WebElement bookhotelverificationmsg;
	@FindBy(id = "own")
	private WebElement Bookingby;
	@FindBy(id = "user_title")
	private WebElement Saluationtype;
	@FindBy(name = "first_name")
	private WebElement firstname;
	@FindBy(name = "last_name")
	private WebElement lastname;
	@FindBy(name = "phone")
	private WebElement phoneno;
	@FindBy(name = "email")
	private WebElement emailaddress;
	@FindBy(id = "gst")
	private WebElement gstcheckbook;
	@FindBy(id = "gst_registration")
	private WebElement registrationno;
	@FindBy(id = "company_name")
	private WebElement companyname;
	@FindBy(id = "company_address")
	private WebElement companyaddress;
	@FindBy(id="step1next")
	private WebElement nextbutton1;
	@FindBy(id= "other_request")
	private WebElement addspecialreq;
	@FindBy(id="step2next")
	private WebElement nextbutton2;
	@FindBy(xpath="//div[@class='credit-card pm']")
	private WebElement paymentoption;
	@FindBy(id="payment_type")
	private WebElement paymenttype;
	@FindBy(id="card_type")
	private WebElement cardtype;
	@FindBy(id="card_no")
	private WebElement cardno;
	@FindBy(id="card_name")
	private WebElement cardname;
	@FindBy(id="card_month")
	private WebElement cardmonth;
	@FindBy (id="card_year")
	private WebElement cardyear;
	@FindBy(id="cvv")
	private WebElement cardcvv;
	@FindBy (id="submitBtn")
	private WebElement submitbutton;
	@FindBy(xpath="//div[@class='upi pm']")
	private WebElement UPIpaymentOption;
	@FindBy(id="upi_id")
	private WebElement upiId;
	
	public WebElement getBookhotelverificationmsg() {
		return bookhotelverificationmsg;
	}
	
	public WebElement getBookingby() {
		return Bookingby;
	}
	
	public WebElement getSaluationtype() {
		return Saluationtype;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPhoneno() {
		return phoneno;
	}

	public WebElement getEmailaddress() {
		return emailaddress;
	}

	public WebElement getGstcheckbook() {
		return gstcheckbook;
	}

	public WebElement getRegistrationno() {
		return registrationno;
	}

	public WebElement getCompanyname() {
		return companyname;
	}

	public WebElement getCompanyaddress() {
		return companyaddress;
	}

	public WebElement getNextbutton1() {
		return nextbutton1;
	}

	public WebElement getAddspecialreq() {
		return addspecialreq;
	}

	public WebElement getNextbutton() {
		return nextbutton2;
	}

	public WebElement getPaymentoption() {
		return paymentoption;
	}

	public WebElement getPaymenttype() {
		return paymenttype;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardname() {
		return cardname;
	}

	public WebElement getCardmonth() {
		return cardmonth;
	}

	public WebElement getCardyear() {
		return cardyear;
	}

	public WebElement getCardcvv() {
		return cardcvv;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	
	public WebElement getUPIpaymentOption() {
		return UPIpaymentOption;
	}

	public WebElement getUpid() {
		return upiId;
	}

	public String expectedBookMsg() {
		String booktext = elementGetText(bookhotelverificationmsg);
		return booktext;
	}
	public void addGuestDetails(String salutaion,String firstName,String lastName,String mobileno ,String email) {

		elementClick(Bookingby);
		elementSendKeys(Saluationtype, salutaion);
		elementSendKeys(firstname, firstName);
		elementSendKeys(lastname, lastName);
		elementSendKeys(phoneno, mobileno);
		elementSendKeys(emailaddress, email);	
	}
	public void addGSTDetails(String RegistrationNo,String CompanyName,String CompanyAddress) {
	elementClick(gstcheckbook);
	elementSendKeys(registrationno, RegistrationNo);
	elementSendKeys(companyname, CompanyName);
	elementSendKeys(companyaddress, CompanyAddress);
	elementClick(nextbutton1);
	}
	public void withoutGSTDetails() {
		elementClick(nextbutton1);
	}
	public void otherRequests(String specialrequest) {
    elementSendKeys(addspecialreq, specialrequest);
    elementClick(nextbutton2);
	}
	public void withoutSpecialRequest() {
		 elementClick(nextbutton2);
	}
	public void cardDetails(String PaymentType ,String CardType,String CardNo,
			String CardName,String CardMonth,String CardYear,String CVVno) {
     elementClick(paymentoption);
     selectOptionByText(paymenttype, PaymentType);
     selectOptionByText(cardtype, CardType);
     elementSendKeys(cardno, CardNo);
     elementSendKeys(cardname, CardName);
     selectOptionByText(cardmonth, CardMonth);
     selectOptionByValue(cardyear, CardYear);
     elementSendKeys(cardcvv, CVVno);
     elementClick(submitbutton);
	}
	public void upiDetails(String UpiId) {
	elementClick(UPIpaymentOption);
    elementSendKeys(upiId, UpiId);
    elementClick(submitbutton);
	}
	
	
}
