package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PostServiceImp implements PostService {

    int postsPerPage = 10;

    PostRepository postRepository;

    @Autowired
    public PostServiceImp(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    @Override
    public void savePost(String title, URL url, User currenUser) {
        //najít usera podle jména a uložit post s ním asi upravit metodu na User a ne String
        this.postRepository.save(new Post(title, url, currenUser));
    }

    @Override
    public List<Post> findAllPosts() {
        List<Post> allPosts = (List<Post>) this.postRepository.findAll();
        return allPosts.stream().sorted(Comparator.comparing(Post::getScore).reversed()).collect(Collectors.toList());
    }

    @Override
    public void addVote(char plus, Long id) {
        int score = this.postRepository.findById(id).get().getScore();
        if (plus == '+') {
            score++;
        } else {
            score--;
        }
        Post postChangeScore = new Post(id, score, this.postRepository.findById(id).get().getUrl(), this.postRepository.findById(id).get().getTitle());
        this.postRepository.save(postChangeScore);
    }

    @Override
    public Integer getTotalNumberOfPages() {
        int totalPosts = (int) this.findAllPosts().stream().count();

        if (totalPosts % postsPerPage > 0) {
            return totalPosts / postsPerPage + 1;
        } else {
            return totalPosts / postsPerPage;
        }
    }

    @Override
    public List<Post> getListOfPostsForPageNumber(int page) {
        if (page<=0)
        {
            page = 1;
        }
        return this.findAllPosts().stream().skip((page - 1) * postsPerPage).limit(postsPerPage).collect(Collectors.toList());
    }

    @Override
    public List<Integer> getListOfPageNumbers(Integer totalPages) {
        List<Integer> listOfPageNumbers = new ArrayList<>();
        for (int i = 0; i < totalPages; i++) {
            listOfPageNumbers.add(i + 1);
        }
        return listOfPageNumbers;
    }


}
