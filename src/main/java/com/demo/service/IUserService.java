package com.demo.service;

import com.demo.po.User;

/**
 * @author 姚贺鹏
 * @company 广州市初放网络科技有限公司
 * @ClassName IUserService
 * @Description
 * @date 2017/5/22 0022下午 12:28
 * @Copyright (c) 2017, yaohepeng@chufanginc.com All Rights Reserved.
 */
public interface IUserService {
    User getUserById(int userId);
}
