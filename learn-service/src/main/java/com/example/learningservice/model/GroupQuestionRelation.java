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
 * 题目分组（科目）关系表
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GroupQuestionRelation extends Model<GroupQuestionRelation> {

    private static final long serialVersionUID = 1L;

        /**
     * 关系编码
     */
         @TableId(value = "id", type = IdType.AUTO)
    private Long id;

        /**
     * 题目id
     */
         private Long questionId;

        /**
     * 分类id 群组
     */
         private Long classifyId;

        /**
     * 关系类型 0：群组，1：科目
     */
         private Integer type;

        /**
     * 是否删除 0：未删除、1：已删除
     */
         private Integer isDelete;

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
