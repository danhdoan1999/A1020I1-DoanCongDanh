package com.example.service;

import com.example.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();
    Blog findById(int id);
    void save(Blog blog);
    void remove(Blog blog);
    void update(Blog blog);
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findAllByAuthorContainingOrTitleContaining(String author , String tittle ,Pageable pageable);
    List<Blog> findAllByTitleContaining(String keyword);
    Page<Blog> findAllByCategory(int id,Pageable pageable);
}
