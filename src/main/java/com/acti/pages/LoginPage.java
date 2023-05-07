package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;
///so when we are login the page we need to open the browser and all so as we set as a default browser 
//we can extend that driverscript class here

/*
 * Name : Driverscript
 * Description - Manges the driver and borwser related configration
 * Developed by - Sejal
 * Reviewed - Hitesh Panchal
 * Date reviewed - 04/26/2023
 */
public class LoginPage extends DriverScript {

	// ***********************Page Locators***********************//
	@FindBy(id = "username")
	WebElement usernametextbox;
	@FindBy(name = "pwd")
	WebElement Passwordbox;
	@FindBy(xpath = "//div[normalize-space()='Login']")
	WebElement loginbutton;
	@FindBy(className = "errormsg")
	WebElement errormsgtext;
	@FindBy(linkText = "Forgot your password?")
	WebElement Forgotpasswordlink;
	@FindBy(xpath = "//div[@class='atLogoImg']")
	WebElement Actitimelogo;

	// ***********************Page Initialization***********************//

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	// ***********************Page Methods***********************//

	public void enterusername(String username) {
		usernametextbox.sendKeys(username);
	}

	public void enterpassword(String password) {
		Passwordbox.sendKeys(password);
	}

	public void loginbuttonmain() {
		loginbutton.click();
	}

	public String errorpage() {
		return errormsgtext.getText();
	}

	public boolean verifiedforgetpasswordlink() {
		return Forgotpasswordlink.isDisplayed();
	}

	public boolean verifiylogo() {
		return Actitimelogo.isDisplayed();
	}

	public String getloginpagetitle() {
		return driver.getTitle();
	}
}
