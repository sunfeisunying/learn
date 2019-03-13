package com.example.learningservice.service.impl;

import com.example.learningservice.mapper.QuestionMapper;
import com.example.learningservice.model.Question;
import com.example.learningservice.service.IQuestionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 问题表 服务实现类
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements IQuestionService {

}
