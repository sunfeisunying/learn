package com.example.learningservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.learningservice.model.GroupQuestionRelation;
import com.example.learningservice.service.IGroupQuestionRelationService;
import com.example.learningservice.vo.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 题目分组（科目）关系表 前端控制器
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
@RestController
@RequestMapping("/learn/groupQuestionRelation")
public class GroupQuestionRelationController {

    @Autowired
    private IGroupQuestionRelationService groupQuestionRelationService;

//    入错题库（组）接口
    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public Result createRelation(@RequestBody GroupQuestionRelation groupQuestionRelation){
        final boolean save = groupQuestionRelationService.save(groupQuestionRelation);
        if(save){
            return Result.ok();
        }else {
            return Result.fail();
        }
    }



//    按组（科目、考试）查询题目接口
/*
    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public Result createRelation(@PathVariable Integer classifyId, @PathVariable Integer type){
        QueryWrapper<GroupQuestionRelation> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("classifyId", classifyId);
        queryWrapper.eq("type", type);
        final List<GroupQuestionRelation> list = groupQuestionRelationService.list(queryWrapper);
        return Result.ok(list);
    }
*/




}

