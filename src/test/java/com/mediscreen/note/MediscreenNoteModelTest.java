package com.mediscreen.note;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.mediscreen.note.model.Note;

@SpringBootTest
public class MediscreenNoteModelTest {
	
	@Test
	public void getNoteTest() {
		
		Note n = new Note();
		n.setId("6229c17de3d06e2a0bccbf9d");
		n.setPatientId(25);
		n.setRecommandation("patient, anticorps");

		assertThat(n.getId()).isEqualTo("6229c17de3d06e2a0bccbf9d");
		assertThat(n.getPatientId()).isEqualTo(25);
		assertThat(n.getRecommandation()).isEqualTo("patient, anticorps");
	}
	
	@Test
	public void setNoteTest() {

		Note note = new Note("6229c17de3d06e2a0bccbf9d", 52, "paris, vertige");

		assertThat(note.getId()).isEqualTo("6229c17de3d06e2a0bccbf9d");
		assertThat(note.getPatientId()).isEqualTo(52);
		assertThat(note.getRecommandation()).isEqualTo("paris, vertige");
	}

}
