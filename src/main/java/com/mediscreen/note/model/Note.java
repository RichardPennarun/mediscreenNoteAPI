package com.mediscreen.note.model;

import java.util.Date;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "notes")
public class Note {

	@Indexed(unique = true)
	private String id;

	@Field(value = "creation_date")
	private Date date;

	@Field(value = "patient_id")
	private int patientId;

	private String recommendation;

	public Note() {
	}

	public Note(String id, Date date, int patientId, String recommendation) {
		this.id = id;
		this.date = date;
		this.patientId = patientId;
		this.recommendation = recommendation;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

}
