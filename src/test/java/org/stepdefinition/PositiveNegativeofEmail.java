//package org.stepdefinition;
//
//import org.base.BaseClass;
//import org.pojo.loginPojo;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class PositiveNegativeofEmail extends BaseClass{
//	@Given("User has to launch the chrome browser and maxmize window")
//	public void user_has_to_launch_the_chrome_browser_and_maxmize_window() {
//	    launchBrowser();
//	    windowMaximize();
//	}
//
//	@When("User has to hit the gmail url")
//	public void user_has_to_hit_the_gmail_url() {
//	   launchUrl("https://www.gmail.com/");
//	}
//
//	@When("User has to pass the data {string}in email field")
//	public void user_has_to_pass_the_data_in_email_field(String em) {
//	    loginPojo p = new loginPojo();
//	    passText(em, p.getEmail());
//	}
//
//	@When("User has to click next button")
//	public void user_has_to_click_next_button() {
//		loginPojo p = new loginPojo();
//		clickBtn(p.getLogin());
//	}
//
//	@Then("User has to close the browser")
//	public void user_has_to_close_the_browser() {
//	   closeEntireBrowser();
//	}
//}
