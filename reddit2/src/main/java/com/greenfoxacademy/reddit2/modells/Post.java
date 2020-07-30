package com.greenfoxacademy.reddit2.modells;

import javax.persistence.*;
import java.net.URL;
import java.time.Instant;
import java.util.HashMap;

@Entity
@Table (name = "posts")
public class Post {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String url;
    private Instant created;
    private int score;
    private HashMap<String,Boolean> vote;

    @ManyToOne
    @JoinColumn (name="userId")
    private User user;

    public Post () {}

    public Post (String title, String url, User user) {
        this.title = title;
        this.url = url;
        this.user = user;
        this.created = Instant.now();
        this.vote = null;
        this.score = 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Instant getCreated() {
        return created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public HashMap<String, Boolean> getVote() {
        return vote;
    }

    public void setVote(HashMap<String, Boolean> vote) {
        this.vote = vote;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
