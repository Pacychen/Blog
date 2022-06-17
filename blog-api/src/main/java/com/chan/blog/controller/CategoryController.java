package com.chan.blog.controller;

import com.chan.blog.service.CategoryService;
import com.chan.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categorys")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public Result listCategory(){
        return categoryService.findAll();
    }


    @GetMapping("detail")
    public Result findAllCategoryDatail(){
        return categoryService.findAllDatail();
    }

    @GetMapping("detail/{id}")
    public Result CategoryDatailById(@PathVariable("id") Long id){
        return categoryService.CategoryDatailById(id);
    }
}
