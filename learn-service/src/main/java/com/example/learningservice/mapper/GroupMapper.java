package com.example.learningservice.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.learningservice.model.Group;
import com.example.learningservice.vo.GroupVo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 题目组 Mapper 接口
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
//@Repository
@Mapper
public interface GroupMapper extends BaseMapper<Group> {

    List<GroupVo> selectGroupList(Integer parentId);

}
