package com.example.raiffeisen_backend.note;

// import jakarta.persistence.*;
import java.time.LocalDate;

// @Entity
public class Note {
    private String title;
    private String content;
    private LocalDate createdAt;
    private LocalDate updateAt;

    public Note() {
    }

    public Note(String title, String content, LocalDate createdAt, LocalDate updateAt) {
        this.title = title;
        this.content = content;
        this.createdAt = LocalDate.now();
        this.updateAt = LocalDate.now();
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

    public LocalDate getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDate updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
