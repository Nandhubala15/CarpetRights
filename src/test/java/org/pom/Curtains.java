package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Curtains extends BaseClass {
	public Curtains() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Curtains & Blinds']")
	private WebElement curtains;
	
	@FindBy(xpath="//span[text()='Orla Kiely']")
	private WebElement orlaBrand;
	
	@FindBy(xpath="//span[text()='Accessories']")
	private WebElement accessories;
	
	@FindBy(xpath="//span[text()='Cushion Covers']")
	private WebElement cushionCovers;
	
	@FindBy(xpath="//h4[text()='Colour']")
	private WebElement colors;
	
	@FindBy(xpath="(//span[contains(text(),'Natural')])[3]")
	private WebElement naturalColors;
	
	@FindBy(xpath="(//a[@aria-label='British-Birds-Pastels'])[2]")
	private WebElement selectCushion;
	
	@FindBy(xpath="//select[@id='pa_finish']")
	private WebElement finishOption;
	
	@FindBy(xpath="//select[@id='pa_size']")
	private WebElement sizeOption;
	
	@FindBy(xpath="(//button[text()='Add to basket'])[1]")
	private WebElement addtoBasket;
	
	
	

	public WebElement getCurtains() {
		return curtains;
	}

	public WebElement getOrlaBrand() {
		return orlaBrand;
	}

	public WebElement getAccessories() {
		return accessories;
	}

	public WebElement getCushionCovers() {
		return cushionCovers;
	}

	public WebElement getColors() {
		return colors;
	}

	public WebElement getNaturalColors() {
		return naturalColors;
	}

	public WebElement getSelectCushion() {
		return selectCushion;
	}

	public WebElement getFinishOption() {
		return finishOption;
	}

	public WebElement getSizeOption() {
		return sizeOption;
	}

	public WebElement getAddtoBasket() {
		return addtoBasket;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
