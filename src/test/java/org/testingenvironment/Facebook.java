package org.testingenvironment;

import java.io.IOException;

import org.locators.FacebookLogin;

public class Facebook extends FacebookLogin{
	public static void main(String[] args) throws IOException {
		firefoxBrowser();
		urlLaunch("https://www.facebook.com/");
		toMaximize();
	     FacebookLogin f = new FacebookLogin();
	     sendKeys(f.getId(), readFromExcel("Data","Details", 1, 0,"dd-MM-yyyy"));
	     sendKeys(f.getPass(),readFromExcel("Data","Details",1,1,"dd-MM-yyyy"));
	     click(f.getClick());
	}
	

}
