package com.example.paopaoback.model.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * 用户队伍关系
 * @TableName user_team
 */
@Data
public class UserTeam implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 用户id
     */
    @TableField("userId")
    private Long userId;

    /**
     * 队伍id
     */
    @TableField("teamId")
    private Long teamId;

    /**
     * 加入时间
     */
    @TableField("joinTime")
    private Date joinTime;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private Date createTime;

    /**
     * 
     */
    @TableField("updateTime")
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableField("isDelete")
    private Integer isDelete;

    private static final long serialVersionUID = 1L;
}