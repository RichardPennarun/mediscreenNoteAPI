package com.mediscreen.note;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mediscreen.note.model.Note;
import com.mediscreen.note.service.NoteServiceImpl;

@SpringBootTest
public class MediscreenNoteServiceTest {

	@Autowired
	private NoteServiceImpl noteServiceImpl;

	@Test
	public void noteServiceTest() {
		Note noteToSave = new Note();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		noteToSave.setId("6257e49f88101242a3f5936e");
		noteToSave.setDate(timestamp);
		noteToSave.setPatientId(32);
		noteToSave.setRecommendation("pbs, rhume");

		Note noteToSave2 = new Note();
		Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
		noteToSave.setId("2457e49f88101242a3f5936e");
		noteToSave.setDate(timestamp2);
		noteToSave.setPatientId(32);
		noteToSave.setRecommendation("bonne humeur et rigolade");

		Note createdNote = noteServiceImpl.saveNote(noteToSave);
		Note createdNote2 = noteServiceImpl.saveNote(noteToSave2);

		assertTrue(createdNote == noteToSave);

		noteServiceImpl.getNotes();

		noteServiceImpl.getNote(createdNote.getId());

		noteServiceImpl.getPatientNotes(createdNote.getPatientId());

		noteServiceImpl.deleteNote(createdNote.getId());

		noteServiceImpl.deleteNotes(createdNote2.getPatientId());

	}

}
