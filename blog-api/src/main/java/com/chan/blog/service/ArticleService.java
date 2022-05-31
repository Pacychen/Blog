package com.chan.blog.service;

import com.chan.blog.vo.Result;
import com.chan.blog.vo.params.PageParams;
import org.springframework.stereotype.Service;


public interface ArticleService {

    Result listArticle(PageParams pageParams);

    Result hotArticle(int limit);

    Result newArticle(int limit);

    Result listArchives();
}
