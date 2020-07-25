package com.greenfoxacademy.reddit2.services;

import com.greenfoxacademy.reddit2.repositories.PostRepository;
import org.springframework.stereotype.Component;

@Component
public class PostServiceImpl implements PostService {

    PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

}
