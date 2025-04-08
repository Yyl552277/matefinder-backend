package com.example.paopaoback.model.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserLoginRequest implements Serializable {


    private static final long serialVersionUID = 2407870575064746186L;

    private String userAccount;

    private String userPassword;

}
