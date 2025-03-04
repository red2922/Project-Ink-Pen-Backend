package com.jake.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jake.demo.Services.PostsService;
import com.jake.demo.dto.Post;

@RestController
@RequestMapping("/api")

public class PostController {
    @Autowired
    private PostsService postService;

    @PostMapping("/post")
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        Post savedPost = postService.createNewPost(post);
        return new ResponseEntity<>(savedPost, HttpStatus.CREATED);
    }

}
