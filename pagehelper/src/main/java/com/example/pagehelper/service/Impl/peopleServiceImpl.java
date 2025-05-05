package com.example.pagehelper.service.Impl;

import com.example.pagehelper.entity.People;
import com.example.pagehelper.mapper.peopleMapper;
import com.example.pagehelper.service.peopleService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class peopleServiceImpl implements peopleService {
    @Autowired
    private com.example.pagehelper.mapper.peopleMapper peopleMapper;

    @Override
    public PageInfo selectAll(int pageNum,int pageSize) {
        //设置分页查询的参数,页码，每页记录数
        PageHelper.startPage(pageNum,pageSize);
        //紧跟查询语句，会被分页
        List<People> peopleList = peopleMapper.selectAll();
        //pageInfo封装了分页的信息，包括总记录数等
        PageInfo page = new PageInfo(peopleList);
        return page;

    }
}
