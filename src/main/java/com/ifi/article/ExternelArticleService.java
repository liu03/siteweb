package com.ifi.article;

import java.util.List;

import javax.jws.WebService;

import com.ifi.bo.Article;

@WebService
public interface ExternelArticleService {

	public void publierArticle(Article a);

}
