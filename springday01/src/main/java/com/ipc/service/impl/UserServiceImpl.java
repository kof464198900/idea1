package com.ipc.service.impl;

import com.ipc.service.UserService;
import com.ipc.dao.userdao;

public class UserServiceImpl implements UserService {

    private userdao us;

    public void setUs(userdao us) {
        this.us = us;
    }

    @Override
    public void show() {
        us.ms();


    }
}
