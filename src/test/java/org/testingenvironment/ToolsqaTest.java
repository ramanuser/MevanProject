package org.testingenvironment;

import java.io.IOException;

import org.locators.Toolsqa;

public class ToolsqaTest extends Toolsqa {
public static void main(String[] args) throws IOException {
	
	chromeBrowser();
	urlLaunch("https://www.toolsqa.com/selenium-training/#enroll-form");
	toMaximize();
	implicitWaits(10);
	Toolsqa t = new Toolsqa();
	click(t.getClick());
	
    toSendKeysJavascript(0, t.getFirstName(), "Ram");
	sendKeys(t.getSecondName(), "k");
	sendKeys(t.getEmail(),"rammmech99@gmail.com");
	sendKeys(t.getMobile(),"9988776655");
	
	click(t.getCountry());
	dropDownSelecByIndex(t.getSelect(), 92);
    
	actionSendKeys(t.getCity(), "coimbatore");
	
	sendKeys(t.getMessage(), "I am interest to join automation testing course.");
	toMinimize();
	sendKeys(t.getCasheEnter(), scannerInput());
	toMaximize();
    toScrollUp(t.getScrollTo(), 0);
	click(t.getSendClick());
}
}
