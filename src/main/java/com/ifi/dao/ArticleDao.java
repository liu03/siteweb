package com.ifi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.ifi.bo.Article;

/**
 * @question 2.3
 */
@Repository
public class ArticleDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void save(Article Article) {
		this.entityManager.persist(Article);
	}

	public List<Article> findAllArticles() {
		return this.entityManager.createQuery("SELECT o FROM Article o", Article.class).getResultList();
	}

	public Article findArticle(Long id) {
		return this.entityManager.find(Article.class, id);
	}
}
