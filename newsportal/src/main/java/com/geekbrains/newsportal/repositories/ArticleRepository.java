package com.geekbrains.newsportal.repositories;

import com.geekbrains.newsportal.entities.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
}
