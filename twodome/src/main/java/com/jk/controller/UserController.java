package com.jk.controller;

import com.jk.bean.Commodity;
import com.jk.bean.ReceivePage;
import com.jk.bean.SendPage;
import com.jk.bean.User;
import com.jk.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @program: first
 * @description:
 * @author: Mr.Xue
 * @create: 2019-01-11 16:35
 **/
@Controller
@RequestMapping("login")
public class UserController {
    @Resource
    UserService userService;

    @ResponseBody
    @RequestMapping("loginById")
    public User loginById(User user) {
        User as = userService.loginById(user);
        System.out.println(as);
        return as;
    }

    @ResponseBody
    @RequestMapping("addUser")
    public String addUser(User user) {
        userService.addUser(user);
        return "";
    }

    @ResponseBody
    @RequestMapping("delUser")
    public String delUser(String ids) {
        userService.delUser(ids);
        return "";
    }

    @ResponseBody
    @RequestMapping("updUser")
    public String updUser(User user) {
        userService.updUser(user);
        return "";
    }

    @ResponseBody
    @RequestMapping("getCommodity")
    public SendPage getCommodity(ReceivePage receivePage) {
        SendPage as = userService.getCommodity(receivePage);
        return as;
    }
    @ResponseBody
    @RequestMapping("del")
    public String del(String ids){
        userService.del(ids);
        return "";
    }
    @ResponseBody
    @RequestMapping("addQwe")
    public String addQwe(Commodity commodity){
        userService.addQwe(commodity);
        return "";
    }
    @ResponseBody
    @RequestMapping("queryCom")
    public Commodity queryCom(String id){
        Commodity com =  userService.queryCom(id);
        return com;
    }

    @RequestMapping("show")
    public String show() {
        return "show";
    }

    @RequestMapping("asd")
    public String asd() {
        return "asd";
    }

    @RequestMapping("add")
    public String add() {
        return "add";
    }
}
