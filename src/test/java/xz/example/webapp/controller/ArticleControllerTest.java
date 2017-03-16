package xz.example.webapp.controller;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by ochmut on 03.03.2017.
 */
public class ArticleControllerTest {

    @Test
    public void testHandleRequest() throws Exception {
        ArticleController articleController = new ArticleController();
        ModelAndView modelAndView = articleController.handleRequest(null, null);
        assertThat(modelAndView).isNotNull();
        assertThat(modelAndView.getViewName()).isEqualTo("article.jsp");
        Map<String, Object> model = modelAndView.getModel();
        assertThat(model).isNotNull();
        assertThat(model).containsKey("name");
    }

}