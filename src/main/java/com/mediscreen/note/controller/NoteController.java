package com.mediscreen.note.controller;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mediscreen.note.model.Note;
import com.mediscreen.note.service.NoteServiceImpl;

@RestController
public class NoteController {

	@Autowired
	private NoteServiceImpl noteServiceImpl;

	

	/**
	 * Read - Get a Note
	 * 
	 * @param id a String
	 * @return An optional Note
	 */
	@GetMapping("/note/{id}")
	public Note getNote(@PathVariable("id") final String id) {
		Optional<Note> note = noteServiceImpl.getNote(id);
		if (note.isPresent()) {
			return note.get();
		} else {
			return null;
		}
	}
	
	/**
	 * Read - Get all notes
	 * 
	 * @return - An Iterable object of Note full filled
	 */
	@GetMapping("/notes")
	public Iterable<Note> getNotes() {
		return noteServiceImpl.getNotes();
	}

	/**
	 * Create - Add a new note
	 * 
	 * @param note An object note
	 * @return The note object saved
	 */
	@PostMapping("/note")
	public Note createNote(@RequestBody Note note) {
		return noteServiceImpl.saveNote(note);
	}

	/**
	 * Read - Get all notes for a given patient
	 * 
	 * @param id The id of the patient
	 * @return An Note object full filled
	 */
	@GetMapping("/notes/{patientId}")
	public Iterable<Note> getPatientNotes(@PathVariable("patientId") final int patientId) {
		Iterable<Note> notes = noteServiceImpl.getPatientNotes(patientId);
		return notes;
	}



	/**
	 * Delete - Delete a Patient
	 * 
	 * @param id a String
	 * @return void
	 */
	@DeleteMapping("/note/{id}")
	public void deleteNote(@PathVariable("id") final String id) {
		noteServiceImpl.deleteNote(id);
	}
	
	
	
}
