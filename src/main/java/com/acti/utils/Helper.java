package com.acti.utils;

import com.acti.base.DriverScript;

public class Helper extends DriverScript{
	public void sleep() {
		
		try {
			Thread.sleep(3000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	

}
