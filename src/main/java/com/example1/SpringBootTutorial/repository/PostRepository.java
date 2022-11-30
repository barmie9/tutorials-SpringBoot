package com.example1.SpringBootTutorial.repository;

import com.example1.SpringBootTutorial.model.Post;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

    //First method:
//    @Query("select p from Post p where title = ?1")
//    List<Post> findAllByTitle(String title);

    //Second method:
//    @Query("select p from Post p where title = :title")
//    List<Post> findAllByTitle(@Param("title") String title);

    //3th method. In Java >=8  We can add Param to compiler
    // We must add some code to build.gradle
//    @Query("select p from Post p where title = :title")
//    List<Post> findAllByTitle(String title);

    //4th method for simple select:
//    List<Post> findAllByTitle(String title);
    // Why it works? Look at this:
    //https://docs.spring.io/spring-data/jpa/docs/2.2.7.RELEASE/reference/html/#jpa.query-methods



    //Resolve problem with query N + 1 (Many queries in database)

    //Żeby popbrać powiązaną Encje należu użyć słowa "fetch"
//    @Query("select p from Post p " +
//            "left join fetch p.comment")
//    List<Post> findAllPosts();

    // Paging (Stronicowanie):
    @Query("select p from Post p " +
            "left join fetch p.comment")
    List<Post> findAllPosts(Pageable page);


}
