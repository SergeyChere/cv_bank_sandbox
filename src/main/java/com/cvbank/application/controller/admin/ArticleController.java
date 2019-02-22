package com.cvbank.application.controller.admin;

import com.cvbank.application.enteties.admin.ArticleEntety;

public interface ArticleController {
	
	public boolean createArticle(ArticleEntety article);
	public boolean updateArticle(ArticleEntety article);
	public boolean deleteArticle(int id);
}