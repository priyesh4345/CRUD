package com.example.blogapi.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Posts", uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})})
public class post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "description" , nullable = false)
    private String description;
    @Column(name = "content" ,nullable = false)
    private String content;
    @Column(name = "title" , nullable = false)
    private String title;
}
