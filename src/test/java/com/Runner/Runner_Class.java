package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin_Project.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\Adactin.feature",
			glue = "com.Step_D",
			
			monochrome = true, dryRun = false, strict = true,
			
			plugin = {"html:Report/HtmlReport", 
					"pretty",
					"json:JansonReport/Report.json",
					//"com.cucumber.listener.ExtentCucumberFormatter:CucumberExtentReport/"
					}
			

)
public class Runner_Class {

	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {
		driver = Base_Class.get_Driver("Chrome");
	}

	@AfterClass
	public static void tear_Down() {
		driver.close();

	}

}
