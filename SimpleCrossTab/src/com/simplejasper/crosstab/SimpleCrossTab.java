package com.simplejasper.crosstab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.simplejasper.crosstab.bean.DataList;
import com.simplejasper.crosstab.bean.Zimepms;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class SimpleCrossTab {

	public static void main(String[] args) {
		try {
			String dir = System.getProperty("user.home");
			String file = dir + File.separatorChar + "zimepms.pdf";
			
			DataList dataList = new DataList();
			List<Zimepms> listItems = dataList.getEpmsData();
			
			
			JRBeanCollectionDataSource jrbean = new JRBeanCollectionDataSource(listItems);
			
			Map<String,Object> parameters = new HashMap<>();
			parameters.put("period", dataList.getPeriod());
			parameters.put("reportTitle", dataList.getReportTitle());
			parameters.put("EpmsDataSource", jrbean);
			
			JasperReport jasperReport = JasperCompileManager.compileReport("/home/ignatious/Documents/JasperExample/reports/zimepms.jrxml");
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
			
			FileOutputStream outputStream = new FileOutputStream(new File(file));
			
			JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
			
			System.out.println("File Generated");
		}
		catch(JRException | FileNotFoundException ex) {
			ex.printStackTrace();
		}

	}

}
