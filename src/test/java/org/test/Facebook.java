package org.test;

import java.io.IOException;

import org.locators.FbAccountCreateDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook extends FbAccountCreateDriver{
	@BeforeClass
	private void browserFf() {
		firefoxBrowser();
		urlLaunch("https://www.facebook.com/");
		toMaximize();
	}
	@BeforeMethod
	private void dateTime5() {
		dateAndTime();
		
	}
	
	@Test(dataProvider="fillDetails")
	private void tc1(String fi,String l,String mb,String p,String d,String m,String y)  {
		urlLaunch("https://www.facebook.com/");
	    FbAccountCreateDriver fo = new FbAccountCreateDriver();
	    click(fo.getCreate());
	    implicitWaits(10);
	    sendKeys(fo.getFirstName(), fi);
	    sendKeys(fo.getLastName(), l);
	    sendKeys(fo.getMobile(), mb);
	    sendKeys(fo.getPassword(), p);
	    click(fo.getClickDay());
	    dropDownSelecByValue(fo.getClickDay(), d);
	    click(fo.getClickMonth());
	    dropDownSelecByValue(fo.getClickMonth(), m);
	    click(fo.getClickYear());
	    dropDownSelecByVisibleText(fo.getClickYear(), y);
	    click(fo.getGender());
//	    click(fo.getSignUp());
	}
	
	@DataProvider(name="fillDetails")
	private String[][] dataPro(){
		return new String[][]{
		  {"SUKUMAR","R","9887766554","skr08597@","5","3","1999"},
      	  {"KANNAN","T","8776655443","kannan99@","6","8","1987"},
      	  {"RAM","F","7665544332","ramantech@","8","7","1992"},
      	  {"PREMKUMAR","D","6554433221","premmicro@","20","5","1998"},
      	  {"RAJESH","G","5443322110","fresh2598@","10","10","1997"},
        
		};
	}
	
    @AfterMethod
    private void dateTime3() {
        dateAndTime();
	}
    
    @AfterClass
    private void snap() throws IOException {
        toTakeSnap("Fbff");
	}
	}
	


