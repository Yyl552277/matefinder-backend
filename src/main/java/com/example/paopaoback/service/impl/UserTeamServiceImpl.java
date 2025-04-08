package com.example.paopaoback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.paopaoback.model.domain.UserTeam;
import com.example.paopaoback.mapper.UserTeamMapper;
import com.example.paopaoback.service.UserTeamService;
import org.springframework.stereotype.Service;

/**
* @author yyl
* @description 针对表【user_team(用户队伍关系)】的数据库操作Service实现
* @createDate 2024-10-28 21:11:07
*/
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
    implements UserTeamService {

    @Override
    public int listUser(UserTeam userTeam) {
        return baseMapper.selectCount(userTeam);
    }

    @Override
    public int countUser(UserTeam userTeam) {
        return baseMapper.countUser(userTeam);
    }

    @Override
    public int hasJoining(UserTeam userTeam) {
        return baseMapper.hasJoining(userTeam);
    }
}




