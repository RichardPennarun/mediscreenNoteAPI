package com.mediscreen.note.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "notes")
public class Note {

	@Indexed(unique = true)
	@Field(value = "_id")
	private String id;
	
	@Field(value = "patient_id")
	private int patientId;
	
	private String recommandation;
	
	public Note() {
		
	}
	
	public Note(String id, int patientId, String recommandation) {
		this.id = id;
		this.patientId = patientId;
		this.recommandation = recommandation;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getRecommandation() {
		return recommandation;
	}

	public void setRecommandation(String recommandation) {
		this.recommandation = recommandation;
	}

	
	
	
}
