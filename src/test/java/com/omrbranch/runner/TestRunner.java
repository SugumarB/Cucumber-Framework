package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.report.generateReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue="com.omrbranch.stepdefinition",plugin="pretty",features="src\\test\\resources\\Feature\\TC5_ChangeBooking.feature",dryRun=false,tags="@changingbooking")
public class TestRunner {
//	@AfterClass
//	public static void afterClass() {
//		generateReports.generateJVMReports("C:\\Users\\kanch\\eclipse-workspace\\OMRBranchHotelAutomationProject\\target//index.json");
//
//	}

}

