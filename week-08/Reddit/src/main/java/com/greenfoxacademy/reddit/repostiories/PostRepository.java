package com.greenfoxacademy.reddit.repostiories;

import com.greenfoxacademy.reddit.models.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

    @Query("UPDATE Post c SET c.score=+1 WHERE c.id=:id")
    void increaseScore(Long id);

//    @Query
//            ("UPDATE posts c SET c.score=-1 WHERE id=:id")
//    void decreaseScore(Long id);

}
