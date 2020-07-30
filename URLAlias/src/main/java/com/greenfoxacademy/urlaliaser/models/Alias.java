package com.greenfoxacademy.urlaliaser.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alias {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private String alias;
    private int secretCode;
    private long hitCount;

    public Alias() {
    }

    public Alias (String alias, String url, int secretCode) {
        this.alias = alias;
        this.url = url;
        this.secretCode = secretCode;
        this.hitCount = 0;
    }

    public Alias(Long id, String alias, String url, int secretCode, long hitCount) {
        this.id = id;
        this.alias = alias;
        this.url = url;
        this.secretCode = secretCode;
        this.hitCount = hitCount;
    }

    public Long getId() {
        return id;
    }



    public String getUrl() {
        return url;
    }



    public String getAlias() {
        return alias;
    }



    public int getSecretCode() {
        return secretCode;
    }



    public long getHitCount() {
        return hitCount;
    }


}
