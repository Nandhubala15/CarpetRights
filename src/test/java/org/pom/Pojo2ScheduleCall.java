package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo2ScheduleCall extends BaseClass {
	public Pojo2ScheduleCall() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//select[@id='slots-am'])[3]")
	private WebElement selectTime;


	public WebElement getSelectTime() {
		return selectTime;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
