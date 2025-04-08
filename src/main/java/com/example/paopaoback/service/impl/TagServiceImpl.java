package com.example.paopaoback.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.paopaoback.model.domain.Tag;
import com.example.paopaoback.mapper.TagMapper;
import com.example.paopaoback.service.TagService;
import org.springframework.stereotype.Service;

/**
* @author yyl
* @description 针对表【tag(标签)】的数据库操作Service实现
* @createDate 2024-10-28 21:10:45
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService {

}




