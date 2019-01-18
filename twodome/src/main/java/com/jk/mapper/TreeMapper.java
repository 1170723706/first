package com.jk.mapper;

import com.jk.bean.Tree;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TreeMapper {

    @Select(" select t.*,url href from tree t where pid = #{pid} ")
    List<Tree> getTree(@Param("pid") int i);

}
