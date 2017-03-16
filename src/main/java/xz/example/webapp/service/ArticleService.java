package xz.example.webapp.service;

import xz.example.webapp.model.Article;

import java.util.List;

/**
 * Created by ochmut on 03.03.2017.
 */
public interface ArticleService {

    Article getById(Long id);
    List<Article> getAll();
}
