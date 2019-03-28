package com.example.learningservice.vo;

import com.example.learningservice.model.Answer;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @CLassName QuestionVo
 * @Description TODO
 * @Author sunying4
 * @Date 2019/3/14 16:45
 * @Version 1.0
 */
@Data
@Accessors(chain = true)
public class QuestionVo {

    private Long id;

    /**
     * 问题简述
     */
    private String questionDesc;

    /**
     * 科目
     */
    private Long subjectId;

    /**
     * 题干内容
     */
    private String questionContent;

    private List<Answer> answers;

}
