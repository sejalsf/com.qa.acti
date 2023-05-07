package com.acti.testcase;

import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.base.DriverScript;
import com.acti.pages.LoginPage;

public class Basetest extends DriverScript {

	LoginPage lp;
	EnterPage EC;

	@BeforeMethod
	public void pretest() {
		initApplication();// lauch the browser
		lp = new LoginPage();/// Create an object of new login page
        EC = new EnterPage();
	}

	@AfterMethod
	public void teardown() {
		quitdriver();

	}

}
