package com.example.pagehelper.mapper;

import com.example.pagehelper.entity.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface peopleMapper {
    //查询所有
    @Select("select * from people")
    List<People> selectAll();
}
