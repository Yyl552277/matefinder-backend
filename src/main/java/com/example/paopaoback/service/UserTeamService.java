package com.example.paopaoback.service;

import com.example.paopaoback.model.domain.UserTeam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author yyl
* @description 针对表【user_team(用户队伍关系)】的数据库操作Service
* @createDate 2024-10-28 21:11:07
*/
public interface UserTeamService extends IService<UserTeam> {

    /**
     *
     * 查询队伍中已有人数
     * @param userTeam
     * @return
     *
     */
    int listUser(UserTeam userTeam);

    //计算teamId查询该队伍下人数数量
    int countUser(UserTeam userTeam);

    //根据teamId和userId查询是否已经加入
    int hasJoining(UserTeam userTeam);

}
