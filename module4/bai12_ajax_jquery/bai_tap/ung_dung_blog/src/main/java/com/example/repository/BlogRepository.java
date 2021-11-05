package com.example.repository;

import com.example.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog,Integer> {
    Page<Blog> findAllByAuthorContainingOrTitleContaining(String author , String tittle, Pageable pageable);
    List<Blog> findAllByTitleContaining(String keyword);

    @Query(value="select * from blog join category where blog.category_id = category.id and category.id = :id" , nativeQuery = true)
    Page<Blog> findAllByCategory(@Param("id") int id,Pageable pageable);
}
