package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.pojo.loginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AmazonLogin extends BaseClass{
	loginPojo p;
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("To launch url of the amazon application")
	public void to_launch_url_of_the_amazon_application() {
	    launchUrl("https://www.amazon.in/");
	}

	@When("To mouse hover the sign in button")
	public void to_mouse_hover_the_sign_in_button() {
		p = new loginPojo();
		moveTheCursor(p.getSignin());
	}

	@When("To click the start here button")
	public void to_click_the_start_here_button() {
		p = new loginPojo();
		clickBtn(p.getStarthere());
	}

	@When("To pass the name in name text box")
	public void to_pass_the_name_in_name_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		Map<String, String> asMap = d.asMap(String.class, String.class);
		p = new loginPojo();
		passText(asMap.get("name1"), p.getName());
	}

	@When("To pass the number in number text box")
	public void to_pass_the_number_in_number_text_box(){
		p = new loginPojo();
		passText("9092703577", p.getNumber());
	}

	@When("To pass the password in password text box")
	public void to_pass_the_password_in_password_text_box(DataTable d) throws InterruptedException  {
		Thread.sleep(3000);
		List<Map<String, String>> asMaps = d.asMaps(String.class, String.class);
		p = new loginPojo();
		passText(asMaps.get(1).get("password3"), p.getPass());
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
		p = new loginPojo();
		clickBtn(p.getLogin());
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
	   closeEntireBrowser();
	}

}