package com.ctl.techXpert.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features/Login.feature",
glue = "com.ctl.techXpert.stepdefnitions", plugin = {"pretty","html:target/cucumber", "json:target/report.json"})
public class TestingFeatureRunner  {

}
