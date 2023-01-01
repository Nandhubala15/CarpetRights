package org.runnerclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {
	
	public static void report(String jsonPath) {
		
		
		File f = new File("C:\\Users\\USER-PC\\eclipse-workspace\\CarpetRightsBDD\\Reports\\JVMReports");
		Configuration configure = new Configuration(f, "CarpetRights");
		configure.addClassifications("Platform", "Windows10");
		configure.addClassifications("JDK", "1.8");
		configure.addClassifications("Eclipse", "Oxygen");
		
		List<String> li = new ArrayList<String>();
		li.add(jsonPath);
		
		ReportBuilder report = new ReportBuilder(li, configure);
		report.generateReports();
		

	}

	
	
	
	
	
	
	
}
