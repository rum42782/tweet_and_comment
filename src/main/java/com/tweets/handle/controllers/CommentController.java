package com.tweets.handle.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tweets.handle.model.comment;
import com.tweets.handle.service.CommentService;

@RestController
@RequestMapping("comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("id/{id}")
    public comment listCommentById(@RequestParam Integer id) {
        return commentService.listCommentById(id);
    }

    @PostMapping("save")
    public comment saveCommentForTweet(@RequestParam Integer id, @RequestBody comment comment) {
        return commentService.saveCommentForTweet(id, comment);
    }

}
