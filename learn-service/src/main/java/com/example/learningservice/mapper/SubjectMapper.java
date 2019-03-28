package com.example.learningservice.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.learningservice.model.Subject;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 科目菜单表 Mapper 接口
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
//@Repository
@Mapper

public interface SubjectMapper extends BaseMapper<Subject> {

}
