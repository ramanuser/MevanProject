package org.unittest;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.locators.Toolsqa;

public class TestToolsqa extends Toolsqa{
		
		@BeforeClass
		public static void browserLaunch() {
			chromeBrowser();
			urlLaunch("https://www.toolsqa.com/selenium-training/#enroll-form");
			toMaximize();
		}
		
		@Before
		public void dateTime() {
             dateAndTime();
		}
		
		@Test
		public void tc2() {
			Toolsqa t = new Toolsqa();
			implicitWaits(10);
			click(t.getClick());
			
		    toSendKeysJavascript(0, t.getFirstName(), "Ram");
			sendKeys(t.getSecondName(), "k");
			sendKeys(t.getEmail(),"rammmech99@gmail.com");
			sendKeys(t.getMobile(),"9988776655");
		}
		
		@Test
		public void tc1() {
			System.out.println(getUrl());
			System.out.println(getTitle());
		}
		
		@Test
		public void tc3() {
			System.out.println(togetAttribute(getMobile()));
		}
		
		@After
		public void screenShot() {
			dateAndTime();
		}
		
		@AfterClass
		public static void close() throws IOException {
			
			toTakeSnap("snap");

		}
	
}
