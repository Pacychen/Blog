package com.chan.blog.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.chan.blog.dao.mapper.ArticleMapper;
import com.chan.blog.dao.pojo.Article;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class ThreadService {

    @Async("taskExecutor")
    public void updateArticleViewCount(ArticleMapper articleMapper, Article article) {

        Integer viewCounts = article.getViewCounts();
        Article articleUpdateViewCounts = new Article();
        articleUpdateViewCounts.setViewCounts(viewCounts + 1);
        LambdaUpdateWrapper<Article> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.eq(Article::getId,article.getId());
        updateWrapper.eq(Article::getViewCounts,viewCounts);
        articleMapper.update(articleUpdateViewCounts,updateWrapper);
        try {
            Thread.sleep(5000);
            System.out.println("更新完成！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
