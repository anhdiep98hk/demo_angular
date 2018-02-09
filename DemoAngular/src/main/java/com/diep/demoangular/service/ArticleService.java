package com.diep.demoangular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diep.demoangular.dao.IArticleDAO;
import com.diep.demoangular.entity.Article;

@Service
public class ArticleService implements IArticleService{

	@Autowired
	private IArticleDAO articleDAO;
	
	@Override
	public List<Article> getAllArticles() {
		// TODO Auto-generated method stub
		return articleDAO.getAllArticle();
	}

	@Override
	public Article getArticleById(int articleId) {
		Article obj = articleDAO.getArticleById(articleId);
		return obj;
	}

	@Override
	public synchronized boolean createArticle(Article article) {
		if(articleDAO.articleExists(article.getTitle(), article.getCategory())) {
			return false;
		}else {
			articleDAO.createArticle(article);
			return true;
		}
	}

	@Override
	public void updateArticle(Article article) {
		// TODO Auto-generated method stub
		articleDAO.updateArticle(article);
	}

	@Override
	public void deleteArticle(int articleId) {
		// TODO Auto-generated method stub
		articleDAO.deleteArticle(articleId);
	}

}
