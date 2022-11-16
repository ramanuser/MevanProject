package org.tnstc;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingLocator extends BaseClass {
	
	public BookingLocator() {
		PageFactory.initElements(d,this);
	}
	
	@FindAll({
		@FindBy(xpath="(//input[@class='textbox_25 ui-autocomplete-input'])[1]"),
		@FindBy(xpath="//input[@id='matchStartPlace']")
	})
	private WebElement startPlace;
	
	@FindAll({
		@FindBy(xpath="(//input[@class='textbox_25 ui-autocomplete-input'])[2]"),
		@FindBy(xpath="//input[@id='matchEndPlace']")
	})
	private WebElement endPlace;
	
	@FindAll({
		@FindBy(xpath="(//input[@class='calDoubleDate hasDatepicker'])[1]"),
		@FindBy(xpath="//input[@id='txtdeptDateOtrip']")
	})
	private WebElement startClick;
	
	@FindAll({
		@FindBy(xpath="//select[@class='ui-datepicker-month']"),
		@FindBy(xpath="(//input[@id='matchStartPlace'])")
	})
	private WebElement startMonth;
	
	@FindAll({
		@FindBy(xpath="//a[@class='ui-datepicker-prev ui-corner-all']"),
		@FindBy(xpath="//span[text()='Prev']")
	})
	private WebElement right;
	
	@FindAll({
		@FindBy(xpath="//span[text()='Next']"),
		@FindBy(xpath="//span[@class='ui-icon ui-icon-circle-triangle-e']")
	})
	private WebElement left;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']")
	private WebElement startDay;
	
	@FindAll({
		@FindBy(xpath="//input[@id='txtdeptDateRtrip']"),
		@FindBy(xpath="(//input[@class='calDoubleDate hasDatepicker'])[2]")
	})
	private WebElement endClick;
	
	@FindAll({
		@FindBy(xpath="//select[@class='ui-datepicker-month']"),
		@FindBy(xpath="//select[@data-handler='selectMonth']")
	})
	private WebElement endMonth;
	
    @FindBy(xpath="//table[@class='ui-datepicker-calendar']")
	private WebElement endDate;
	
	@FindAll({
		@FindBy(xpath="//select[@name='selectOnwardTimeSlab']"),
		@FindBy(xpath="//select[@id='selectOnwardTimeSlab']")
	})
	private WebElement stSelect;
	
	@FindAll({
		@FindBy(xpath="//select[@name='selectReturnTimeSlab']"),
		@FindBy(xpath="//select[@id='selectReturnTimeSlab']")
	})
	private WebElement endSelect;
	
	@FindAll({
		@FindBy(xpath="(//input[@name='txtAdultMales'])[1]"),
		@FindBy(xpath="//input[@class='TxtBoxAge']")
	})
	private WebElement manAge;
	
	@FindAll({
		@FindBy(xpath="(//input[@name='txtAdultFemales'])[1]"),
		@FindBy(xpath="//input[@id='txtAdultFemales']")
	})
	private WebElement womenAge;
	
	@FindAll({
		@FindBy(xpath="(//input[@name='txtChildMales'])[1]"),
		@FindBy(xpath="//input[@id='txtChildMales']")
	})
	private WebElement childMan;
	
	@FindAll({
		@FindBy(xpath="//input[@id='txtChildFemales']"),
		@FindBy(xpath="(//input[@name='txtChildFemales'])[1]")
	})
	private WebElement childFemale;
	

	@FindBy(xpath="(//td[@valign='top'])[4]")
    private WebElement click;
//
//@FindAll({
//	@FindBy(xpath=""),
//	@FindBy(xpath="")
//})
//private WebElement ;
//
//@FindAll({
//	@FindBy(xpath=""),
//	@FindBy(xpath="")
//})
//private WebElement ;
//
//@FindAll({
//	@FindBy(xpath=""),
//	@FindBy(xpath="")
//})
//private WebElement ;

	public WebElement getClick() {
		return click;
	}

	public WebElement getStartPlace() {
		return startPlace;
	}

	public WebElement getEndPlace() {
		return endPlace;
	}

	public WebElement getStartClick() {
		return startClick;
	}

	public WebElement getStartMonth() {
		return startMonth;
	}

	public WebElement getRight() {
		return right;
	}

	public WebElement getLeft() {
		return left;
	}

	public WebElement getStartDay() {
		return startDay;
	}

	public WebElement getEndClick() {
		return endClick;
	}

	public WebElement getEndMonth() {
		return endMonth;
	}

	public WebElement getEndDate() {
		return endDate;
	}

	public WebElement getStSelect() {
		return stSelect;
	}

	public WebElement getEndSelect() {
		return endSelect;
	}

	public WebElement getManAge() {
		return manAge;
	}

	public WebElement getWomenAge() {
		return womenAge;
	}

	public WebElement getChildMan() {
		return childMan;
	}

	public WebElement getChildFemale() {
		return childFemale;
	}
	

	
	
	

}
