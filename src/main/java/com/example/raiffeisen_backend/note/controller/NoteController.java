package com.example.raiffeisen_backend.note.controller;

import com.example.raiffeisen_backend.note.model.Note;
import com.example.raiffeisen_backend.note.service.NoteService;
import com.example.raiffeisen_backend.note.dto.NoteUpdateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping(path = "api/v1/notes")
public class NoteController {

    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
    public List<Note> getNotes() {
        return noteService.getNotes();
    }

    @PostMapping
    public ResponseEntity<String> saveNote(@RequestBody Note note) {
        try {
            note.setCreatedAt(LocalDate.now());
            note.setUpdatedAt(LocalDate.now());
            noteService.saveNote(note);
            return new ResponseEntity<>("Note saved successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Error saving note: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<String> updateNote(
            @PathVariable("id") Long id,
            @RequestBody NoteUpdateDTO noteUpdateDTO) {
        noteService.updateNote(id, noteUpdateDTO.getTitle(), noteUpdateDTO.getContent());
        return new ResponseEntity<>("Note updated successfully", HttpStatus.OK);
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<String> deleteNote(@PathVariable("id") Long id) {
        noteService.deleteNote(id);
        return new ResponseEntity<>("Note deleted successfully", HttpStatus.OK);
    }
}
