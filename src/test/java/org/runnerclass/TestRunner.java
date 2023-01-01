package org.runnerclass;

import org.base.BaseClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFiles\\ScheduleCall.feature", glue = "org.stepdefinition", dryRun = false, strict = true, monochrome = true, snippets = SnippetType.UNDERSCORE, plugin = {
		"html:Reports\\HTMLReports", "json:Reports\\JsonReports\\Schedulecall.json",
		"junit:Reports\\JunitReports\\ScheduleCall.xml", "rerun:Rerun\\ScheduleCall.txt" })

public class TestRunner extends BaseClass {
	@AfterClass

	public static void reportJVM() {
		JVMReports.report("Reports\\\\JsonReports\\\\Schedulecall.json");
	}

}
