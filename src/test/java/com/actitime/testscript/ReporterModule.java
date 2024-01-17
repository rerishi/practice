package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterModule {
	@Test(groups = {"smokeTest", "regressionTest"})
	public void createReport()
	{
		Reporter.log("createReport", true);
	}
	
	@Test(groups = "regressionTest")
	public void modifyReport()
	{
		Reporter.log("modifyReport", true);
	}
	
	@Test(groups = "regressionTest")
	public void deleteReport()
	{
		Reporter.log("deleteReport", true);
	}

}
