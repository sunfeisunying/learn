package com.example.learningservice.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.learningservice.model.Group;
import com.example.learningservice.service.IGroupService;
import com.example.learningservice.vo.GroupVo;
import com.example.learningservice.vo.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 题目组 前端控制器
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
@RestController
@RequestMapping("/record/group")
public class GroupController {

    @Autowired
    private IGroupService groupService;

    //查询组列表接口

    @RequestMapping(value = "/{parentId}", method = RequestMethod.GET)
    public Result<List<Group>> findGroupList(@PathVariable Integer parentId){
        QueryWrapper<Group> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("parentId", parentId);
//        final List<GroupVo> groupVos = groupService.groupList(parentId);
        final List<Group> list = groupService.list(queryWrapper);
        return Result.ok(list);
    }

//    批量录入组信息接口（不急）


}

