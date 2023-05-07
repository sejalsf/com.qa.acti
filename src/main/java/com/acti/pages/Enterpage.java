package com.acti.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class Enterpage extends DriverScript {

	/*
	 * Name : Driverscript Description - Manges the driver and borwser related
	 * configration Developed by - Sejal Reviewed - Shantosh Date reviewed -
	 * 04/27/2023
	 */

	// ***********************Page Locators***********************//
	@FindBy(id = "logoutLink")
	WebElement logoutlink;
	@FindBy(xpath = "//a[@class='userProfileLink username ']")
	WebElement userloggedtext;
	@FindBy(xpath = "//div[@id='container_tasks']")
	WebElement taskmenu;
	@FindBy(xpath = "//a[@class='content reports']")
	WebElement reportmenu;
	@FindBy(xpath = "//div[@id='container_users']")
	WebElement usermenu;

	// ***********************Page Intialization***********************//

	public Enterpage() {
		PageFactory.initElements(driver, this);

	}

	// ***********************Page Methods***********************//

	public void clicklogout() {
		logoutlink.click();
	}

	public String getuserlogin() {
		return userloggedtext.getText();
	}

	public void clicktask() {
		taskmenu.click();
	}

	public void reports() {
		reportmenu.click();
	}

	public void userpage() {
		usermenu.click();
	}
	
	
	
	
	
	
	
	
}
