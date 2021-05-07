package com.example.demo.controller;

import static org.springframework.http.ResponseEntity.status;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PostResponse;
import com.example.demo.repository.PostRepository;

@RestController
@RequestMapping("/api/posts/")
public class PostController {

	@Autowired
	PostRepository postRepo;
   

	 @RequestMapping("createPost")
	 public void createPost() {
		 PostResponse postResponse = new PostResponse("spring boot",
				 "reddit.com",
				 "Post related to spring boot information",
				 "karthick",
				 "sub reddit",
				 0,
				 0,
				 " 2 Hours",
				 true,
				 true);
		 postRepo.save(postResponse);
	 }
	
	
    @GetMapping
    public ResponseEntity<List<PostResponse>> getAllPosts() {
//        return ResponseEntity.ok("Hello World!");
    	
    	System.out.println(postRepo.findAll());
    	
    	return status(HttpStatus.OK).body(postRepo.findAll());
    }

   
  

    
}
