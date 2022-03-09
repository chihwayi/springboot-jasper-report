package org.testingjasper.report.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.HashMap;
import java.util.List;
import org.testingjasper.report.dto.ReportEntity;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

public class ReportService {
	
	public List<ReportEntity> replist = Arrays.asList(
			new ReportEntity("Data Entry 1",1,2,3,4,5,6,1,2,3,4,5,6),
			new ReportEntity("Data Entry 2",9,8,7,6,5,4,3,2,1,2,3,4),
			new ReportEntity("Data Entry 3",6,5,4,3,2,1,6,5,4,3,2,1)
			);
			
	//ReportEntityList data = new ReportEntityList();
	//List<ReportEntity> replist = data.getReportEntityList();
	
	public static Collection<ReportEntity> getEntityData(){
		List<ReportEntity> orders = new ArrayList<>();
        orders.add(new ReportEntity("Data Entry 1",1,2,3,4,5,6,1,2,3,4,5,6));
        orders.add(new ReportEntity("Data Entry 2",9,8,7,6,5,4,3,2,1,2,3,4));
        return orders;
		
	}
	public String generateReport() {
		/*
		try {
			String reportPath = "/home/ignatious/Documents/JasperExample/reports/";
			
			JasperReport jasperReport = JasperCompileManager.compileReport(reportPath + "age bands redone.jrxml");
			
			JRBeanCollectionDataSource jrBeanCollectionDataSource = new JRBeanCollectionDataSource(replist);
			
			Map<String, Object> parameters = new HashMap<>();
			parameters.put("report", "Trial Report");
			
			
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, jrBeanCollectionDataSource);
			
			JasperExportManager.exportReportToPdfFile(jasperPrint, reportPath + "age bands.pdf");

			System.out.println("Done");

			return "Report successfully generated @path= " + reportPath;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	*/
		try {
		InputStream inputStream = new FileInputStream("/home/ignatious/Documents/JasperExample/reports/age bands redone.jrxml");
		JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
		JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

		HashMap parameters = new HashMap<>();
		JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(replist);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, beanColDataSource);
		JasperExportManager.exportReportToPdfFile(jasperPrint, "/home/ignatious/Documents/JasperExample/reports/test_jasper.pdf");
		System.out.println("Done");

		
		} catch (JRException | FileNotFoundException ex) {
		Logger.getLogger(ReportService.class.getName()).log(Level.SEVERE, null, ex);
		}
		return "Report successfully generated ";
	}		

}
