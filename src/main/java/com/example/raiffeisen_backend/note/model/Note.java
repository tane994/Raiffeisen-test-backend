package com.example.raiffeisen_backend.note.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "notes")
public class Note {
    @Id
    @SequenceGenerator(
            name="note_sequence",
            sequenceName = "note_sequence",
            allocationSize = 1

    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "note_sequence"
    )
    private Long id;

    private String title;
    private String content;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public Note() {
    }

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
        this.createdAt = LocalDate.now();
        this.updatedAt = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updatedAt +
                '}';
    }

}