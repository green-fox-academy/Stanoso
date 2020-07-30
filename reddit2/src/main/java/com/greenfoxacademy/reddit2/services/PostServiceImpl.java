package com.greenfoxacademy.reddit2.services;

import com.greenfoxacademy.reddit2.modells.Post;
import com.greenfoxacademy.reddit2.modells.User;
import com.greenfoxacademy.reddit2.repositories.PostRepository;
import com.greenfoxacademy.reddit2.viewmodells.PostDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PostServiceImpl implements PostService {

    int postsPerPage = 10;

    PostRepository postRepository;
    UserService userService;
    DateTimeFormatter dateTimeFormatter;

    public PostServiceImpl(PostRepository postRepository, UserService userService, DateTimeFormatter dateTimeFormatter) {
        this.postRepository = postRepository;
        this.userService = userService;
        this.dateTimeFormatter = dateTimeFormatter;
    }

    @Override
    public void saveNewPost(String title, String url) {
        User currentUser = this.userService.getCurrentUser();
        Post newPost = new Post(title, url, currentUser);
        this.postRepository.save(newPost);
    }

    @Override
    public PostDTO convertPostToPostDTO(Post post) {
        PostDTO postDTO = new PostDTO();
        postDTO.setId(post.getId());
        postDTO.setTitle(post.getTitle());
        postDTO.setUrl(post.getUrl());
        postDTO.setDate(this.dateTimeFormatter.getDate(post.getCreated()));
        postDTO.setTime(this.dateTimeFormatter.getTime(post.getCreated()));
        postDTO.setScore(post.getScore());
        postDTO.setUserName(post.getUser().getUserName());
        if (post.getVote() == null) {
            postDTO.setTotalVotes(0);
        } else {
            postDTO.setTotalVotes(post.getVote().size());
        }
        return postDTO;
    }

    @Override
    public List<Post> getListOfPosts() {
        List<Post> postList = (List<Post>) this.postRepository.findAll();
        return postList;
    }

    @Override
    public List<PostDTO> getListOfPostsDTO() {
        List<Post> postList = getListOfPosts();
        List<PostDTO> postDTOList = new ArrayList<>();
        for (Post post : postList) {
            postDTOList.add(convertPostToPostDTO(post));
        }
        return postDTOList;
    }


    @Override
    public Integer getCurrentPage(Integer page, Integer totalPages) {
        if (page == null || page <= 0) {
            return 1;
        }
        if (page > totalPages) {
            return totalPages;
        }
        return page;
    }

    @Override
    public List<PostDTO> getListoOfPostsDTOForPageNumber(Integer currentPage) {
        return this.getListOfPostsDTO().stream().skip((currentPage - 1) * postsPerPage).limit(postsPerPage).collect(Collectors.toList());
    }

    @Override
    public List<Integer> getListOfPageNumbers() {
        int total = (int) this.getListOfPosts().stream().count();
        if (total % postsPerPage > 0) {
            total = total / postsPerPage + 1;
        } else {
            total = total / postsPerPage;
        }
        List<Integer> listOfPageNumbers = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            listOfPageNumbers.add(i + 1);
        }
        return listOfPageNumbers;
    }


}
