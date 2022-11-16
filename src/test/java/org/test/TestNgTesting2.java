package org.test;

import java.io.IOException;

import org.locators.Toolsqa;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgTesting2 extends Toolsqa {
	@BeforeClass
	private void browser() {
		edgeBrowser();
		urlLaunch("https://www.toolsqa.com/selenium-training/#enroll-form");
		toMaximize();
	}

	@BeforeMethod
	private void dateTime() {
		dateAndTime();
	}

	
	@Test(dataProvider="Create Account")
	private void tc2(String f, String l, String e,String mb,String m) {
		urlLaunch("https://www.toolsqa.com/selenium-training/#enroll-form");
		Toolsqa t = new Toolsqa();
		toSendKeysJavascript(0, t.getFirstName(), f);
		sendKeys(t.getSecondName(), l);
		sendKeys(t.getEmail(), e);
		sendKeys(t.getMobile(), mb);
		sendKeys(t.getMessage(), m);
	}
	
	@DataProvider(name="Create Account")
	public String[][] dataPro() {
        return  new String[][] {
        	  {"SUKUMAR","R","skr97@gmail.com","9887766554","I am interest to join automation testing"},
        	  {"KANNAN","T","kannan99@gmail.com","8776655443","I am interest to join automation testing"},
        	  {"RAM","F","ramantech@gmail.com","7665544332","I am interest to join automation testing"},
        	  {"PREMKUMAR","D","premmicro@gmail.com","6554433221","I am interest to join automation testing"},
        	  {"RAJESH","G","fresh@gmail.com","5443322110","I am interest to join automation testing"},
          };
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
		toTakeSnap("Toolsqa");
	}

}
