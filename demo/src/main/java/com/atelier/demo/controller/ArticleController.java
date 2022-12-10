package com.atelier.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atelier.demo.model.Article;
import com.atelier.demo.service.ArticleService;

@RestController
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	
	@GetMapping("/article/")
	public List<Article> read(){
		return articleService.read();
	}
	
	@PostMapping("/article/create")
	public Article create(@RequestBody Article article){
		return articleService.create(article);
	}
	
}
