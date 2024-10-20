package com.example.raiffeisen_backend.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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
    public void saveNote(@RequestBody Note note) {
        noteService.saveNote(note);
    }

    @PutMapping(path = "/update/{id}")
    public void updateNote( @PathVariable("id") Long id, @RequestBody String title, @RequestBody String content) {
        noteService.updateNote(id, title, content);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteNote(@PathVariable("id") Long id) {
        noteService.deleteNote(id);
    }
}
