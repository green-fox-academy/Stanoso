package com.greenfoxacademy.reddit.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.net.URL;
import java.util.Date;

@Entity
@Table(name="posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int score;
    private URL url;
    private String title;
    private Date created;

    public Post () {
        this.created = new Date();
    }

    public Post(String title, URL url) {
        this.url = url;
        this.title = title;
        this.score = 0;
        this.created = new Date();
    }

    public Post(Long id, int score, URL url, String title) {
        this.id = id;
        this.score = score;
        this.url = url;
        this.title = title;
        this.created = new Date();
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

    public Date getCreated() {
        return created;
    }
}
