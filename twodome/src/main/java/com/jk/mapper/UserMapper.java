package com.jk.mapper;

import com.jk.bean.Commodity;
import com.jk.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select(" select * from  user where  id = #{id} ")
    User loginById(Integer id);

    void addUser(User user);

    void delUser(@Param("ids") String ids);

    void updUser(User user);

    @Select(" select * from commodity ")
    List<Commodity> getCommodity();

    void del(@Param("ids") String ids);

    void addQwe(Commodity commodity);

    Commodity queryCom(String id);
}
