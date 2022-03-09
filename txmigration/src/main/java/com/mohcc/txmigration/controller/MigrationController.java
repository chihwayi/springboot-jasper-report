package com.mohcc.txmigration.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohcc.txmigration.model.Status;
import com.mohcc.txmigration.model.Visits;
import com.mohcc.txmigration.repository.StatusRepository;
import com.mohcc.txmigration.repository.VisitsRepository;

@RestController
@RequestMapping("/api")
public class MigrationController {

	@Autowired
	public VisitsRepository visitsRepository;

	@Autowired
	public StatusRepository statusRepository;

	@GetMapping("/visits")
	public List<Visits> getAllVisits() {
		return visitsRepository.findAll();
	}
	
	@GetMapping("/visits/paged")
	public List<Visits> getAllPagedVisits() {
		return visitsRepository.findAll().stream().distinct().collect(Collectors.toList());
	}

	@PostMapping("/visits")
	public Visits createVisit(@RequestBody Visits visit) {
		return visitsRepository.save(visit);
	}

	@GetMapping("/visits/{PatientID}")
	public List<Visits> getVisitByVisitsIDPatientID(@PathVariable(value = "PatientID") String patientId) {
		return visitsRepository.findByVisitsIDPatientID(patientId);
	}

	@GetMapping("/status")
	public List<Status> getAllStatuses() {
		return statusRepository.findAll();
	}
	
	@GetMapping("/status/died/{PatientID}")
	public List<Status> getStatusByPatientID(@PathVariable(value = "PatientID") String patientId) {
		return statusRepository.findByStatusIDPatientID(patientId);
	}

	@GetMapping("/status/{status}")
	public List<Status> getStatusByStatusName(@PathVariable(value = "status") String status) {
		return statusRepository.findByStatus(status);
	}

	@GetMapping("/status/status")
	public List<Status> getStatusByStatus() {
		return statusRepository.findByStatus("Died");
	}

	@GetMapping("/visits/died")
	public List<Visits> getVisitDeadPatients() {
		List<Status> patients = getStatusByStatus();
		String[] patIDs;
		String PatientID = "";
		for (Status stat : patients) {
			PatientID = stat.getStatusID().getPatientID();
			// Date StatusDate = stat.getStatusID().getStatusDate();
		}
		patIDs = new String[] { PatientID };

		String patientId = "";
		for (int i = 0; i <= patIDs.length; i++) {
			patientId = patIDs[i];
			i++;
		}
		return visitsRepository.findByVisitsIDPatientID(patientId);
	}
}
