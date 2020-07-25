package com.greenfoxacademy.reddit2.repositories;

import com.greenfoxacademy.reddit2.modells.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository <Post, Long> {


}
