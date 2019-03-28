package com.example.learningservice.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 题目组
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Group extends Model<Group> {

    private static final long serialVersionUID = 1L;

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

        /**
     * 是否删除 0：未删除、1：已删除
     */
         private Integer isDelete;

        /**
     * 备注
     */
         private String remark;

        /**
     * 创建人
     */
         private Long creator;

        /**
     * 修改人
     */
         private Long updateby;

        /**
     * 创建时间
     */
         private LocalDateTime createdTime;

        /**
     * 更新时间
     */
         private LocalDateTime updateTime;





    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
