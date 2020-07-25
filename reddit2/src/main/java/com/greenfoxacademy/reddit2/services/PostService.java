package com.greenfoxacademy.reddit2.services;

import com.greenfoxacademy.reddit2.modells.Post;
import com.greenfoxacademy.reddit2.viewmodells.PostDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PostService {


    void saveNewPost(String title, String url);
    PostDTO convertPostToPostDTO (Post post);
    List<Post> getListOfPosts();
    List<PostDTO> getListOfPostsDTO();
}
