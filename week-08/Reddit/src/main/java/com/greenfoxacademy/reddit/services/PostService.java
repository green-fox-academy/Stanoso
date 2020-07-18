package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.List;

@Component
public interface PostService {

    void savePost(String title, URL url);
    List<Post> findAllPosts();
    void addVote(Long id, char plus);


}
