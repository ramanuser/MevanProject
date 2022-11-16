package org.locators;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Toolsqa extends BaseClass{
	
	public Toolsqa() {
		PageFactory.initElements(d, this);
	}
	
	@FindAll({
		@FindBy(xpath="//input[@id='first-name']"),
		@FindBy(xpath="(//input[@type='text'])[3]")
	})
    private WebElement firstName;
	
	@FindAll({
		@FindBy(xpath="//input[@id='last-name']"),
		@FindBy(xpath="//input[@name='lastName']")
	})
	private WebElement secondName;
	
	@FindAll({
		@FindBy(xpath="//input[@name='email']"),
		@FindBy(xpath="//input[@type='email']")
	})
	private WebElement email;
	
	@FindAll({
		@FindBy(xpath="//input[@id='mobile']"),
		@FindBy(xpath="//input[@name='mobile']")
	})
	private WebElement mobile;
	
	@FindAll({
		@FindBy(xpath="(//div[@class='upcoming__registration--input__container'])[6]"),
		@FindBy(xpath="//input[@id='city']")
	})
	private WebElement city;
	
	@FindAll({
		@FindBy(xpath="(//div[@class='upcoming__registration--input__container'])[5]"),
		@FindBy(xpath="//select[@name='country']")
	})
	private WebElement country;
	
	@FindBy(xpath="//button[@aria-label='Close modal']")
	private WebElement click;

	
	@FindBy(xpath="//select[@id='country']")
	private WebElement select;
	
	@FindBy(xpath="//input[@id='code']")
	private WebElement casheEnter;
	
	@FindBy(xpath="//textarea[@name='message']")
	private WebElement message;
	
	@FindBy(xpath="//button[text()='Send']")
	private WebElement sendClick;
	
	@FindBy(xpath="//form[@id='enroll-form']")
	private WebElement scrollTo;
	
	public WebElement getScrollTo() {
		return scrollTo;
	}

	public WebElement getCasheEnter() {
		return casheEnter;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getSendClick() {
		return sendClick;
	}

	public WebElement getSecondName() {
		return secondName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getSelect() {
		return select;
	}
	
	
}
