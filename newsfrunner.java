package com.cucumber.run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/salesforcelogincucumber/sfnewfeature.feature"},
glue = {"com.cucumber.stepdefinition"})


	public class newsfrunner extends AbstractTestNGCucumberTests{
		
}
