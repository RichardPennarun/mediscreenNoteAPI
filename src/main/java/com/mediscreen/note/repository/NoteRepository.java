package com.mediscreen.note.repository;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.mediscreen.note.model.Note;

@Repository
public interface NoteRepository extends MongoRepository<Note, String>{
	
	Iterable<Note> findAllByPatientId(int patientId);
	
	//@Query(value="{'_id' : $0}", delete = true)
	Long deleteNoteById (String id) ;

	Optional<Note> findById(String id);
	
}
