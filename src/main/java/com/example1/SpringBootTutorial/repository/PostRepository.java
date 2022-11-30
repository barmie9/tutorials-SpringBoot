package com.example1.SpringBootTutorial.repository;

import com.example1.SpringBootTutorial.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
}
