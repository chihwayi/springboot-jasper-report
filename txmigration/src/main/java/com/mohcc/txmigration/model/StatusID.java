package com.mohcc.txmigration.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

public class StatusID implements Serializable{
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Column(name = "PatientID")
		String patientID;
		
		@Column(name = "StatusDate")
		Date statusDate;
		
		public StatusID() {
			super();
		}


		public StatusID(String patientID, Date statusDate) {
			super();
			this.patientID = patientID;
			this.statusDate = statusDate;
		}


		public String getPatientID() {
			return patientID;
		}


		public void setPatientID(String patientID) {
			this.patientID = patientID;
		}


		public Date getStatusDate() {
			return statusDate;
		}


		public void setStatusDate(Date statusDate) {
			this.statusDate = statusDate;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((patientID == null) ? 0 : patientID.hashCode());
			result = prime * result + ((statusDate == null) ? 0 : statusDate.hashCode());
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
			StatusID other = (StatusID) obj;
			if (patientID == null) {
				if (other.patientID != null)
					return false;
			} else if (!patientID.equals(other.patientID))
				return false;
			if (statusDate == null) {
				if (other.statusDate != null)
					return false;
			} else if (!statusDate.equals(other.statusDate))
				return false;
			return true;
		}
		
		

}
