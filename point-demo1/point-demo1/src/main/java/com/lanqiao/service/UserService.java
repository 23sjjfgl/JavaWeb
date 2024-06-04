package com.lanqiao.service;

import com.lanqiao.pojo.User;


public interface UserService {

    User UserSelect(String username, String password);

}
