package com.jk.bean;

import lombok.Data;

import java.util.List;

/**
 * @program: first
 * @description:
 * @author: Mr.Xue
 * @create: 2019-01-12 10:27
 **/
@Data
public class Tree {

    Integer id;
    String text;
    Integer pid;
    String href;
    private String icon = "glyphicon glyphicon-flag";
    private String selectedIcon = "glyphicon glyphicon-heart";
    Integer state;

    boolean checked;// boolean 默认值是false

    List<Tree> nodes;
}
