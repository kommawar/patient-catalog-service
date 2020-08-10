package io.javawork.patientcatalogservice.model;

public class PatientCatalog {
	
	private String hospitalName;
	private String location;
	private int rating;
	
	public PatientCatalog() {
		
	}
	
	public PatientCatalog(String hospitalName, String location, int rating) {
		super();
		this.hospitalName = hospitalName;
		this.location = location;
		this.rating = rating;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
