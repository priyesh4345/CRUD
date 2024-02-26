package com.example.blogapi.payload;

import lombok.Data;

@Data
public class postDto {
    private long id;
    private String description;
    private String content;
    private String title;

}
