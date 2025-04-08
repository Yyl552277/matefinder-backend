package com.example.paopaoback.mapper;

import com.example.paopaoback.model.domain.UserTeam;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author yyl
* @description 针对表【user_team(用户队伍关系)】的数据库操作Mapper
* @createDate 2024-10-28 21:11:07
* @Entity model.domain.UserTeam
*/
public interface UserTeamMapper extends BaseMapper<UserTeam> {
    // 根据 teamId 查询队伍中已有人数
    int selectCount(UserTeam userTeam);

    //计算userId查询用户已加入队伍数
        int countUser(UserTeam userTeam);
    //
    //    //根据teamId和userId查询是否已经加入队伍
        int hasJoining(UserTeam userTeam);
}




