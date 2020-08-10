package io.javawork.patientcatalogservice.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.javawork.patientcatalogservice.model.Hospital;
import io.javawork.patientcatalogservice.model.PatientCatalog;
import io.javawork.patientcatalogservice.model.Rating;

@Service
public class PatientCatalogService {

	@Autowired
	RestTemplate restTemplate;
	
	public List<PatientCatalog> getPatientgetPatientCatalogs(int patientId) {

		// get all ratings of the patient
		//RestTemplate restTemplate = new RestTemplate();
		List<Rating> ratings = Arrays
				.asList(restTemplate.getForObject("http://RATINGS-INFO-SERVICE/ratings", Rating[].class));

		// get each hospital details (name and location)
		return ratings.stream().map(rating -> {
			Hospital hospital = restTemplate.getForObject("http://HOSPITAL-INFO-SERVICE/hospitals/" + rating.getHospitalId(), Hospital.class);
			return new PatientCatalog(hospital.getName(), hospital.getLocation(), rating.getRating());
		}).collect(Collectors.toList());
	}

}
