package com.mediscreen.note.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;

import com.mediscreen.note.model.Note;

public interface NoteService {
	
	Optional<Note> getNote(String id);

    Iterable<Note> getNotes();

    Note saveNote(Note note);
    
    Iterable<Note> getPatientNotes(int patientId);
    
    void deleteNote(final String id);

}
