package com.mediscreen.note;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mediscreen.note.model.Note;
import com.mediscreen.note.service.NoteService;
import com.mediscreen.note.service.NoteServiceImpl;

@SpringBootTest
public class MediscreenNoteServiceTest {


	
	@Autowired
	private NoteServiceImpl noteServiceImpl;

	@Test
	public void noteServiceTest() {
		Note noteToSave = new Note();
		noteToSave.setId("6257e49f88101242a3f5936e");
		noteToSave.setPatientId(32);
		noteToSave.setRecommandation("pbs, rhume");

		Note createdNote = noteServiceImpl.saveNote(noteToSave);
		assertTrue(createdNote == noteToSave);

		noteServiceImpl.getNotes();
		
		noteServiceImpl.getNote(createdNote.getId());
		
		noteServiceImpl.getPatientNotes(createdNote.getPatientId());
		
		noteServiceImpl.deleteNote(createdNote.getId());
		
	}
	

}
