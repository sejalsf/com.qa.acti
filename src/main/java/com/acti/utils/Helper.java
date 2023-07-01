package com.acti.utils;

import com.acti.base.DriverScript;

public class Helper extends DriverScript{
	public static void sleep() {
		/*
		 * This method is used to support wait wherever needed
		 */
		
		try {
			Thread.sleep(3000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	/*
	 * This method is used to capture a screenshot
	 */
	

}
