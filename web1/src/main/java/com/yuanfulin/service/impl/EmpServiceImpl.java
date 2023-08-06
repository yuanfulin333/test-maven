package com.yuanfulin.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yuanfulin.mapper.EmpMapper;
import com.yuanfulin.pojo.Emp;
import com.yuanfulin.pojo.PageBean;
import com.yuanfulin.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:EmpServiceImpl
 * Package:com.yuanfulin.service.impl
 * Description:
 *
 * @DATE:2023/7/27 17:28
 * @Author:袁福林
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

//    @Override
//    public PageBean Page(Integer page, Integer pageSize) {
//        Integer count = empMapper.count();
//        Integer start = (page-1)*pageSize;
//        List<Emp> empList = empMapper.Page(start,pageSize);
//        PageBean pageBean= new PageBean(count,empList);
//        return pageBean;
//
//
//    }

    @Override
    public PageBean Page(Integer page, Integer pageSize) {
        //1
        PageHelper.startPage(page,pageSize);
        //2
        List<Emp>empList=empMapper.list();
        Page<Emp> p =(Page<Emp>)empList;

        PageBean pageBean= new PageBean(p.getTotal(),p.getResult());
        return pageBean;


    }

    @Override
    public Emp login(Emp emp) {

       Emp e = empMapper.getUsernmaeAndPassword(emp);
        return e;
    }
}
