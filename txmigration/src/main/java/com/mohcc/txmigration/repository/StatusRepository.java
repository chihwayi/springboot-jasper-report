package com.mohcc.txmigration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohcc.txmigration.model.Status;
import com.mohcc.txmigration.model.StatusID;

@Repository
public interface StatusRepository extends JpaRepository<Status,StatusID>{
	List<Status> findByStatus(String status);
	List<Status> findByStatusIDPatientID(String PatientID);
	

}
