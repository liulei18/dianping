package com.imooc.dianping.service.impl;

import com.imooc.dianping.dal.UserModelMapper;
import com.imooc.dianping.model.UserModel;
import com.imooc.dianping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: liulei18
 * @date: 2021/3/25 12:34 AM
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserModelMapper userModelMapper;

    @Override
    public UserModel getUser(Long id) {
        return userModelMapper.selectByPrimaryKey(id);
    }
}
