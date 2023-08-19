package com.tweets.handle.repository;


import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;

import com.tweets.handle.model.user;

public interface UserRepository extends JpaRepository<user, Integer> {
    public user findByUsername(String username);
}
