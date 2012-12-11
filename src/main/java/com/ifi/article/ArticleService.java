package com.ifi.article;

import java.util.List;

import javax.jws.WebService;

import com.ifi.bo.Article;

@WebService
public interface ArticleService {
	
	public List<ExternelArticleService> getArticleServices();

	public void publierArticle(Article a);

	public List<Article> listerArticles();
	
	public Article getArticle(String id);

}
