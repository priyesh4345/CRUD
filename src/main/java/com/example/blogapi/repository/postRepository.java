package com.example.blogapi.repository;

import com.example.blogapi.entity.post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface postRepository extends JpaRepository<post,Long> {
}
