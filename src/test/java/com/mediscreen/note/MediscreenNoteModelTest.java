package com.mediscreen.note;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.mediscreen.note.model.Note;

@SpringBootTest
public class MediscreenNoteModelTest {

	@Test
	public void getNoteTest() {

		Note n = new Note();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		n.setId("6229c17de3d06e2a0bccbf9d");
		n.setDate(timestamp);
		n.setPatientId(25);
		n.setRecommendation("patient, anticorps");

		assertThat(n.getId()).isEqualTo("6229c17de3d06e2a0bccbf9d");
		assertThat(n.getPatientId()).isEqualTo(25);
		assertThat(n.getRecommendation()).isEqualTo("patient, anticorps");
	}

	@Test
	public void setNoteTest() {

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Note note = new Note("6229c17de3d06e2a0bccbf9d", timestamp, 52, "paris, vertige");

		assertThat(note.getId()).isEqualTo("6229c17de3d06e2a0bccbf9d");
		assertThat(note.getPatientId()).isEqualTo(52);
		assertThat(note.getRecommendation()).isEqualTo("paris, vertige");
	}

}
