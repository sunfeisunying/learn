package com.example.learningservice.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.example.learningservice.model.Answer;
import com.baomidou.mybatisplus.extension.service.IService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>
 * 答案选项表 服务类
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
public interface IAnswerService extends IService<Answer> {


    //正确答案用标识字段 根据问题id查一个问题的所有答案


    //批量录入答案接口


}
