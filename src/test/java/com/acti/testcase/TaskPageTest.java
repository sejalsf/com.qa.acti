package com.acti.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskPageTest extends Basetest{
	
	
	@Test
	public void Testcreatnewcustomer() {
		Logger = report.createTest("Test create customer");
		lp.enterusername("admin");
		Logger.pass("entered username");
		lp.enterpassword("manger");
		Logger.pass("entered password");
		lp.loginbuttonmain();
		Logger.pass("click login button");
		String actual = EC.getuserlogin();
		System.out.println(actual.contains("John Doe"));
		Logger.pass("Veified the user loged in");
		EC.clicktask();
		Logger.pass("Clicked task menu");
		TP.clickAddnewButton();
		Logger.pass("Clicked add new button");
		TP.ClickNewcustomer();
		Logger.pass("Click new customer");
		TP.CustomerNameBox("Sejal");
		Logger.pass("Entered cutomer name");
		TP.EntercustomerDescription("XYZ Customer");
		Logger.pass("entered customer description");
		TP.clickcutomerbutton();
		Logger.pass("Clicked customer button");
		String msg = TP.getsuccessmsg();
		Assert.assertTrue(msg.contains("has been created"));
		Logger.pass("Verifies success msg");
		EC.clicklogout();
		Logger.pass("Clickes logout button");
		
		
	}
	public void DeleteCustomer() {
		
			lp.enterusername("admin");
			lp.enterpassword("manger");
			lp.loginbuttonmain();
			String actual = EC.getuserlogin();
			System.out.println(actual.contains("John Doe"));
			EC.clicktask();
			TP.ClickSearchButton("Sejal");
			TP.clickEditButton();
			TP.ClickActionButton();
			TP.ClickDeleteButton();
			TP.ClickDeletePermenently();
			String msg = TP.getsuccessdeletemsg();
			Assert.assertTrue(msg.contains("has been deleted"));
			EC.clicklogout();
	}
	
	

	

}
