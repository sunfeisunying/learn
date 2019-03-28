package com.example.learningservice.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.example.learningservice.model.Group;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @CLassName GroupVo
 * @Description TODO
 * @Author sunying4
 * @Date 2019/3/14 14:18
 * @Version 1.0
 */
@Data
@Accessors(chain = true)
public class GroupVo {

    /**
     * 组编码
     */
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
