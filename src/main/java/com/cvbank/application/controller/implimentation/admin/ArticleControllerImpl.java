package com.cvbank.application.controller.implimentation.admin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cvbank.application.controller.admin.ArticleController;
import com.cvbank.application.enteties.admin.ArticleEntety;

public class ArticleControllerImpl implements ArticleController {

	@PostMapping(value="/createArticle")
	public boolean createArticle(@RequestBody ArticleEntety article) {
		return false;
	}
	
	@PostMapping(value="/updateArticle")
	public boolean updateArticle(@RequestBody ArticleEntety article) {
		return false;
	}
	
	@PostMapping(value="/deleteArticle")
	public boolean deleteArticle(@RequestParam(name="id") int id) {
		return false;
	}
}