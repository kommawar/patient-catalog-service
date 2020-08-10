package io.javawork.patientcatalogservice.model;

public class Hospital {

	private int hospitalId;
	private String name;
	private String location;
	
	public Hospital() {
		
	}
	public Hospital(int hospitalId, String name, String location) {
		super();
		this.hospitalId = hospitalId;
		this.name = name;
		this.location = location;
	}
	
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
