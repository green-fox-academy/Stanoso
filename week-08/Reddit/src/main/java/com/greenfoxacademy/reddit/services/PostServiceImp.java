package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repostiories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaBuilder;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        if (totalPosts % 10 > 0) {
            return totalPosts / 10 + 1;
        } else {
            return totalPosts / 10;
        }
    }

    @Override
    public List<Post> getListOfPostsForPageNumber(int page) {
        return this.findAllPosts().stream().skip((page - 1) * 10).limit(page * 10).collect(Collectors.toList());
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
