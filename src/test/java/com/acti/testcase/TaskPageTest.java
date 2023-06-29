package com.acti.testcase;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskPageTest extends Basetest{
	
	
	@Test
	public void Testcreatnewcustomer() {
		lp.enterusername("admin");
		lp.enterpassword("manger");
		lp.loginbuttonmain();
		String actual = EC.getuserlogin();
		System.out.println(actual.contains("John Doe"));
		EC.clicktask();
		TP.clickAddnewButton();
		TP.ClickNewcustomer();
		TP.CustomerNameBox("Sejal");
		TP.EntercustomerDescription("XYZ Customer");
		TP.clickcutomerbutton();
		String msg = TP.getsuccessmsg();
		Assert.assertTrue(msg.contains("has been created"));
		EC.clicklogout();
		
		
	}

	

}
