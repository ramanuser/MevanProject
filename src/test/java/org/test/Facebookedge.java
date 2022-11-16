package org.test;

import java.io.IOException;

import org.locators.FbAccountCreate;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebookedge extends FbAccountCreate{
	@BeforeClass
	private void browserEdge() {
		edgeBrowser();
		urlLaunch("https://www.facebook.com/");
		toMaximize();
	}
	@BeforeMethod
	private void dateTime2() {
		dateAndTime();
		
	}
	
	@Test(dataProvider="Details")
	private void tc3(String fn,String ln,String mbn,String ps,String da,String mo,String yr)  {
		
	    FbAccountCreate f = new FbAccountCreate();
	    click(f.getCreate());
	    implicitWaits(10);
	    sendKeys(f.getFirstName(), fn);
	    sendKeys(f.getLastName(), ln);
	    sendKeys(f.getMobile(), mbn);
	    sendKeys(f.getPassword(), ps);
	    click(f.getClickDay());
	    dropDownSelecByValue(f.getClickDay(), da);
	    click(f.getClickMonth());
	    dropDownSelecByValue(f.getClickMonth(), mo);
	    click(f.getClickYear());
	    dropDownSelecByVisibleText(f.getClickYear(), yr);
	    click(f.getGender());
//	    click(f.getSignUp());
	}
	
	@DataProvider(name="Details")
	public String[][] dataPro1(){
		return new String[][]{
		  {"SUKUMAR","R","9887766554","skr08597@","5","3","1999"},
      	  {"KANNAN","T","8776655443","kannan99@","6","8","1987"},
      	  {"RAM","F","7665544332","ramantech@","8","7","1992"},
      	  {"PREMKUMAR","6554433221","D","premmicro@","20","5","1998"},
      	  {"RAJESH","G","5443322110","fresh2598@","10","10","1997"},
        
		};
	}
	
    @AfterMethod
    private void dateTime1() {
        dateAndTime();
	}
    
    @AfterClass
    private void snap() throws IOException {
        toTakeSnap("Fbedge");
	}
	}
	


