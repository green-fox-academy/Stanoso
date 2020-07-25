package com.greenfoxacademy.reddit2.modells;

import javax.persistence.*;
import java.net.URL;
import java.time.Instant;

@Entity
@Table (name = "posts")
public class Post {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private URL url;
    private Instant created;
    private int score;

    @ManyToOne
    @JoinColumn (name="userId")
    private User user;




}
