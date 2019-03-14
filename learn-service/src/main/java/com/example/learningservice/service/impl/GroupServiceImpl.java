package com.example.learningservice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.learningservice.mapper.GroupMapper;
import com.example.learningservice.model.Group;
import com.example.learningservice.service.IGroupService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.learningservice.vo.GroupVo;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 题目组 服务实现类
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
@Service
public class GroupServiceImpl extends ServiceImpl<GroupMapper, Group> implements IGroupService {

    @Override
    public List<GroupVo> groupList(Integer parentId) {

        final List<GroupVo> groups = baseMapper.selectGroupList(parentId);

        return null;
    }
}
