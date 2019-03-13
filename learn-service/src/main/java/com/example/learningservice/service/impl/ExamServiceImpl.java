package com.example.learningservice.service.impl;

import com.example.learningservice.mapper.ExamMapper;
import com.example.learningservice.model.Exam;
import com.example.learningservice.service.IExamService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 考试（学习）信息记录表 服务实现类
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
@Service
public class ExamServiceImpl extends ServiceImpl<ExamMapper, Exam> implements IExamService {

}
