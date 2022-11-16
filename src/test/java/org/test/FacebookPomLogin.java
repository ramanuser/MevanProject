package org.test;

import org.locators.FacebookLogin;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookPomLogin extends FacebookLogin {
	@BeforeSuite
	private void fireFo() {
		firefoxBrowser();
		urlLaunch("https://www.facebook.com/");
		toMaximize();
	}
	
	@Test(dataProvider = "login")
	private void tc2(String user,String pass) {
		urlLaunch("https://www.facebook.com/");
		FacebookLogin login = new FacebookLogin();
		sendKeys(login.getId(), user);
		sendKeys(login.getPass(), pass);
//		click(login.getClick());
	}
	
	@DataProvider(name = "login")
	private String[][] fbLogin() {
		return new String[][] { { "Rajakumar", "Asddf1234@" }, { "sukumar97", "Qwerr1278#" },
				{ "ramkumar", "1256asf@" }, { "kannan28", "1244asdfg%" }, { "rajeshkannan", "kj25asd^" },
				{ "premkumar", "prem12kumar!" } };
	}
}
