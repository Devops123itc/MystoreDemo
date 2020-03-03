package com.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/com",
glue="com/stepDefinations",
plugin={"pretty","html:target/cucumber.html",
		"json:target/cucumber.json",
		"junit:target/cucumber.xml"}
)
public class TestRunner extends AbstractTestNGCucumberTests{

}
