package com.example.raiffeisen_backend.note.service;

import com.example.raiffeisen_backend.note.model.Note;
import com.example.raiffeisen_backend.note.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

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
        Note note = noteRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Note with id " + id + " does not exist"));

        if (title != null && !title.isEmpty()) {
            note.setTitle(title);
        }

        if (content != null && !content.isEmpty()) {
            note.setContent(content);
        }

        note.setUpdateAt(LocalDate.now());
        noteRepository.save(note);
    }

    public void deleteNote(Long id) {
        noteRepository.deleteById(id);
    }
}
