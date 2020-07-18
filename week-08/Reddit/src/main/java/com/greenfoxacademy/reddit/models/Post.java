package com.greenfoxacademy.reddit.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.net.URL;

@Entity
@Table(name="posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int score;
    private URL url;
    private String title;

    public Post () {}

    public Post(String title, URL url) {
        this.url = url;
        this.title = title;
        this.score = 0;
    }

    public Long getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public URL getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
