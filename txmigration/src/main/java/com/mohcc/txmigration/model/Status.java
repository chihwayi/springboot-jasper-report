package com.mohcc.txmigration.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tblstatus")
public class Status {
   
	@EmbeddedId
	private StatusID statusID;
	
	@Column(name = "Status")
	String status;
	
	@Column(name = "TransferOutToWhere")
	String transferOutToWhere;
	
	@Column(name = "Notes")
	String notes;

	public Status() {
		super();
	}

	public Status(StatusID statusID, String status, String transferOutToWhere, String notes) {
		super();
		this.status = status;
		this.transferOutToWhere = transferOutToWhere;
		this.notes = notes;
	}

	public StatusID getStatusID() {
		return statusID;
	}

	public void setStatusID(StatusID statusID) {
		this.statusID = statusID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransferOutToWhere() {
		return transferOutToWhere;
	}

	public void setTransferOutToWhere(String transferOutToWhere) {
		this.transferOutToWhere = transferOutToWhere;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
}
