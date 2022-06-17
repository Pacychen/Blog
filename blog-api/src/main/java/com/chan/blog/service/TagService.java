package com.chan.blog.service;

import com.chan.blog.vo.Result;
import com.chan.blog.vo.TagVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface TagService {

    List<TagVo> findTagsByArticleId(Long articleId);

    Result hots(int limit);

    Result findAllTags();

    Result findAllTagsDetail();

    Result findTagsDetailById(Long id);
}
