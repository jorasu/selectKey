package com.example.selectkey.service.impl;

import com.example.selectkey.dao.EmpMapper;
import com.example.selectkey.service.EmpService;
import com.example.selectkey.vo.Emp1;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpMapper empMapper;

    @Override
    public int add(Emp1 emp1) {
        return empMapper.add(emp1);
    }
}
