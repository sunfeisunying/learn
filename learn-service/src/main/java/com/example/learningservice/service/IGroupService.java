package com.example.learningservice.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.learningservice.model.Group;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.learningservice.vo.GroupVo;

import java.util.List;

/**
 * <p>
 * 题目组 服务类
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
public interface IGroupService extends IService<Group> {

    //查询组列表接口
    List<GroupVo> groupList(Integer parentId);


//    批量录入组信息接口（不急）



}
