package io.javawork.patientcatalogservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javawork.patientcatalogservice.model.PatientCatalog;
import io.javawork.patientcatalogservice.service.PatientCatalogService;

@RestController
public class PatientCatalogServiceController {

	@Autowired
	private PatientCatalogService patientCatalogService;

	@RequestMapping("patient-catalog/{patientId}")
	public List<PatientCatalog> getPatientCatalogs(@PathVariable("patientId") int patientId) {

		return patientCatalogService.getPatientgetPatientCatalogs(patientId);

	}

}
