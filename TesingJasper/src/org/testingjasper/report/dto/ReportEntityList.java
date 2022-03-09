package org.testingjasper.report.dto;

import java.util.ArrayList;

public class ReportEntityList {
	
	public ArrayList<ReportEntity> getReportEntityList(){
		
		ArrayList<ReportEntity> reportEntityList = new ArrayList<>();
		reportEntityList.add(produceData("Data Entry 1",1,2,3,4,5,6,1,2,3,4,5,6));
		reportEntityList.add(produceData("Data Entry 2",9,8,7,6,5,4,3,2,1,2,3,4));
		reportEntityList.add(produceData("Data Entry 3",6,5,4,3,2,1,6,5,4,3,2,1));
		
		return reportEntityList;
		
	}
	
	private ReportEntity produceData(String a, int b, int c, int d, int e, int f, int g,
			int h, int i, int j, int k, int l, int m) {
		ReportEntity reportEntity = new ReportEntity();
		reportEntity.setData_variable(a);
		reportEntity.setMale1(b);
		reportEntity.setFemale1(c);
		reportEntity.setMale6(d);
		reportEntity.setFemale6(e);
		reportEntity.setMale11(f);
		reportEntity.setFemale11(g);
		reportEntity.setMale16(h);
		reportEntity.setFemale16(i);
		reportEntity.setMale21(j);
		reportEntity.setFemale21(k);
		reportEntity.setMale26(l);
		reportEntity.setFemale26(m);
		
		return reportEntity;
	}
	

}
