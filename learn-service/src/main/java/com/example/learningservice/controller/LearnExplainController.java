package com.example.learningservice.controller;


import com.example.learningservice.model.LearnExplain;
import com.example.learningservice.service.ILearnExplainService;
import com.example.learningservice.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 答案解析表 前端控制器
 * </p>
 *
 * @author SunYing
 * @since 2019-03-31
 */
@RestController
@RequestMapping("/learn/learnExplain")
public class LearnExplainController {

    @Autowired
    ILearnExplainService learnExplainService;

    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public Result createQuestion(@RequestBody LearnExplain learnExplain){

        final boolean save = learnExplainService.save(learnExplain);
        if(save){
            return Result.ok();
        }else {
            return  Result.fail();
        }
    }

}

