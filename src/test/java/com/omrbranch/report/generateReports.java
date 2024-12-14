package com.omrbranch.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class generateReports {
	public static void generateJVMReports(String jsonFile) {
		File file = new File("C:\\Users\\kanch\\eclipse-workspace\\OMRBranchHotelAutomationProject\\target");
		Configuration configuration = new Configuration(file, "OMRBranchHotelProject");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Browserversion", "125.0.6422.142");
		configuration.addClassifications("OS", "Windows");
		configuration.addClassifications("Sprint", "34");
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();

	}

}
