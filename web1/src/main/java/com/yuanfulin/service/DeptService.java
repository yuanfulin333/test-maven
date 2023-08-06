package com.yuanfulin.service;

import com.yuanfulin.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:DeptService
 * Package:com.yuanfulin.service.impl
 * Description:
 *
 * @DATE:2023/7/27 17:26
 * @Author:袁福林
 */

public interface DeptService {
/*新增部门
* */
     void add(Dept dept) ;


    /**
     * 查询部门信息
     **/
    List<Dept> list();

    void delete(Integer id);

    void update(Dept dept);

    Dept select(Integer id);
}
