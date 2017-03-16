package xz.example.webapp.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import xz.example.webapp.model.Article;
import xz.example.webapp.service.ArticleService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ochmut on 03.03.2017.
 */
public class ArticleController implements Controller {

    private ArticleService articleService;

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        String id = httpServletRequest.getParameter("id");

        Article article = articleService.getById(Long.valueOf(id));
        httpServletRequest.setAttribute("test", "test");
        ModelAndView modelAndView = new ModelAndView("article.jsp");
        modelAndView.addObject("article", article);
        return modelAndView;
    }

    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }
}
