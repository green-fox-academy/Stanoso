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

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(int secretCode) {
        this.secretCode = secretCode;
    }

    public long getHitCount() {
        return hitCount;
    }

    public void setHitCount(long hitCount) {
        this.hitCount = hitCount;
    }
}
