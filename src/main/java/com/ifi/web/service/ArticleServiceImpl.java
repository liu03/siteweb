package com.ifi.web.service;

import java.util.ArrayList;
import java.util.List;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifi.bo.Article;
import com.ifi.bo.Personne;
import com.ifi.dao.ArticleDao;
import com.ifi.article.ArticleService;
import com.ifi.article.ExternelArticleService;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	private ArticleDao articleDao;

	private List<ExternelArticleService> services = new ArrayList<ExternelArticleService>() ;

	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	private Topic topic;

	public void publierArticle(final Article article) {
		this.articleDao.save(article);
		// web service
		for(ExternelArticleService s: services)
			s.publierArticle(article);
		// publication JMS
		/*this.jmsTemplate.send(this.topic, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createObjectMessage(article);
			}
		});*/
	}

	public Article getArticle(String id) {
		return this.articleDao.findArticle(Long.parseLong(id));
	}

	@Override
	public List<ExternelArticleService> getArticleServices() {
		// TODO Auto-generated method stub
		return services;
	}

	@Override
	public List<Article> listerArticles() {
		// TODO Auto-generated method stub
		return this.articleDao.findAllArticles();
	}

}
