package org.testingjasper.report;

import org.testingjasper.report.service.ReportService;

public class Report {

	public static void main(String[] args) {
		
		ReportService rep = new ReportService();
		rep.generateReport();

	}

}
