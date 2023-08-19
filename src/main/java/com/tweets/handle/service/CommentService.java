package com.tweets.handle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweets.handle.model.comment;
import com.tweets.handle.model.tweet;
import com.tweets.handle.model.user;
import com.tweets.handle.repository.CommentRepository;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private TweetService tweetService;

    @Autowired
    private UserService userService;
    
    public comment listCommentById(Integer id) {
        return commentRepository.findById(id).get();
    }

    public comment saveCommentForTweet(Integer id, comment comment) {
        user user = userService.getUserById(id);
        if (user != null) {
            tweet tweet = tweetService.listTweetById(comment.getTweet().getId());
            if (tweet != null) {
                comment.setUser(user);
                comment.setTweet(tweet);
                return commentRepository.save(comment);
            }


        }
        return null;

    }
}