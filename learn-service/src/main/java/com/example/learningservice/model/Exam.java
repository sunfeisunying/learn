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
 * 考试（学习）信息记录表
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Exam extends Model<Exam> {

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
     * 考试类型 0：模拟，1：学习，2：游戏
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
