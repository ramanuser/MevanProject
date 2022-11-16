package org.test;

import org.locators.FacebookLoginDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLogin extends FacebookLoginDriver {

	@BeforeSuite
	private void chromeFb() {
		chromeBrowser();
		urlLaunch("https://www.facebook.com/");
		toMaximize();
	}

	@Test(dataProvider = "login")
	private void tc1(String user, String pass) {
		urlLaunch("https://www.facebook.com/");
		FacebookLoginDriver login = new FacebookLoginDriver();
		sendKeys(login.getId(), user);
		sendKeys(login.getPass(), pass);
		

	}

	@DataProvider(name = "login")
	private String[][] fbLogin() {
		return new String[][] { { "Rajakumar", "Asddf1234@" }, { "sukumar97", "Qwerr1278#" },
				{ "ramkumar", "1256asf@" }, { "kannan28", "1244asdfg%" }, { "rajeshkannan", "kj25asd^" },
				{ "premkumar", "prem12kumar!" } };
	}
}
