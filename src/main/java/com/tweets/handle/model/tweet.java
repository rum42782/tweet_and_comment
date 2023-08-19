package com.tweets.handle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "tweets")
public class tweet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String content;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private user user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public tweet() {
        super();
    }
    
    public tweet(Integer id, String content, com.tweets.handle.model.user user) {
        super();
        this.id = id;
        this.content = content;
        this.user = user;
    }

    @Override
    public String toString() {
        return "tweet [id=" + id + ", content=" + content + ", user=" + user + "]";
    }

    public void setContent(String content) {
        this.content = content;
    }

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }


}
