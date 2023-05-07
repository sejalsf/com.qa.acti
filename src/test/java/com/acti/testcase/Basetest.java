package com.acti.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.base.DriverScript;
import com.acti.pages.Enterpage;
import com.acti.pages.LoginPage;

public class Basetest extends DriverScript {

	LoginPage lp;
	Enterpage EC;

	@BeforeMethod
	public void pretest() {
		initApplication();// lauch the browser
		lp = new LoginPage();/// Create an object of new login page
        EC = new Enterpage();
	}

	@AfterMethod
	public void teardown() {
		quitdriver();

	}

}
