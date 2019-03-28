package com.example.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.learningservice.model.Subject;
import com.example.learningservice.service.ISubjectService;
import com.example.learningservice.vo.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 科目菜单表 前端控制器
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
@RestController
@RequestMapping("/record/subject")
public class SubjectController {

    @Autowired
    private ISubjectService subjectService;

//    查询科目列表接口
    @RequestMapping(value = "" , method = RequestMethod.GET)
    public Result findSubjectList(@PathVariable Integer subjectId){
        QueryWrapper<Subject> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("parentId", subjectId);
        final List<Subject> list = subjectService.list(queryWrapper);
        return Result.ok(list);
    }





}

