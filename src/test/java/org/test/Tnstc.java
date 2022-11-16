package org.test;

import org.tnstc.BookingLocator;

public class Tnstc extends BookingLocator {
public static void main(String[] args) {
	 chromeBrowser();
	 urlLaunch("https://www.tnstc.in/home.html");
	 toMaximize();
	 BookingLocator b = new BookingLocator();
	 sendKeys(b.getStartPlace(),"SANKARANKOVIL");
	 sendKeys(b.getEndPlace(),"COIMBATORE");
	 click(b.getClick());
	 click(b.getStartClick());
	 dropDownSelecByIndex(b.getStartMonth(), 1);
	 dropDownSelecByIndex(b.getStartDay(), 8);
}
}
