package com.omrbranch.Pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class LoginPage extends BaseClass {
public LoginPage() {
PageFactory.initElements(driver, this);
}
@FindBy(id = "errorMessage")
private WebElement errormsg;
@FindBy(id="email")
private WebElement useremail;
@FindBy(id="pass")
private WebElement userpassword;
@FindBy(xpath="//button[@value='login']")
private WebElement btnlogin;
public WebElement getUseremail() {
	return useremail;
}
public WebElement getUserpassword() {
	return userpassword;
}
public WebElement getBtnlogin() {
	return btnlogin;
}
public WebElement getErrormsg() {
	return errormsg;
}
public void login(String emailId, String password) {
elementSendKeys(useremail, emailId);
elementSendKeys(userpassword, password);
elementClick(btnlogin);
}
public void loginenter(String emailId, String password) throws AWTException {
	elementSendKeys(useremail,emailId );
	elementSendKeys(userpassword, password);
	enter();
}
public String errormessage() {
String msg = elementGetText(errormsg);
return msg;
}
}


