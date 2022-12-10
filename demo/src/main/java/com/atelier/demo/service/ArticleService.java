package com.atelier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atelier.demo.model.Article;
import com.atelier.demo.repository.ArticleRepository;

@Service
public class ArticleService {

	@Autowired
	private ArticleRepository articleRepository;
	
	
	public List<Article> read(){
		return articleRepository.findAll();
	}
	
	public Article create(Article article) {
		return articleRepository.save(article);
	}
	
	public String delete(Long id) {
		articleRepository.deleteById(id);
		return "Article supprimé !";
	}
}
