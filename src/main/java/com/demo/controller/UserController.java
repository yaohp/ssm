package com.demo.controller;

import com.demo.po.User;
import com.demo.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author 姚贺鹏
 * @company 广州市初放网络科技有限公司
 * @ClassName UserController
 * @Description
 * @date 2017/5/22 0022下午 4:52
 * @Copyright (c) 2017, yaohepeng@chufanginc.com All Rights Reserved.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
}
