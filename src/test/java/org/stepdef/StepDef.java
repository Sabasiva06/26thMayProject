package org.stepdef;

import org.functional.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends LibGlobal {
	@Given("user is on Adacting page")
	public void userIsOnAdactingPage() {
		getDriver();
		getLaunch("https://adactinhotelapp.com/index.php");
	}

	@When("user should enter username and password")
	public void userShouldEnterUsernameAndPassword() {
		WebElement txtUsername = driver.findElement(By.id("username"));
		enterText(txtUsername, "karthi007");
		WebElement txtPassword = driver.findElement(By.id("password"));
		enterText(txtPassword, "Karthi@1989");
	}

	@When("User should click login button")
	public void userShouldClickLoginButton() {
		WebElement btnLogin = driver.findElement(By.id("login"));
		buttonCLick(btnLogin);
	}

	@When("user on Serach page need to enter Select location , noofroom,cid,cod,adult per room")
	public void userOnSerachPageNeedToEnterSelectLocationNoofroomCidCodAdultPerRoom() {
		WebElement txtLocation = driver.findElement(By.id("location"));
		enterText(txtLocation, "Melbourne");
		WebElement txtRoomNos = driver.findElement(By.id("room_nos"));
		enterText(txtRoomNos, "2 - Two");
		WebElement txtDateIn = driver.findElement(By.id("datepick_in"));
		enterText(txtDateIn, "22-05-21");
		WebElement txtDateOut = driver.findElement(By.id("datepick_out"));
		enterText(txtDateOut, "23-05-21");
		WebElement txtAdultRoom = driver.findElement(By.id("adult_room"));
		enterText(txtAdultRoom, "1 - One");
	}

	@When("User need to clik search button")
	public void userNeedToClikSearchButton() {
		WebElement btnSearch = driver.findElement(By.id("Submit"));
		buttonCLick(btnSearch);
	}

	@When("user need to select hotels,roomtype,child per room")
	public void userNeedToSelectHotelsRoomtypeChildPerRoom() {
		WebElement txtHotel = driver.findElement(By.id("hotels"));
		enterText(txtHotel, "Hotel Sunshine");

		WebElement txtRoomType = driver.findElement(By.id("room_type"));
		enterText(txtRoomType, "Standard");

		WebElement txtChildPerRoom = driver.findElement(By.id("child_room"));
		enterText(txtChildPerRoom, "1 - One");

	}

	@When("user need to proceed search button")
	public void userNeedToProceedSearchButton() {
		WebElement btnSearch = driver.findElement(By.id("Submit"));
		buttonCLick(btnSearch);
	}

	@Then("user need to validate error message")
	public void userNeedToValidateErrorMessage() {
		System.out.println("Invalid error message");
	}

}
