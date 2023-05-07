package com.acti.base;


/*
 * Name : Driverscript
 * Description - Manges the driver and borwser related configration
 * Developed by - ShantoshKumar
 * Reviewed - Arti
 * Date reviewed - 04/26/2023
 */
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverScript {
	
	public static WebDriver driver;
	Properties prop;
	/*
	 * This constructor is responsible for getting a details form the properties file
	 */
	
	public DriverScript() {
	
		try
		{
		File file = new File("./src/test/resources/config/config.properties");
		FileInputStream fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		
		}
		catch(Exception e)
		{
			System.out.println("Unable to load properties file please check "+e.getMessage());
			e.printStackTrace();
		}
	
	}
	/*
	 * InitaApplication will get the borwser detail form the properties file and lauch the application
	 */
	@Test
public void initApplication() 
{
	String browser = prop.getProperty("Browser");
	
	if(browser.equalsIgnoreCase("Chrome"))
	{
		System.out.println(browser +"In Use");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("Firefox"))
	{
		System.out.println(browser +"In Use");
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("Microsoftedge"))
	{
		System.out.println(browser +"In Use");
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
	}
	else 
	{
		System.out.println(browser+"is not supported this browser file Please check the properties file");
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	launchurl();
	/*
	 * Load the Url form the properies file and Pass this method to initApplication above
	 */
}
	private void launchurl() {

String url = prop.getProperty("Url");
driver.get(url);
	}
	/*
	 * Quit the browser
	 */
	public void quitdriver() {
		driver.quit();
	}
}
















