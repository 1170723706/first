package com.jk.controller;

import com.jk.bean.Tree;
import com.jk.service.TreeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: first
 * @description:
 * @author: Mr.Xue
 * @create: 2019-01-12 11:02
 **/
@Controller
@RequestMapping("tree")
public class TreeController {

    @Resource
    TreeService treeService;

    @ResponseBody
    @RequestMapping("getTree")
    public List<Tree> getTree() {
        List<Tree> list = treeService.getTree();
        return list;
    }
}
