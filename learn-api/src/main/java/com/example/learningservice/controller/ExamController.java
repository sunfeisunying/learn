package com.example.learningservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.learningservice.model.Answer;
import com.example.learningservice.model.Exam;
import com.example.learningservice.service.IExamService;
import com.example.learningservice.vo.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * <p>
 * 考试（学习）信息记录表 前端控制器
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
@RestController
@RequestMapping("/record/exam")
public class ExamController {

    @Autowired
    private IExamService examService ;

    //写入考试记录表（每次创建考试之后触发）
    @RequestMapping(value = "" , method = RequestMethod.POST)
    public Result createExam(@RequestBody Exam exam){
        final boolean save = examService.save(exam);
        if(save){
            return Result.ok();
        }else {
            return  Result.fail();
        }
    }

    //查询单条
    @RequestMapping(value = "" , method = RequestMethod.GET)
    public Result<Exam> findExamById(@PathVariable Integer id){
        final Exam exam = examService.getById(id);
            return Result.ok(exam);
    }

    //查询批量
    @RequestMapping(value = "" , method = RequestMethod.GET)
    public Result<List<Exam>> findExamList(){
        QueryWrapper<Exam> queryWrapper = new QueryWrapper<>();
        final List<Exam> list = examService.list(queryWrapper);
        return Result.ok(list);
    }

}

