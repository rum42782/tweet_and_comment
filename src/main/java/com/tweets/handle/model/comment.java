package com.tweets.handle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Comments")
public class comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String comment;

    @ManyToOne(optional = false)
    @JoinColumn(name = "tweetId", nullable = false)
    private tweet tweet;



    @ManyToOne(optional = false)
    @JoinColumn(name = "userId", nullable = false)
    private user user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public tweet getTweet() {
        return tweet;
    }

    public void setTweet(tweet tweet) {
        this.tweet = tweet;
    }

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }

    public comment() {
        super();
    }
    
    public comment(Integer id, String comment, com.tweets.handle.model.tweet tweet, com.tweets.handle.model.user user) {
        super();
        this.id = id;
        this.comment = comment;
        this.tweet = tweet;
        this.user = user;
    }
}
