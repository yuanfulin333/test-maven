package com.yuanfulin.controller;

import com.yuanfulin.pojo.Dept;
import com.yuanfulin.pojo.Result;
import com.yuanfulin.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.javassist.bytecode.Descriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName:DeptController
 * Package:com.yuanfulin.controller
 * Description:部门管理
 *
 * @DATE:2023/7/27 17:23
 * @Author:袁福林
 */
@Slf4j
@RestController
public class DeptController {

    //
    @Autowired
    private DeptService deptService;

    /*
     * 部门查询
     *
     * */
    @RequestMapping("/depts")
    public Result list() {
        List<Dept> deptList = deptService.list();
        log.info("部门查询");
        return Result.success(deptList);
    }

    /*
     * 部门删除
     *
     * */

    @DeleteMapping("/depts/{id}")
    public Result Delete(@PathVariable Integer id) {
        log.info("删除:{}", id);
        deptService.delete(id);
        return Result.success();
    }

    /*
     * 新增部门
     * */
    @PostMapping("/depts")
    public Result add(@RequestBody Dept dept) {
        log.info("新增部门{}", dept);
        deptService.add(dept);
        return Result.success();
    }


    /*
     * 根据id查部门*/


    @GetMapping("/depts/{id}")
    public Result select(@PathVariable Integer id) {

        log.info("查找");
        Dept deptsList = deptService.select(id);
        // deptService.select(id);
        return Result.success(deptsList);

    }

    /*
      修改部门
    * */
    @PutMapping("/depts")
    public Result update(@RequestBody Dept dept) {
        select(dept.getId());
        log.info("修改部门");
        deptService.update(dept);
        return Result.success();
    }
}
