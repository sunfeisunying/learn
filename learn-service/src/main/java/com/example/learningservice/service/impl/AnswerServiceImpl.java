package com.example.learningservice.service.impl;

import com.example.learningservice.mapper.AnswerMapper;
import com.example.learningservice.model.Answer;
import com.example.learningservice.service.IAnswerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 答案选项表 服务实现类
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
@Service
public class AnswerServiceImpl extends ServiceImpl<AnswerMapper, Answer> implements IAnswerService {

}
