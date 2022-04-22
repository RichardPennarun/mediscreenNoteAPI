package com.mediscreen.note.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mediscreen.note.model.Note;

@Repository
public interface NoteRepository extends MongoRepository<Note, String>{
	
	// find note by patientId
	Iterable<Note> findAllByPatientId(int patientId);
	
	// Delete note by id
	Long deleteNoteById (String id) ;

	// Find nte by id
	Optional<Note> findById(String id);

	// Delete notes by patientId
	void deleteAllByPatientId(int patientId);
	
}
