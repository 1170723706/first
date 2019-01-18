package com.jk.service.impl;

import com.jk.bean.Tree;
import com.jk.mapper.TreeMapper;
import com.jk.service.TreeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: first
 * @description:
 * @author: Mr.Xue
 * @create: 2019-01-12 11:00
 **/
@Service
public class TreeServiceImpl implements TreeService {

    @Resource
    TreeMapper treeMapper;

    @Override
    public List<Tree> getTree() {
        List<Tree> list = treeMapper.getTree(0);
        getAllTree(list);
        return list;
    }

    private void getAllTree(List<Tree> list) {
        for (Tree permission : list) {
            List<Tree> date = treeMapper.getTree(permission.getId());
            getAllTree(date);
            permission.setNodes(date);
        }
    }
}
