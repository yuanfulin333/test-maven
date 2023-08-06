package com.yuanfulin.controller;

import com.yuanfulin.pojo.PageBean;
import com.yuanfulin.pojo.Result;
import com.yuanfulin.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * ClassName:EmpController
 * Package:com.yuanfulin.controller
 * Description:员工管理
 *
 * @DATE:2023/7/27 17:23
 * @Author:袁福林
 */

@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping
    public Result Page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize)
      {log.info("分页查询, 参数: {},{}",page,pageSize);
        //调用service分页查询
        PageBean pageBean = empService.Page(page,pageSize);
        return Result.success(pageBean);}
}
