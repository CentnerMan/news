package com.geekbrains.newsportal.services;

import com.geekbrains.newsportal.entities.Article;
import com.geekbrains.newsportal.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    private ArticleRepository articleRepository;

    @Autowired
    public void setArticleRepository(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> findAllArticles() {
        return (List<Article>) articleRepository.findAll();
    }
}
