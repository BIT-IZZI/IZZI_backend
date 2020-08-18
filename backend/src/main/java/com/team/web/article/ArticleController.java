package com.team.web.article;

import com.team.web.common.Box;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/articles")
@AllArgsConstructor

public class ArticleController {
    private final ArticleService articleService;
    static Logger logger = LoggerFactory.getLogger(ArticleController.class);
   @Autowired Box box;

    @PostMapping("createUsed")
    public ResponseEntity<Article> createUsed(@RequestBody Article article){
        System.out.println("자바확인"+ article);
        Optional<Article> createUsed= articleService.createUsed(article);
        if(createUsed.isPresent()){
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/list")
    public Map<?,?> getAll(){
        Iterable<Article> articlesList= articleService.findAll();
        box.put("list",articlesList);
        return box.get();
    }
}
