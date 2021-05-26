package org.stepdef;

import org.functional.LibGlobal;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookesClass extends LibGlobal {
	@Before
	public void beforeScenario() {
		System.out.println("Before Each Scenario");

	}

	@After
	public void afterSceanrio() {
		System.out.println("After Each Scenario");
	}

}
