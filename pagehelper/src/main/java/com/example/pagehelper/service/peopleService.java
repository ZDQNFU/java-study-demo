package com.example.pagehelper.service;

import com.example.pagehelper.entity.People;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface peopleService {
    //查询所有
    PageInfo selectAll(int pageNum, int pageSize);
}
