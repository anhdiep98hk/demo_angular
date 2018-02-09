package com.diep.demoangular.dao;

import java.util.List;

import com.diep.demoangular.entity.Article;

public interface IArticleDAO {
	List<Article> getAllArticle();
	Article getArticleById(int articleId);
	void createArticle(Article article);
	void deleteArticle(int articleId);
	void updateArticle(Article article);
	boolean articleExists(String title, String category);
}
