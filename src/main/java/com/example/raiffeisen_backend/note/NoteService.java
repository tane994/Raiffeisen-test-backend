package com.example.raiffeisen_backend.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {
    private final NoteRepository noteRepository;

    @Autowired
    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> getNotes() {
        return noteRepository.findAll();
    }

    public void saveNote(Note note) {
        noteRepository.save(note);
    }

    public void updateNote(Long id, String title, String content) {
        Note currentNote = noteRepository.findById(id).orElseThrow(() -> new IllegalStateException("Student with id: " + id + " not present."));

    }

    public void deleteNote(Long id) {
        noteRepository.deleteById(id);
    }
}
