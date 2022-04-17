package com.orng.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\RaMan\\eclipse-workspace\\new"
		+ "\\com.orangehrm\\src\\test\\java\\com\\orng\\feature",
		glue= {"com.orng.stepdefinition","com.ornghooks"},dryRun=false,monochrome=true)
public class Runner {

}

