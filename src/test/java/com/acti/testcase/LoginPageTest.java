package com.acti.testcase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.pages.LoginPage;

public class LoginPageTest extends Basetest {
	LoginPage lp;

	

	/// First test case about to open the page
	@Test
	public void testloginpagetitle() {

		String actual = "actiTIME - Login";
		String expected = lp.getloginpagetitle();// called the method that get you title page
		System.out.println(expected);
		assertEquals(actual, expected);
	

	}

	@Test
	public void testActiImgDisplayed() {
		//// So in the logo we are just verified the logo but we don't have to print
		//// anything
		/// just verifing that the logo is displayed or not
		// SO that is why we are using assertion

		boolean flag = lp.verifiylogo();
		assertTrue(flag);

	}

	@Test
	public void testforgotpassworddisplayed() {

		boolean news = lp.verifiedforgetpasswordlink();
		assertTrue(news);

	}

	@Test
	public void testloginfunction() {

		lp.enterusername("Sejal");
		lp.enterpassword("manager");
		lp.loginbuttonmain();
String actual = EC.getuserlogin();
Assert.assertTrue(actual.contains("John Doe"));
EC.clicklogout();

	}

	@Test
	public void testlogininvalidcradential() {

		lp.enterpassword("sejal");
		lp.loginbuttonmain();
		String errmsg = lp.errorpage();
		System.out.println(errmsg);
		Assert.assertTrue(errmsg.contains("Username or Password is invalid"));
		EC.quitdriver();

	}

}
