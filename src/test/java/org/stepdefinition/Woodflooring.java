package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.pom.Curtains;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Woodflooring extends BaseClass {

	Curtains curtain;

	@Given("Go to the Carpet Rights URL")
	public void goToTheCarpetRightsURL() {
		launchUrl("https://www.carpetright.co.uk/");
	}

	@When("Go to the Offers Page")
	public void goToTheOffersPage() {
		driver.findElement(By.xpath("//button[contains(text(),'Accept all')]")).click();
		WebElement offers = driver.findElement(By.xpath("//a[text()='Offers']"));
		toMoveCursor(offers);
		offers.click();
	}

	@Then("Go to Wood Flooring Offer")
	public void goToWoodFlooringOffer() {

		WebElement woodFloor = driver.findElement(By.xpath("//h2[text()='Wood flooring offers']"));
		// toScrollDown(woodFloor);
		woodFloor.click();
	}

	@Given("Go to the Curtains page")
	public void goToTheCurtainsPage() {

		launchUrl("https://www.carpetright.co.uk/");
		driver.findElement(By.xpath("//button[contains(text(),'Accept all')]")).click();
		curtain = new Curtains();
		WebElement curtains = curtain.getCurtains();
		toMoveCursor(curtains);
	}

	@Given("Select Cushion Brand")
	public void selectCushionBrand() {
		curtain = new Curtains();
		WebElement brand = curtain.getOrlaBrand();
		brand.click();
	}

	@Given("Select Accessories")
	public void selectAccessories() {
		curtain = new Curtains();
		WebElement accessories = curtain.getAccessories();
		toMoveCursor(accessories);

	}

	@Given("Select Cushion Covers")
	public void selectCushionCovers() {
		curtain = new Curtains();
		WebElement cushionCovers = curtain.getCushionCovers();
		cushionCovers.click();

	}

	@Given("Select Color")
	public void selectColor() {
		curtain = new Curtains();
		WebElement colors = curtain.getColors();
		colors.click();
		curtain.getNaturalColors().click();
	}

	@Given("Select Cushion")
	public void selectCushion() {
		curtain = new Curtains();
		WebElement selectCushion = curtain.getSelectCushion();
		selectCushion.click();
	}

	@When("Select Options of Products")
	public void selectOptionsOfProducts() {
		curtain = new Curtains();
		WebElement finishOption = curtain.getFinishOption();
		selectByVisibleText(finishOption, "PIPED FINISH");
		WebElement sizeOption = curtain.getSizeOption();
		selectByVisibleText(sizeOption, "400MMX400MM");
	}

	@Then("Add to the Baseket")
	public void addToTheBaseket() {
		curtain = new Curtains();
		WebElement addtoBasket = curtain.getAddtoBasket();
		addtoBasket.click();
	}

}
