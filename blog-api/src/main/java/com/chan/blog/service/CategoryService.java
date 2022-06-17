package com.chan.blog.service;

import com.chan.blog.vo.CategoryVo;
import com.chan.blog.vo.Result;

import java.util.List;

public interface CategoryService {
    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDatail();

    Result CategoryDatailById(Long id);
}
