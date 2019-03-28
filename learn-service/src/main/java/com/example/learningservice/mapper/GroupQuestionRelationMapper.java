package com.example.learningservice.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.learningservice.model.GroupQuestionRelation;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 题目分组（科目）关系表 Mapper 接口
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
//@Repository
@Mapper
public interface GroupQuestionRelationMapper extends BaseMapper<GroupQuestionRelation> {

}
