package com.example.learningservice.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 科目菜单表
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Subject extends Model<Subject> {

    private static final long serialVersionUID = 1L;

        /**
     * 科目编码
     */
         @TableId(value = "id", type = IdType.AUTO)
    private Long id;

        /**
     * 父级科目编码，0：一级科目的父级科目
     */
         private Long parentId;

        /**
     * 科目名称
     */
         private String subjectName;

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
