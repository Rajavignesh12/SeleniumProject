package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPojo extends BaseClass{
	public loginPojo() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//span[text()='Hello, sign in']")
	private WebElement signin;
	
	@FindBy(xpath = "(//a[text()='Start here.'])[1]")
	private WebElement starthere;
	
	@FindBy(id = "ap_customer_name")
	private WebElement name;
	
	@FindBy(xpath = "//input[@data-validation-id='phoneNumber']")
	private WebElement number;
	
	@FindBy(name = "password")
	private WebElement pass;
	
	@FindBy(id = "continue")
	private WebElement login;

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getStarthere() {
		return starthere;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getNumber() {
		return number;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
}
