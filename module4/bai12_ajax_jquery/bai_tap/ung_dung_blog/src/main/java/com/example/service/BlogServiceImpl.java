package com.example.service;

import com.example.model.Blog;
import com.example.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService{

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Blog blog) {
        blogRepository.delete(blog);
    }

    @Override
    public void update(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Page<Blog> findAllByAuthorContainingOrTitleContaining(String author, String tittle, Pageable pageable) {
        return blogRepository.findAllByAuthorContainingOrTitleContaining(author,tittle,pageable);
    }

    @Override
    public List<Blog> findAllByTitleContaining(String keyword) {
        return blogRepository.findAllByTitleContaining(keyword);
    }

    @Override
    public Page<Blog> findAllByCategory(int id, Pageable pageable) {
        return blogRepository.findAllByCategory(id,pageable);
    }
}