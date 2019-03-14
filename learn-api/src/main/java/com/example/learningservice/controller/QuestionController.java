package com.example.learningservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.example.learningservice.model.Question;
import com.example.learningservice.service.IQuestionService;
import com.example.learningservice.vo.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collection;

/**
 * <p>
 * 问题表 前端控制器
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
@RestController
@RequestMapping("/record/question")
public class QuestionController {

    @Autowired
    private IQuestionService questionService;

    //根据ids查询题目
    @RequestMapping(value = "" , method = RequestMethod.GET)
    public Result findQuestionByIds(@PathVariable String ids){
        final String[] split = StringUtils.split(ids, ",");

        QueryWrapper<Question> queryWrapper = new QueryWrapper<>();
        final Collection<Question> questions = questionService.listByIds(Arrays.asList(split));

        return Result.ok(questions);

    }


    //根据id查询题目和答案结果集
    @RequestMapping(value = "" , method = RequestMethod.GET)
    public Result findQuestionById(@PathVariable Integer id){

        return Result.ok();

    }


//    批量录入题目（不急）


}

