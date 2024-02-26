package com.example.blogapi.controller;

import com.example.blogapi.payload.postDto;
import com.example.blogapi.service.postService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class postController {


    private postService postservice;

    public postController(postService postservice){
        this.postservice=postservice;
    }

    //http://localhost:8080/api/posts
    @PostMapping
    public ResponseEntity<postDto> createpost(@RequestBody postDto postdto){
        postDto save = postservice.createpo(postdto);
        return new ResponseEntity<>(save , HttpStatus.ACCEPTED);
    }
}
