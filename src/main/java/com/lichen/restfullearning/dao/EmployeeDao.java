package com.lichen.restfullearning.dao;

import com.lichen.restfullearning.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmployeeDao {
    // Search employee by id
    Employee searchById(@Param("id") Integer id);
}
