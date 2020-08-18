package com.team.web.article;

import com.team.web.common.JpaService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
interface ArticleService extends JpaService<Article> {
    Optional<Article> createUsed(Article article);

}

@Service
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Optional<Article> createUsed(Article article) {
        Article createUsedArticle = new Article();
        createUsedArticle.setTitle(article.getTitle());
        createUsedArticle.setWriter(article.getWriter());
        createUsedArticle.setAddress(article.getAddress());
        createUsedArticle.setContents(article.getContents());
        System.out.println(createUsedArticle);
        Article usedData= articleRepository.save(createUsedArticle);
        return Optional.of(usedData);
    }

    @Override
    public Iterable<Article> findAll() {
        return articleRepository.findAll();
    }

    @Override
    public Optional<Article> findById(String id) {
        return Optional.empty();
    }
}
