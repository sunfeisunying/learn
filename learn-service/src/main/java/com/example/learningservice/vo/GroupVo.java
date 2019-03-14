package com.example.learningservice.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.example.learningservice.model.Group;

/**
 * @CLassName GroupVo
 * @Description TODO
 * @Author sunying4
 * @Date 2019/3/14 14:18
 * @Version 1.0
 */
public class GroupVo {

    /**
     * 组编码
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 父级组编码，0：无父级组
     */
    private Long parentId;

    /**
     * 科目名称
     */
    private String groupName;


    private Group childGroup;
}
