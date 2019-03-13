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
 * 答案选项表
 * </p>
 *
 * @author SunYing
 * @since 2019-02-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Answer extends Model<Answer> {

    private static final long serialVersionUID = 1L;

        /**
     * 答案编码
     */
         @TableId(value = "id", type = IdType.AUTO)
    private Long id;

        /**
     * 问题编码
     */
         private Long questionId;

        /**
     * 答案内容
     */
         private String answerContent;

        /**
     * 是否正确答案 0：错误答案、1：正确答案
     */
         private Integer isRight;

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
