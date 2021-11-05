package codegym.service;

import codegym.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> showAll();
    Blog findById(int id);
    void save(Blog blog);
    void update(Blog blog);
    void delete(Blog blog);
}
