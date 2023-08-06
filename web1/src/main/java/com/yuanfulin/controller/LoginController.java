package com.yuanfulin.controller;

import com.yuanfulin.Utils.JwtUtils;
import com.yuanfulin.pojo.Emp;
import com.yuanfulin.pojo.Result;
import com.yuanfulin.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:LoginController
 * Package:com.yuanfulin.controller
 * Description:
 *
 * @DATE:2023/7/29 21:55
 * @Author:袁福林
 */
@Slf4j
@RestController
public class LoginController {


    @Autowired
    private EmpService empService;

    @PostMapping("/login")
    public Result login(@RequestBody Emp emp) {
        log.info("登录");
        Emp empLogin = empService.login(emp);
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", empLogin.getId());
        claims.put("name", empLogin.getName());
        claims.put("username", empLogin.getUsername());
        if (empLogin != null) {

            String Jwtt = JwtUtils.generateJwt(claims);
            return  Result.success(Jwtt);
        }

        return Result.error("有错误");
    }
}
