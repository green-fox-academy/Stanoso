package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repostiories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.List;

@Component
public class PostServiceImp implements PostService {

    PostRepository postRepository;

    @Autowired
    public PostServiceImp(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    @Override
    public void savePost(String title, URL url) {
        this.postRepository.save(new Post(title, url));
    }

    @Override
    public List<Post> findAllPosts() {
        return (List<Post>) this.postRepository.findAll();
    }

    @Override
    public void addVote(Long id, char plus) {
        if (plus=='+') {
            this.postRepository.increaseScore(id);
        }
//        this.postRepository.decreaseScore(id);
    }
}
