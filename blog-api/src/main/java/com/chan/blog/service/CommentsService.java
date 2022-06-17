package com.chan.blog.service;

import com.chan.blog.vo.Result;
import com.chan.blog.vo.params.CommentParam;

public interface CommentsService {
    Result commentsByArticleId(Long articleId);

    Result comment(CommentParam commentParam);
}
