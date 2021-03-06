package org.runner;

import org.functional.ReportGeneration;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources" }, glue = {
		"org.stepdef" }, dryRun = false, monochrome = true, plugin = { "pretty",
				"html:C:\\Users\\vels\\eclipse-workspace\\CucumberSample\\target",
				"json:C:\\Users\\vels\\eclipse-workspace\\CucumberSample\\target\\fb.json",
				"junit:C:\\Users\\vels\\eclipse-workspace\\CucumberSample\\target\\fb.xml",
				"json:C:\\Users\\vels\\eclipse-workspace\\CucumberSample\\target\\Sample.json" }, snippets = SnippetType.CAMELCASE)

public class TestRunner {

	@AfterClass
	public static void afterClass() {
		ReportGeneration.generateJVMReport("C:\\Users\\vels\\eclipse-workspace\\CucumberSample\\target\\Sample.json");

	}

	private void tc1() {

	}

	private void tc2() {

	}

	private void tc3() {

	}

	private void tc5() {
		// TODO Auto-generated method stub

	}

	private void tc6() {
		// TODO Auto-generated method stub

	}

	private void tc7() {
		// TODO Auto-generated method stub

	}

	private void tc8() {
		// TODO Auto-generated method stub

	}

	
}
