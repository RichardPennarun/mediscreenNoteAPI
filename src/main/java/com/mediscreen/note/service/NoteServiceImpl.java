package com.mediscreen.note.service;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mediscreen.note.model.Note;
import com.mediscreen.note.repository.NoteRepository;

@Service
public class NoteServiceImpl {


    @Autowired
    private NoteRepository noteRepository;

    public Optional<Note> getNote(String id) {
        return noteRepository.findById(id);
    }

    public Iterable<Note> getNotes() {
        return noteRepository.findAll();
    }

    public Note saveNote(Note note) {
    	Note savedNote = noteRepository.save(note);
        return savedNote;
    }

    public Iterable<Note> getPatientNotes(int patientId) {
        return noteRepository.findAllByPatientId(patientId);
    }
	
    public void deleteNote(String id) {
    	noteRepository.deleteNoteById(id);
    }

}
