package com.example.raiffeisen_backend.note.repository;

import com.example.raiffeisen_backend.note.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
