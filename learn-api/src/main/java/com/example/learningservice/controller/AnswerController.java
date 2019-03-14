package com.example.learningservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.learningservice.model.Answer;
import com.example.learningservice.service.IAnswerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 答案选项表 前端控制器
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
@RestController
@RequestMapping("/record/answer")
public class AnswerController {

    @Autowired
    private IAnswerService answerService ;



    //正确答案用标识字段 根据问题id查一个问题的所有答案
    @RequestMapping(value = "" , method = RequestMethod.GET)
    public List<Answer> findAswersByQid(Integer id ){
        QueryWrapper<Answer> queryWrapper = new QueryWrapper<>();
        queryWrapper
                .eq("questionId",id);
        return answerService.list(queryWrapper);

    }


    //批量录入答案接口

}

