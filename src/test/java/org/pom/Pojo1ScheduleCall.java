package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo1ScheduleCall extends BaseClass {
	
	public Pojo1ScheduleCall() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Call Now']")
	private WebElement callNow;
	
	@FindBy(xpath="//span[text()='Schedule Call']")
	private WebElement scheduleCall;

	public WebElement getCallNow() {
		return callNow;
	}

	public WebElement getScheduleCall() {
		return scheduleCall;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
