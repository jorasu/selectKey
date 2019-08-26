package com.example.selectkey.dao;


import com.example.selectkey.vo.Emp1;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface EmpMapper {
    //1.selectKey的使用
    int add(Emp1 emp1);

    //2.使用select导入信息
    int insert(List<Emp1> list);

    //3.查询所有信息
    List<Emp1>  query();
}
