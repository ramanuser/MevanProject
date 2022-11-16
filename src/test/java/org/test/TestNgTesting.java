package org.test;

import java.io.IOException;

import org.locators.Toolsqa;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgTesting extends Toolsqa {
	@BeforeClass
	private void browser() {
		chromeBrowser();
		urlLaunch("https://www.toolsqa.com/selenium-training/#enroll-form");
		toMaximize();
	}

	@BeforeMethod
	private void dateTime() {
		dateAndTime();
	}

	@Parameters({ "Firstname", "Lastname", "Email", "Mobile", "Massage" })
	@Test
	private void tc2(@Optional("Raja") String f, @Optional("C") String l, @Optional("raja97@gmail.com") String e,
			@Optional("6778899001") String mb, @Optional("Interest to join") String m) {
		Toolsqa t = new Toolsqa();
		toSendKeysJavascript(0, t.getFirstName(), f);
		sendKeys(t.getSecondName(), l);
		sendKeys(t.getEmail(), e);
		sendKeys(t.getMobile(), mb);
		sendKeys(t.getMessage(), m);
	}

	@Test
	private void tc1() {
		System.out.println(getUrl());
		System.out.println(getTitle());
	}

	@AfterMethod
	private void dateTime1() {
		dateAndTime();
	}

	@AfterClass
	private void takesnap() throws IOException {
		toTakeSnap("Toolsqa1");
	}

}
