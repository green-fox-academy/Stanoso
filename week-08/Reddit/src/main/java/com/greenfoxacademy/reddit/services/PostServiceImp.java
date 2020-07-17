package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repostiories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostServiceImp implements PostService {

    private PostRepository postRepository;

    @Autowired
    public PostServiceImp (PostRepository postRepository) {
        this.postRepository = postRepository;
    }



}
