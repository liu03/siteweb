package com.ifi.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ifi.bo.Article;
import com.ifi.article.ArticleService;

@Controller
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	@RequestMapping(value = "/publier", method = RequestMethod.POST)
	public String create(Article article, String numeroCarte) {
		this.articleService.publierArticle(article);
		return "redirect:/Articles/" + article.getId().toString();
	}
	
	@RequestMapping("/publier")
	public String commander(Model model) {
		Article newArticle = new Article();
		model.addAttribute("article", newArticle);
		return "commandes/create";
	}

	@RequestMapping("/articles")
	public String list(Model model) {
		model.addAttribute("Articles", this.articleService.listerArticles());
		return "Articles/list";
	}

	@RequestMapping("/articles/{id}")
	public String list(@PathVariable String id, Model model) {
		model.addAttribute("Article", this.articleService.getArticle(id));
		return "Articles/view";
	}

}
