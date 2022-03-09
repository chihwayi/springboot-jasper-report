package com.mohcc.txmigration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohcc.txmigration.model.Visits;
import com.mohcc.txmigration.model.VisitsID;

@Repository
public interface VisitsRepository extends JpaRepository<Visits,VisitsID>{
  List<Visits> findByVisitsIDPatientID(String PatientID);
}
