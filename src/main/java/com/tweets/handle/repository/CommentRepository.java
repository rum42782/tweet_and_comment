package com.tweets.handle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweets.handle.model.comment;

public interface CommentRepository extends JpaRepository<comment, Integer>{
    
}
