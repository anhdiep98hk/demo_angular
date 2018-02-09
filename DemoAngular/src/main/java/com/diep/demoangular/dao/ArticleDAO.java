package com.diep.demoangular.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.diep.demoangular.entity.Article;


@Transactional
@Repository
public class ArticleDAO implements IArticleDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Article> getAllArticle() {
		String hql = "FROM Article";
		return (List<Article>)entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Article getArticleById(int articleId) {
		// TODO Auto-generated method stub
		return entityManager.find(Article.class, articleId);
	}

	@Override
	public void createArticle(Article article) {
		// TODO Auto-generated method stub
		entityManager.persist(article);
	}

	@Override
	public void deleteArticle(int articleId) {
		// TODO Auto-generated method stub
		entityManager.remove(getArticleById(articleId));		
	}

	@Override
	public void updateArticle(Article article) {
		// TODO Auto-generated method stub
		Article art = getArticleById(article.getArticleId());
		art.setTitle(article.getTitle());
		art.setCategory(article.getCategory());
		entityManager.flush();
	}

	@Override
	public boolean articleExists(String title, String category) {
		String hql = "FROM Article WHERE title=? and category = ?";
		int count = entityManager.createQuery(hql).setParameter(1, title).setParameter(2, category).getResultList().size();
				
		return count > 0 ? true : false;
	}

}
