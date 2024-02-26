package com.example.blogapi.service.impl;

import com.example.blogapi.entity.post;
import com.example.blogapi.payload.postDto;
import com.example.blogapi.repository.postRepository;
import com.example.blogapi.service.postService;
import org.springframework.stereotype.Service;

@Service
public class postServiceImpl implements postService {

    private postRepository postrepository;

    public postServiceImpl(postRepository postrepository){
        this.postrepository = postrepository;
    }


    @Override
    public postDto createpo(postDto postdto) {
        post Post = maptoentity(postdto);
        post save = postrepository.save(Post);
        postDto dto = maptodto(save);
        return dto;
    }

    post maptoentity(postDto postdto){
        post Post = new post();
        postdto.setContent(Post.getContent());
        postdto.setDescription(Post.getDescription());
        postdto.setTitle(Post.getTitle());
        return Post;
    }

    postDto maptodto(post Post){
        postDto dto = new postDto();
        dto.setTitle(Post.getTitle());
        dto.setId(Post.getId());
        dto.setDescription(Post.getDescription());
        dto.setContent(Post.getContent());
        return dto;
    }


}
