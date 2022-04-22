package com.mediscreen.note.service;

import java.util.Optional;

import com.mediscreen.note.model.Note;

public interface NoteService {
	
	Optional<Note> getNote(String id);

    Iterable<Note> getNotes();

    Note saveNote(Note note);
    
    Iterable<Note> getPatientNotes(int patientId);
    
    void deleteNote(final String id);
    
    void deleteNotes(final int patientId);

}
