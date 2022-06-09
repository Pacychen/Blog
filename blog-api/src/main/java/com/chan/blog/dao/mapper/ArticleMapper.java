package com.chan.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chan.blog.dao.dos.Archives;
import com.chan.blog.dao.pojo.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ArticleMapper extends BaseMapper<Article> {
    List<Archives> listArchives();
}
