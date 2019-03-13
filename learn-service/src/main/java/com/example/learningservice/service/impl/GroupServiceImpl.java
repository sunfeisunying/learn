package com.example.learningservice.service.impl;

import com.example.learningservice.mapper.GroupMapper;
import com.example.learningservice.model.Group;
import com.example.learningservice.service.IGroupService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
