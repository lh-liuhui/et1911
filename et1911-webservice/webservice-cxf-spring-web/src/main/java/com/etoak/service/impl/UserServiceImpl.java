package com.etoak.service.impl;

import com.etoak.bean.User;
import com.etoak.service.UserService;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

@WebService
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getById(int id) {
        return new User(id,"et1911",20);
    }
}
