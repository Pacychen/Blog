package com.chan.blog.controller;

import com.chan.blog.common.aop.LogAnnotation;
import com.chan.blog.dao.pojo.Article;
import com.chan.blog.service.ArticleService;
import com.chan.blog.vo.ArticleVo;
import com.chan.blog.vo.Result;
import com.chan.blog.vo.params.ArticleParam;
import com.chan.blog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("articles")
public class ArticleCotroller {

    @Autowired
    private ArticleService articleService;
    /**
     *  首页 文章列表
     * @param pageParams
     * @return
     */
    @PostMapping
    @LogAnnotation(module = "文章",operation = "获取文章列表")
    public Result listArticle(@RequestBody PageParams pageParams){

        return articleService.listArticle(pageParams);

    }

    /**
     * 最热文章
     * @return
     */
    @PostMapping("hot")
    public Result hotArticle(){
        int limit = 5;
        return articleService.hotArticle(limit);
    }

    /**
     * 最新文章
     * @return
     */
    @PostMapping("new")
    public Result newArticle(){
        int limit = 3;
        return  articleService.newArticle(limit);
    }

    /**
     * 文章归档
     * @return
     */
    @PostMapping("listArchives")
    public Result listArchives(){
        return  articleService.listArchives();
    }

    /**
     * 文章详情
     * @param articleId
     * @return
     */
    @PostMapping("view/{id}")
    public Result findArticleById(@PathVariable("id") Long articleId){

        return articleService.findArticleById(articleId);
    }

    @PostMapping("publish")
    public Result publish(@RequestBody ArticleParam articleParam){
        return articleService.publish(articleParam);
    }
}
