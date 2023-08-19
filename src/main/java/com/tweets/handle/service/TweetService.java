package com.tweets.handle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweets.handle.model.tweet;
import com.tweets.handle.model.user;
import com.tweets.handle.repository.TweetRepository;

@Service
public class TweetService {
    @Autowired
    private TweetRepository tweetRepo;

    @Autowired
    private UserService userService;

    public List<tweet> allTweets() {
        return tweetRepo.findAll();
    }

    public tweet saveTweet(tweet tweet, Integer id) {
        user user = userService.getUserById(id);
        if (user != null) {
            tweet.setUser(user);
            return tweetRepo.save(tweet);
        }
        return null;
    }

    public tweet listTweetById(Integer id) {
        return tweetRepo.findById(id).get();
    }
}