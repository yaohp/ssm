package com.demo.service.impl;

import com.demo.dao.UserMapper;
import com.demo.po.User;
import com.demo.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 姚贺鹏
 * @company 广州市初放网络科技有限公司
 * @ClassName UserServiceImpl
 * @Description
 * @date 2017/5/22 0022下午 12:29
 * @Copyright (c) 2017, yaohepeng@chufanginc.com All Rights Reserved.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;

    public User getUserById(int userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }
}
