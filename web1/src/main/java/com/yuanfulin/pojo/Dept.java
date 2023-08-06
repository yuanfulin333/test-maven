package com.yuanfulin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * ClassName:Dept
 * Package:com.yuanfulin.pojo
 * Description:
 *
 * @DATE:2023/7/27 17:25
 * @Author:袁福林
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private Integer id; //ID
    private String name; //部门名称
    private LocalDateTime createTime; //创建时间
    private LocalDateTime updateTime; //修改时间
}
