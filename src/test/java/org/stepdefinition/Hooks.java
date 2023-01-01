package org.stepdefinition;

import java.time.Duration;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before

	public void openBrowser() {

		toOpenChromeDriver();
		Maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

	}

	@After
	public void snap(Scenario s) {

		TakesScreenshot screen = (TakesScreenshot) driver;
		byte[] as = screen.getScreenshotAs(OutputType.BYTES);
		s.embed(as, "image/png", "Screenshot Taken");

	}

	@After
	public void closeBrows() {

		driver.quit();

	}

}
