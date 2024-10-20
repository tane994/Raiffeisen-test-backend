package com.example.raiffeisen_backend.note.config;

import com.example.raiffeisen_backend.note.model.Note;
import com.example.raiffeisen_backend.note.repository.NoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class NoteConfig {
    @Bean
    CommandLineRunner commandLineRunner(NoteRepository repository) {
        return args -> {
            Note javaNote = new Note(
                    "Java Basics",
                    "Java is a class-based, object-oriented programming language. Key concepts include: classes, objects, inheritance, and polymorphism."
            );

            Note springNote = new Note(
                    "Spring Framework",
                    "Spring is a powerful framework for building Java applications. It provides features like dependency injection, aspect-oriented programming, and simplified database access."
            );

            Note gitNote = new Note(
                    "Git Version Control",
                    "Git is a distributed version control system. Essential commands: git init, git add, git commit, git push, git pull, git branch, git merge."
            );
            repository.saveAll(List.of(javaNote, springNote, gitNote));
        };
    }
}
