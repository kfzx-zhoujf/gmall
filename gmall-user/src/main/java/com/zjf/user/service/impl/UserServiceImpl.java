package com.zjf.user.service.impl;

import com.zjf.user.bean.UmsMember;
import com.zjf.user.mapper.UserMapper;
import com.zjf.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zjf
 * @create 2020/2/1-9:25
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList = userMapper.selectAllUser();
        return umsMemberList;
    }
}
