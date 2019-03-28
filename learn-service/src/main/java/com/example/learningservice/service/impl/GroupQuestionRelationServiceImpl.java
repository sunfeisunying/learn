package com.example.learningservice.service.impl;

import com.example.learningservice.mapper.GroupQuestionRelationMapper;
import com.example.learningservice.model.GroupQuestionRelation;
import com.example.learningservice.service.IGroupQuestionRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 题目分组（科目）关系表 服务实现类
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
@Service
@Transactional
public class GroupQuestionRelationServiceImpl extends ServiceImpl<GroupQuestionRelationMapper, GroupQuestionRelation> implements IGroupQuestionRelationService {

}
