package com.example.paopaoback.service;

import com.example.paopaoback.model.VO.TeamUserVO;
import com.example.paopaoback.model.domain.Team;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.paopaoback.model.domain.User;
import com.example.paopaoback.model.dto.TeamQuery;
import com.example.paopaoback.model.request.TeamJoinRequest;
import com.example.paopaoback.model.request.TeamQuitRequest;
import com.example.paopaoback.model.request.TeamUpdateRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author yyl
* @description 针对表【team(队伍)】的数据库操作Service
* @createDate 2024-10-28 21:10:55
*/
public interface TeamService extends IService<Team> {
    /**
     * 创建队伍
     * @param team
     * @param loginUser
     * @return
     */
    long addTeam(Team team, User loginUser);

    /**
     * 搜素队伍
     * @param teamQuery
     * * @param isAdmin
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin, HttpServletRequest request);

    /**
     * 更新队伍
     * @param teamUpdateRequest
     * @return
     */
    boolean updateTeam(TeamUpdateRequest teamUpdateRequest,User loginUser);

    /**
     * 加入队伍
     *
     * @param teamJoinRequest
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);

    /**
     * 退出队伍
     *
     * @param teamQuitRequest
     * @param loginUser
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);


    /**
     * 删除（解散）队伍
     *
     * @param id
     * @param loginUser
     * @return
     */
    boolean deleteTeam(Long id, User loginUser);
}
