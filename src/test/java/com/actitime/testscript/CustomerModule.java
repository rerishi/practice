package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CustomerModule extends BaseClass{
	
	@Test(groups = {"smokeTest", "regressionTest"})
	public void createTask()
	{
		Reporter.log("createTask", true);
	}
	
	@Test(groups = "regressionTest")
	public void modifyTask()
	{
		Reporter.log("modifyTask", true);
	}
	
	@Test(groups = "regressionTest")
	public void deleteTask()
	{
		Reporter.log("deleteTask", true);
	}
	
}
