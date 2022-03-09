package com.mohcc.txmigration.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

public class VisitsID implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "PatientID")
	private String patientID;
	
	@Column(name = "VisitDate")
	private Date visitDate;

	public VisitsID() {
		super();
	}

	public VisitsID(String patientID, Date visitDate) {
		super();
		this.patientID = patientID;
		this.visitDate = visitDate;
	}

	public String getPatientID() {
		return patientID;
	}

	public void setPatientID(String patientID) {
		this.patientID = patientID;
	}

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientID == null) ? 0 : patientID.hashCode());
		result = prime * result + ((visitDate == null) ? 0 : visitDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VisitsID other = (VisitsID) obj;
		if (patientID == null) {
			if (other.patientID != null)
				return false;
		} else if (!patientID.equals(other.patientID))
			return false;
		if (visitDate == null) {
			if (other.visitDate != null)
				return false;
		} else if (!visitDate.equals(other.visitDate))
			return false;
		return true;
	}

	
}
