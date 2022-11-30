package com.example1.SpringBootTutorial.service;

import com.example1.SpringBootTutorial.model.Post;
import com.example1.SpringBootTutorial.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public List<Post> getPosts(){
        return postRepository.findAllPosts(PageRequest.of(0,5)); //Param use to paging (Stronicowanie)
    }
    public Post getSinglePost(long id){
        return postRepository.findById(id).orElseThrow();
    }

}
