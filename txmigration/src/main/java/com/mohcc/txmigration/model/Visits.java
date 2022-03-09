package com.mohcc.txmigration.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tblvisits")
public class Visits {

	@EmbeddedId
	private VisitsID visitsID;
	
	@Column(name = "VisitType")
	String VisitType;
	
	@Column(name = "VisiTtypeCode")
	String VisiTtypeCode;
	
	@Column(name = "VisitStatusCode")
	String VisitStatusCode;
	
	@Column(name = "NowPregnant")
	String NowPregnant;
	
	@Column(name = "FamilyPlanningID")
	String FamilyPlanningID;
	
	@Column(name = "FunctionalStatusCode")
	String FunctionalStatusCode;
	
	@Column(name = "WHOStage")
	int WHOStage;
	
	@Column(name = "TBStatusCode")
	String TBStatusCode;
	
	@Column(name = "IPTReasonCode")
	String IPTReasonCode;
	
	@Column(name = "TypeOfTPT")
	String TypeOfTPT;
	
	@Column(name = "ARVStatusCode")
	int ARVStatusCode;
	
	@Column(name = "ARVReasonCode")
	int ARVReasonCode;
	
	@Column(name = "ARVCode")
	int ARVCode;
	
	@Column(name = "Notes")
	String Notes;
	
	@Column(name = "StaffID")
	int StaffID;
	
	@Column(name = "UserNumber")
	int UserNumber;
	
	@Column(name = "TheTimeStamp")
	Date TheTimeStamp;
	
	@Column(name = "AdverseEventsStatusCode")
	String AdverseEventsStatusCode;
	
	@Column(name = "DispenserID")
	int DispenserID;
	
	@Column(name = "DateOfFirstANC")
	Date DateOfFirstANC;
	
	@Column(name = "LNMPDate")
	Date LNMPDate;
	
	@Column(name = "TBInvestigationResults")
	int TBInvestigationResults;
	
	@Column(name = "IsIPTEligibility")
	String IsIPTEligibility;
	
	@Column(name = "IPTStatusCode")
	String IPTStatusCode;
	
	@Column(name = "DOB")
	Date dob;
	
	@Column(name = "Sex")
	String Sex;
	
	@Column(name = "Status")
	String Status;
	
	@Column(name = "RegDate")
	Date RegDate;

	public Visits() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Visits(VisitsID visitsID, String visitType, String visiTtypeCode, String visitStatusCode, String nowPregnant,
			String familyPlanningID, String functionalStatusCode, int wHOStage, String tBStatusCode,
			String iPTReasonCode, String typeOfTPT, int aRVStatusCode, int aRVReasonCode, int aRVCode, String notes,
			int staffID, int userNumber, Date theTimeStamp, String adverseEventsStatusCode, int dispenserID,
			Date dateOfFirstANC, Date lNMPDate, int tBInvestigationResults, String isIPTEligibility,
			String iPTStatusCode, Date dob, String sex, String status, Date regDate) {
		super();
		this.visitsID = visitsID;
		VisitType = visitType;
		VisiTtypeCode = visiTtypeCode;
		VisitStatusCode = visitStatusCode;
		NowPregnant = nowPregnant;
		FamilyPlanningID = familyPlanningID;
		FunctionalStatusCode = functionalStatusCode;
		WHOStage = wHOStage;
		TBStatusCode = tBStatusCode;
		IPTReasonCode = iPTReasonCode;
		TypeOfTPT = typeOfTPT;
		ARVStatusCode = aRVStatusCode;
		ARVReasonCode = aRVReasonCode;
		ARVCode = aRVCode;
		Notes = notes;
		StaffID = staffID;
		UserNumber = userNumber;
		TheTimeStamp = theTimeStamp;
		AdverseEventsStatusCode = adverseEventsStatusCode;
		DispenserID = dispenserID;
		DateOfFirstANC = dateOfFirstANC;
		LNMPDate = lNMPDate;
		TBInvestigationResults = tBInvestigationResults;
		IsIPTEligibility = isIPTEligibility;
		IPTStatusCode = iPTStatusCode;
		this.dob = dob;
		Sex = sex;
		Status = status;
		RegDate = regDate;
	}

	public VisitsID getVisitsID() {
		return visitsID;
	}

	public void setVisitsID(VisitsID visitsID) {
		this.visitsID = visitsID;
	}

	public String getVisitType() {
		return VisitType;
	}

	public void setVisitType(String visitType) {
		VisitType = visitType;
	}

	public String getVisiTtypeCode() {
		return VisiTtypeCode;
	}

	public void setVisiTtypeCode(String visiTtypeCode) {
		VisiTtypeCode = visiTtypeCode;
	}

	public String getVisitStatusCode() {
		return VisitStatusCode;
	}

	public void setVisitStatusCode(String visitStatusCode) {
		VisitStatusCode = visitStatusCode;
	}

	public String getNowPregnant() {
		return NowPregnant;
	}

	public void setNowPregnant(String nowPregnant) {
		NowPregnant = nowPregnant;
	}

	public String getFamilyPlanningID() {
		return FamilyPlanningID;
	}

	public void setFamilyPlanningID(String familyPlanningID) {
		FamilyPlanningID = familyPlanningID;
	}

	public String getFunctionalStatusCode() {
		return FunctionalStatusCode;
	}

	public void setFunctionalStatusCode(String functionalStatusCode) {
		FunctionalStatusCode = functionalStatusCode;
	}

	public int getWHOStage() {
		return WHOStage;
	}

	public void setWHOStage(int wHOStage) {
		WHOStage = wHOStage;
	}

	public String getTBStatusCode() {
		return TBStatusCode;
	}

	public void setTBStatusCode(String tBStatusCode) {
		TBStatusCode = tBStatusCode;
	}

	public String getIPTReasonCode() {
		return IPTReasonCode;
	}

	public void setIPTReasonCode(String iPTReasonCode) {
		IPTReasonCode = iPTReasonCode;
	}

	public String getTypeOfTPT() {
		return TypeOfTPT;
	}

	public void setTypeOfTPT(String typeOfTPT) {
		TypeOfTPT = typeOfTPT;
	}

	public int getARVStatusCode() {
		return ARVStatusCode;
	}

	public void setARVStatusCode(int aRVStatusCode) {
		ARVStatusCode = aRVStatusCode;
	}

	public int getARVReasonCode() {
		return ARVReasonCode;
	}

	public void setARVReasonCode(int aRVReasonCode) {
		ARVReasonCode = aRVReasonCode;
	}

	public int getARVCode() {
		return ARVCode;
	}

	public void setARVCode(int aRVCode) {
		ARVCode = aRVCode;
	}

	public String getNotes() {
		return Notes;
	}

	public void setNotes(String notes) {
		Notes = notes;
	}

	public int getStaffID() {
		return StaffID;
	}

	public void setStaffID(int staffID) {
		StaffID = staffID;
	}

	public int getUserNumber() {
		return UserNumber;
	}

	public void setUserNumber(int userNumber) {
		UserNumber = userNumber;
	}

	public Date getTheTimeStamp() {
		return TheTimeStamp;
	}

	public void setTheTimeStamp(Date theTimeStamp) {
		TheTimeStamp = theTimeStamp;
	}

	public String getAdverseEventsStatusCode() {
		return AdverseEventsStatusCode;
	}

	public void setAdverseEventsStatusCode(String adverseEventsStatusCode) {
		AdverseEventsStatusCode = adverseEventsStatusCode;
	}

	public int getDispenserID() {
		return DispenserID;
	}

	public void setDispenserID(int dispenserID) {
		DispenserID = dispenserID;
	}

	public Date getDateOfFirstANC() {
		return DateOfFirstANC;
	}

	public void setDateOfFirstANC(Date dateOfFirstANC) {
		DateOfFirstANC = dateOfFirstANC;
	}

	public Date getLNMPDate() {
		return LNMPDate;
	}

	public void setLNMPDate(Date lNMPDate) {
		LNMPDate = lNMPDate;
	}

	public int getTBInvestigationResults() {
		return TBInvestigationResults;
	}

	public void setTBInvestigationResults(int tBInvestigationResults) {
		TBInvestigationResults = tBInvestigationResults;
	}

	public String getIsIPTEligibility() {
		return IsIPTEligibility;
	}

	public void setIsIPTEligibility(String isIPTEligibility) {
		IsIPTEligibility = isIPTEligibility;
	}

	public String getIPTStatusCode() {
		return IPTStatusCode;
	}

	public void setIPTStatusCode(String iPTStatusCode) {
		IPTStatusCode = iPTStatusCode;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Date getRegDate() {
		return RegDate;
	}

	public void setRegDate(Date regDate) {
		RegDate = regDate;
	}
	
	
	
}
