package com.example.paopaoback.model.request;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户退出队伍请求体
 *
 */
@Data
public class TeamQuitRequest implements Serializable {


    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * id
     */
    @JsonSerialize(using= ToStringSerializer.class)
    private Long teamId;

}
