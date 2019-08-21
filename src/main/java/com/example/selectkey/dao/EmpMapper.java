package com.example.selectkey.dao;


import com.example.selectkey.vo.Emp1;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpMapper {
    int add(Emp1 emp1);
}
