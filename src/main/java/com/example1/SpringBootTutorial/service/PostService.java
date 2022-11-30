package com.example1.SpringBootTutorial.service;

import com.example1.SpringBootTutorial.model.Post;
import com.example1.SpringBootTutorial.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public List<Post> getPosts(){
        return postRepository.findAll();
    }
    public Post getSinglePost(long id){
        return postRepository.findById(id).orElseThrow();
    }

}
