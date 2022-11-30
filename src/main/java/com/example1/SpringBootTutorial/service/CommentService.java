package com.example1.SpringBootTutorial.service;

import com.example1.SpringBootTutorial.model.Comment;
import com.example1.SpringBootTutorial.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    public List<Comment> getComments(){
        return commentRepository.findAll();
    }
    public Comment getSingleComment(long id){
        return commentRepository.findById(id).orElseThrow();
    }
}
