package com.chan.blog.controller;

import com.chan.blog.service.TagService;
import com.chan.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tags")
public class TagsController {
    @Autowired
    private TagService  tagService;

    @GetMapping("hot")
    public Result hot(){
        int limit = 6;
        return tagService.hots(limit);
    }

    @GetMapping
    public Result findAllTags(){
        return tagService.findAllTags();
    }

    @GetMapping("detail")
    public Result findAllTagsDetail(){
        return tagService.findAllTagsDetail();
    }

    @GetMapping("detail/{id}")
    public Result findTagsDetailById(@PathVariable("id")Long id){
        return tagService.findTagsDetailById(id);
    }
}
