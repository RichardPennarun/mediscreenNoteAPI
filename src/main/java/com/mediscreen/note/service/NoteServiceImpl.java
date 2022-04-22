package com.mediscreen.note.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediscreen.note.model.Note;
import com.mediscreen.note.repository.NoteRepository;

@Service
public class NoteServiceImpl {

	@Autowired
	private NoteRepository noteRepository;

	// Get note by its id
	public Optional<Note> getNote(String id) {
		return noteRepository.findById(id);
	}

	// Get all notes
	public Iterable<Note> getNotes() {
		return noteRepository.findAll();
	}

	// Save note
	public Note saveNote(Note note) {
		Note savedNote = noteRepository.save(note);
		return savedNote;
	}

	// Get all notes for a given patient
	public Iterable<Note> getPatientNotes(int patientId) {
		return noteRepository.findAllByPatientId(patientId);
	}

	// Delete note by id
	public void deleteNote(String id) {
		noteRepository.deleteNoteById(id);
	}

	// Delete notes by patientI
	public void deleteNotes(int patientId) {
		noteRepository.deleteAllByPatientId(patientId);

	}

}
