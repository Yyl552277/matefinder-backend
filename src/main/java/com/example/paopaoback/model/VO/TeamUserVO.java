package com.example.paopaoback.model.VO;

import com.example.paopaoback.model.domain.Team;
import  lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 队伍和用户信息封装类（脱敏）
 *

 */
@Data
public class TeamUserVO implements Serializable {

    private static final long serialVersionUID = 1899063007109226944L;

    /**
     * id
     */
    private String id;

    /**
     * 队伍名称
     */
    private String name;


    /**
     * 描述
     */
    private String description;

    /**
     * 最大人数
     */
    private Integer maxNum;

    /**
     * 过期时间
     */
    private Date expireTime;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 0 - 公开，1 - 私有，2 - 加密
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人用户信息
     */
    private UserVO createUser;

    /**
     * 已加入的用户数
     */
    private Integer hasJoinNum;

    /**
     * 是否已加入队伍
     */
    private boolean hasJoin = false;



    public TeamUserVO(Team team) {
        this.id = team.getId().toString();
        this.name = team.getName();
        this.description = team.getDescription();
        this.maxNum = team.getMaxNum();
        this.expireTime = team.getExpireTime();
        this.userId = team.getUserId();
        this.status = team.getStatus();
        this.createTime = team.getCreateTime();
        this.updateTime = team.getUpdateTime();
    }
}
