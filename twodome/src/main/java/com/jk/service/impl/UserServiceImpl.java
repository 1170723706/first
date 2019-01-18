package com.jk.service.impl;

import com.github.pagehelper.PageHelper;
import com.jk.bean.Commodity;
import com.jk.bean.ReceivePage;
import com.jk.bean.SendPage;
import com.jk.bean.User;
import com.jk.mapper.UserMapper;
import com.jk.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: first
 * @description:
 * @author: Mr.Xue
 * @create: 2019-01-11 16:36
 **/

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User loginById(User user) {
        User asd = userMapper.loginById(user.getId());
        return asd;

    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void delUser(String ids) {
        userMapper.delUser(ids);
    }

    @Override
    public void updUser(User user) {
        userMapper.updUser(user);
    }

    @Override
    public SendPage getCommodity(ReceivePage receivePage) {
        List<Commodity> list = userMapper.getCommodity();
        PageHelper.startPage(receivePage.getPage(), receivePage.getRows());
        List<Commodity> data = userMapper.getCommodity();
        SendPage sd = new SendPage(list.size(), data);
        return sd;
    }

    @Override
    public void del(String ids) {
        userMapper.del(ids);
    }

    @Override
    public void addQwe(Commodity commodity) {
        userMapper.addQwe(commodity);
    }

    @Override
    public Commodity queryCom(String id) {
        Commodity as = userMapper.queryCom(id);
        return as;
    }
}
