package org.locators;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbAccountCreateDriver extends BaseClass {

	public FbAccountCreateDriver() {
		PageFactory.initElements(d, this);
	}
	
	@FindAll({
		@FindBy(xpath="//a[text()='Create New Account']"),
		@FindBy(xpath="//a[@id='u_0_0_0R']")
	})
	private WebElement create;
	
	@FindAll({
		@FindBy(xpath="//input[@id='u_g_b_8/']"),
		@FindBy(xpath="//input[@name='firstname']")
	})
	private WebElement firstName;
	
	@FindAll({
		@FindBy(xpath="//input[@id='u_g_d_PI']"),
		@FindBy(xpath="(//input[@type='text'])[3]")
	})
	private WebElement lastName;
	
	@FindAll({
		@FindBy(xpath="(//input[@id='u_g_g_5o'])"),
		@FindBy(xpath="(//input[@type=\"text\"])[4]")
	})
	private WebElement mobile;
	
	@FindAll({
		@FindBy(xpath="(//input[@id='password_step_input'])"),
		@FindBy(xpath="(//input[@data-type='password'])")
	})
	private WebElement password;
	
	@FindAll({
		@FindBy(xpath="//select[@id='day']"),
		@FindBy(xpath="//select[@name='birthday_day']")
	})
	private WebElement clickDay;
	
	@FindAll({
		@FindBy(xpath="//select[@title='Month']"),
		@FindBy(xpath="//select[@name='birthday_month']")
	})
	private WebElement clickMonth;
	
	@FindAll({
		@FindBy(xpath="//select[@title='Year']"),
		@FindBy(xpath="//select[@id='year']")
	})
	private WebElement clickYear;
	
	@FindBy(xpath="(//label[@class='_58mt'])[2]")
	private WebElement gender;
	
	@CacheLookup
	@FindBy(xpath="//button[@id='u_2_s_u0']")
	private WebElement signUp;

	public WebElement getCreate() {
		return create;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getClickDay() {
		return clickDay;
	}

	public WebElement getClickMonth() {
		return clickMonth;
	}

	public WebElement getClickYear() {
		return clickYear;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getSignUp() {
		return signUp;
	}
	
	
	

	
}
