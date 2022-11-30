package com.example1.SpringBootTutorial.controller;

import com.example1.SpringBootTutorial.model.Comment;
import com.example1.SpringBootTutorial.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @GetMapping("/comments")
    public List<Comment> getComments(){
        return commentService.getComments();
    }

    @GetMapping("/comments/{id}")
    public Comment getSingleComment(@PathVariable long id){
        return commentService.getSingleComment(id);
    }
}
