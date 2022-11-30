package com.example1.SpringBootTutorial.repository;

import com.example1.SpringBootTutorial.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
}
