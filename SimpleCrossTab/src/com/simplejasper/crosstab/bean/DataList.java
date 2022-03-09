package com.simplejasper.crosstab.bean;

import java.util.ArrayList;
import java.util.List;

public class DataList {

	public List<Zimepms> setEpmsData(String a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k,
			int l, int m, int n, int o, int p, int q, int r, int s, int t, int u, int v, int w, int x, int y, int z,
			int za, int zb, int zc) {
		Zimepms data = new Zimepms();
		data.setData_name(a);
		data.setMonthm1(b);
		data.setMonthf1(c);
		data.setMonthm2(d);
		data.setMonthf2(e);
		data.setMonthm3(f);
		data.setMonthf3(g);
		data.setMonthm4(h);
		data.setMonthf4(i);
		data.setYearm5(j);
		data.setYearf5(k);
		data.setYearm6(l);
		data.setYearf6(m);
		data.setYearm7(n);
		data.setYearf7(o);
		data.setYearm8(p);
		data.setYearf8(q);
		data.setYearm9(r);
		data.setYearf9(s);
		data.setYearm10(t);
		data.setYearf10(u);
		data.setYearm11(v);
		data.setYearf11(w);
		data.setYearm12(x);
		data.setYearf12(y);
		data.setYearm13(z);
		data.setYearf13(za);
		data.setYearm14(zb);
		data.setYearf14(zc);
		
		List<Zimepms> listData = new ArrayList<>();
		listData.add(data);

		return listData;
	}

	public List<Zimepms> getEpmsData() {
		List<Zimepms> listData = new ArrayList<>();

		Zimepms d1 = new Zimepms();
		d1.setData_name("D38. Number of PLHIV in care who on First line regimen who had adverse events this month");
		d1.setMonthm1(0);
		d1.setMonthf1(0);
		d1.setMonthm2(0);
		d1.setMonthf2(0);
		d1.setMonthm3(0);
		d1.setMonthf3(0);
		d1.setMonthm4(0);
		d1.setMonthf4(0);
		d1.setYearm5(7);
		d1.setYearf5(0);
		d1.setYearm6(0);
		d1.setYearf6(0);
		d1.setYearm7(0);
		d1.setYearf7(0);
		d1.setYearm8(0);
		d1.setYearf8(0);
		d1.setYearm9(0);
		d1.setYearf9(0);
		d1.setYearm10(0);
		d1.setYearf10(0);
		d1.setYearm11(0);
		d1.setYearf11(1);
		d1.setYearm12(0);
		d1.setYearf12(0);
		d1.setYearm13(0);
		d1.setYearf13(0);
		d1.setYearm14(0);
		d1.setYearf14(1);

		Zimepms d2 = new Zimepms();
		d2.setData_name(
				"D39. Number of PLHIV in care on First line regimen who stopped treatment due to severe adverse events this month");
		d2.setMonthm1(0);
		d2.setMonthf1(0);
		d2.setMonthm2(0);
		d2.setMonthf2(0);
		d2.setMonthm3(0);
		d2.setMonthf3(0);
		d2.setMonthm4(0);
		d2.setMonthf4(0);
		d2.setYearm5(7);
		d2.setYearf5(0);
		d2.setYearm6(0);
		d2.setYearf6(0);
		d2.setYearm7(0);
		d2.setYearf7(0);
		d2.setYearm8(0);
		d2.setYearf8(0);
		d2.setYearm9(0);
		d2.setYearf9(0);
		d2.setYearm10(0);
		d2.setYearf10(0);
		d2.setYearm11(0);
		d2.setYearf11(1);
		d2.setYearm12(0);
		d2.setYearf12(0);
		d2.setYearm13(0);
		d2.setYearf13(0);
		d2.setYearm14(0);
		d2.setYearf14(1);

		Zimepms d3 = new Zimepms();
		d3.setData_name(
				"D41. Total number of PLHIV in care currently receiving first line ART (including those initiated this current month)");
		d3.setMonthm1(0);
		d3.setMonthf1(0);
		d3.setMonthm2(0);
		d3.setMonthf2(0);
		d3.setMonthm3(0);
		d3.setMonthf3(0);
		d3.setMonthm4(0);
		d3.setMonthf4(0);
		d3.setYearm5(7);
		d3.setYearf5(0);
		d3.setYearm6(0);
		d3.setYearf6(0);
		d3.setYearm7(0);
		d3.setYearf7(0);
		d3.setYearm8(0);
		d3.setYearf8(0);
		d3.setYearm9(0);
		d3.setYearf9(0);
		d3.setYearm10(0);
		d3.setYearf10(0);
		d3.setYearm11(0);
		d3.setYearf11(1);
		d3.setYearm12(0);
		d3.setYearf12(0);
		d3.setYearm13(0);
		d3.setYearf13(0);
		d3.setYearm14(0);
		d3.setYearf14(1);

		listData.add(d1);
		listData.add(d2);
		listData.add(d3);

		return listData;
	}

	public String getPeriod() {
		String period = "December 2022";

		return period;
	}

	public String getReportTitle() {
		String title = "B2. HIV Testing Services including PMTCT";

		return title;

	}

}
