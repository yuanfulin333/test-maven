package com.yuanfulin.service.impl;

import com.yuanfulin.mapper.DeptMapper;
import com.yuanfulin.mapper.EmpMapper;
import com.yuanfulin.pojo.Dept;
import com.yuanfulin.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

import static java.time.LocalTime.now;

/**
 * ClassName:DeptServiceImpl
 * Package:com.yuanfulin.service.impl
 * Description:
 *
 * @DATE:2023/7/27 17:26
 * @Author:袁福林
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;
    @Autowired
    private EmpMapper empMapper;

    @Override
    public void add(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        dept.setCreateTime(LocalDateTime.now());

        deptMapper.add(dept);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }

    @Override
    public void delete(Integer id) {
        deptMapper.delete(id);
        empMapper.delete(id);
    }

    @Override
    public void update(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.update(dept);
    }

    @Override
    public Dept select(Integer id) {
         return deptMapper.select(id);

    }
}
