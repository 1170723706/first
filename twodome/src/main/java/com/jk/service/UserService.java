package com.jk.service;

import com.jk.bean.Commodity;
import com.jk.bean.ReceivePage;
import com.jk.bean.SendPage;
import com.jk.bean.User;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: Mr.Xue
 * @Date: 2019/1/11
 */
public interface UserService {

    User loginById(User user);

    void addUser(User user);

    void delUser(String ids);

    void updUser(User user);

    SendPage getCommodity(ReceivePage receivePage);

    void del(String ids);

    void addQwe(Commodity commodity);

    Commodity queryCom(String id);
}
