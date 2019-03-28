package com.example.learningservice.mapper;

import com.example.learningservice.model.Answer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 答案选项表 Mapper 接口
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
@Repository(value ="answerMapper")
public interface AnswerMapper extends BaseMapper<Answer> {

}
