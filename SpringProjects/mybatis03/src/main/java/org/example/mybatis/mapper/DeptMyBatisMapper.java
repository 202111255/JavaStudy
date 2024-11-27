package org.example.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

import javax.management.MXBean;

@Mapper
public interface DeptMyBatisMapper {
    String select();
}
