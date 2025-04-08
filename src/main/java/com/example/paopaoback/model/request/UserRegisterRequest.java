package com.example.paopaoback.model.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 8139465729176199610L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;


}
