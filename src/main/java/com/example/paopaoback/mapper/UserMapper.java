package com.example.paopaoback.mapper;

import com.example.paopaoback.model.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yyl
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2024-10-28 20:51:19
* @Entity model.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




