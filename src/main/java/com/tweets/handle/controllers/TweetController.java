package com.tweets.handle.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tweets.handle.model.tweet;
import com.tweets.handle.service.TweetService;

@RestController
@RequestMapping("tweet")
public class TweetController {
    @Autowired
    private TweetService tweetService;

    
    @GetMapping("tweets")
    public List<tweet> allTweets() {
        return tweetService.allTweets();
    }

    @PostMapping("save")
    public tweet saveTweetById(@RequestParam Integer id, @RequestBody tweet tweet) {
        return tweetService.saveTweet(tweet, id);
    }

    @GetMapping("tweets/{id}")
    public tweet listTweetById(@PathVariable Integer id) {
        return tweetService.listTweetById(id);
    }
}
