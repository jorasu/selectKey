package com.example.selectkey.test;


import com.example.selectkey.dao.EmpMapper;
import com.example.selectkey.vo.Emp1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMapper {
    @Resource
    private EmpMapper empMapper;
    @Test
    public void mapperTest(){
        Emp1 emp=new Emp1();
        emp.setDeptno(1);
        emp.setEname("aa");
        emp.setComm(1);
        emp.setJob("aa");
        emp.setMgr(1);
        emp.setSal(100);
        int result=empMapper.add(emp);
        System.out.println(result);
        System.out.println(emp.getEmpno());
    }

}
