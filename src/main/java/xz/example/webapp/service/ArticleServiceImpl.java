package xz.example.webapp.service;

import xz.example.webapp.model.Article;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ochmut on 03.03.2017.
 */
public class ArticleServiceImpl implements ArticleService {

    public Article getById(Long id) {
        return new Article("name " + id, "text");
    }

    public List<Article> getAll() {
        return Arrays.asList(getById(1L), getById(2L));
    }
}
