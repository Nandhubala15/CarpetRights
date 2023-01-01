package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.Pojo1ScheduleCall;
import org.pom.Pojo2ScheduleCall;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScheduleCall extends BaseClass {
	Pojo1ScheduleCall pojo1;
	Pojo2ScheduleCall pojo2;

	@Given("Go to the Valid Page")
	public void go_to_the_Valid_Page() {

		driver.get("https://www.carpetright.co.uk/");

	}

	@When("Go to the schedule box")
	public void go_to_the_schedule_box() {
		pojo1 = new Pojo1ScheduleCall();
		pojo1.getCallNow().click();
		pojo1.getScheduleCall().click();

	}

	@When("Select date and time")
	public void select_date_and_time() {
		pojo2 = new Pojo2ScheduleCall();
		toSwitchtoWindow(1);

		WebElement selectTime = pojo2.getSelectTime();
		selectTime.click();
		selectByVisibleText(selectTime, "10:00am");

	}

	@When("Give the personal details")
	public void give_the_personal_details() {

	}

	@Then("Get the Confirmed message")
	public void get_the_Confirmed_message() {

	}

};