package com.atelier.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atelier.demo.model.Article;

public interface ArticleRepository extends JpaRepository<Article,Long>{

}
