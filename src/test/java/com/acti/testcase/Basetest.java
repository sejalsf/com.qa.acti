package com.acti.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.acti.base.DriverScript;
import com.acti.pages.Enterpage;
import com.acti.pages.LoginPage;
import com.acti.pages.TaskPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Basetest extends DriverScript {

	LoginPage lp;
	Enterpage EC;
	TaskPage TP;
	public static ExtentHtmlReporter extent;
	public static ExtentReports report;
	public static ExtentTest Logger;
	
	@BeforeSuite
	public void reportsetup() {
		extent = new ExtentHtmlReporter("./Reports/actiindex.html");
		report = new ExtentReports();
		report.attachReporter(extent);
	}

	@BeforeMethod
	public void pretest() {
		initApplication();// launch the browser
		lp = new LoginPage();/// Create an object of new login page
        EC = new Enterpage();
        TP = new TaskPage();
        
	}

	@AfterMethod
	
	public void teardown() {
		report.flush();
		quitdriver();

	}

}
