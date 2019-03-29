package com.example.learningservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.learningservice.model.Question;
import com.example.learningservice.service.IQuestionService;
import com.example.learningservice.vo.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("/learn/question")
public class QuestionController {

    @Autowired
    private IQuestionService questionService;

    //根据ids查询题目
    @RequestMapping(value = "/findQuestionByIds" , method = RequestMethod.GET)
    public Result findQuestionByIds(@PathVariable String ids){
        final String[] split = StringUtils.split(ids, ",");

        QueryWrapper<Question> queryWrapper = new QueryWrapper<>();
        final Collection<Question> questions = questionService.listByIds(Arrays.asList(split));
        return Result.ok(questions);

    }


    //根据id查询题目和答案结果集
    @RequestMapping(value = "/findQuestionById" , method = RequestMethod.GET)
    public Result findQuestionById(@PathVariable Integer id){

        return Result.ok();

    }

//    随机抽取一定数量的题目（有范围）



//    批量录入题目（不急）,配伍选择题添加逻辑要走关系表，查询子题目的
    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public Result createQuestion(@RequestBody Question question){

        final boolean save = questionService.save(question);
        if(save){
            return Result.ok();
        }else {
            return  Result.fail();
        }
    }

}

