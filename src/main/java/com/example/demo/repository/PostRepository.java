package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.PostResponse;



@Repository
public interface PostRepository extends JpaRepository<PostResponse, Long> {
   
}
