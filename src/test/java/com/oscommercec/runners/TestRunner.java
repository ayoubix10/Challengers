package com.oscommercec.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = "features",
		glue = "com.oscommercec.stepdef"
		)
public class TestRunner extends AbstractTestNGCucumberTests{
	




}
