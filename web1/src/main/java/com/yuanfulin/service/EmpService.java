package com.yuanfulin.service;

import com.yuanfulin.pojo.Emp;
import com.yuanfulin.pojo.PageBean;
import org.springframework.stereotype.Service;

/**
 * ClassName:EmpService
 * Package:com.yuanfulin.service
 * Description:
 *
 * @DATE:2023/7/27 17:28
 * @Author:袁福林
 */

public interface EmpService {
    PageBean Page(Integer page, Integer pageSize);

    Emp login(Emp emp);
}
