package com.mediscreen.note;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.mediscreen.note.controller.NoteController;
import com.mediscreen.note.model.Note;
import com.mediscreen.note.service.NoteService;
import com.mediscreen.note.service.NoteServiceImpl;

@WebMvcTest(controllers = NoteController.class)
public class MediscreenNoteControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private NoteServiceImpl noteServiceImpl;
	

	
	@Test
	public void testGetNote() throws Exception {
		mockMvc.perform(get("/note/{id}", "6229c17de3d06e2a0bccbf9d")).andExpect(status().isOk());
	}
	
	@Test
	public void testGetNotes() throws Exception {
		mockMvc.perform(get("/notes")).andExpect(status().isOk());
	}

	@Test
	public void testCreate() throws Exception {
		  mockMvc.perform(post("/note")
			      .content(asJsonString(new Note()))
			      .contentType(MediaType.APPLICATION_JSON)
			      .accept(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk());
	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
	
	
	@Test
	public void testGetPatientNotes() throws Exception {
		mockMvc.perform(get("/notes/{patientId}", 2)).andExpect(status().isOk());
	}

	
	
	@Test
	public void testDeleteNote() throws Exception {
		mockMvc.perform(delete("/note/{id}", "62556f7941200a88334af44d")).andExpect(status().isOk());
	}
}
