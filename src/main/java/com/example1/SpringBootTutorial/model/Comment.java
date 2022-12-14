package com.example1.SpringBootTutorial.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Comment {
    @Id
    private long id;
//    private long postId;
    private String content;
    private LocalDateTime created;
}
