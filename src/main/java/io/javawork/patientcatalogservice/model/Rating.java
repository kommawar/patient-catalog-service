package io.javawork.patientcatalogservice.model;

public class Rating {
	
	private int ratingId;
	private int patientId;
	private int hospitalId;
	private int rating;
	
	public Rating() {
		
	}
	
	public Rating(int ratingId, int patientId, int hospitalId, int rating) {
		super();
		this.ratingId = ratingId;
		this.patientId = patientId;
		this.hospitalId = hospitalId;
		this.rating = rating;
	}
	
	public int getRatingId() {
		return ratingId;
	}
	public void setRatingId(int ratingId) {
		this.ratingId = ratingId;
	}
	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

}
