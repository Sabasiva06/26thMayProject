package org.functional;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGeneration {

	public static void generateJVMReport(String json) {

		File file = new File("C:\\Users\\vels\\eclipse-workspace\\CucumberSample\\target");
		Configuration configuration = new Configuration(file, "SampleReportGenration");
		configuration.addClassifications("Platfrom", "Win-10");
		configuration.addClassifications("Browser Type", "Chrome");
		configuration.addClassifications("Browser Version", "90.08.234");
		configuration.addClassifications("Environment", "QA");
		configuration.addClassifications("Sprint No", "14");

		List<String> li = new ArrayList<String>();
		li.add(json);

		ReportBuilder builder = new ReportBuilder(li, configuration);
		builder.generateReports();

	}

}
