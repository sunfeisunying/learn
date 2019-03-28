package com.example.learningservice.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.learningservice.model.Exam;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 考试（学习）信息记录表 Mapper 接口
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
//@Repository
@Mapper
public interface ExamMapper extends BaseMapper<Exam> {

}
