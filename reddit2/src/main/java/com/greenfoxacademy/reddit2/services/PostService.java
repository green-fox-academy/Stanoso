package com.greenfoxacademy.reddit2.services;

import com.greenfoxacademy.reddit2.modells.Post;
import com.greenfoxacademy.reddit2.viewmodells.PostDTO;
import org.springframework.stereotype.Component;

@Component
public interface PostService {


    void saveNewPost(String title, String url);
    PostDTO covertPostToPostDTO (Post post);
}
