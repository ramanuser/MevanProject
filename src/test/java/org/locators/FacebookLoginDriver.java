package org.locators;

import org.helper.BaseClass2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginDriver extends BaseClass2 {
	
	public FacebookLoginDriver() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="email")
	private WebElement Id; 
	
	@FindBys({
		@FindBy(xpath="//input[@aria-label='Password']"),
		@FindBy(xpath="//input[@type='password']")
	})
	private WebElement Pass;
	@FindAll
	({
		
		@FindBy(name="login"),
		@FindBy(xpath="//button[@type='submit']")
	})
	private WebElement Click;
	public WebElement getId() {
		return Id;
	}
	public WebElement getPass() {
		return Pass;
	}
	public WebElement getClick() {
		return Click;
	}
	
	
}
