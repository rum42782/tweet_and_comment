package com.tweets.handle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweets.handle.model.tweet;

public interface TweetRepository extends JpaRepository<tweet, Integer>{
    
}
