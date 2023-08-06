package com.yuanfulin.mapper;

import com.yuanfulin.pojo.Dept;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * ClassName:DeptMapper
 * Package:com.yuanfulin.mapper
 * Description:
 *
 * @DATE:2023/7/27 17:24
 * @Author:袁福林
 */
@Mapper
@Component
public interface DeptMapper {

    @Insert("insert into tlias.dept(name, create_time, update_time) values (#{name},#{createTime},#{updateTime})")
     void add(Dept dept);


    @Select("select * from tlias.dept")
    List<Dept> list();

    @Delete("delete from tlias.dept where id = #{id}")
    void delete(Integer id);

    @Update("update tlias.dept set name= #{name} where id = #{id}")
    void update(Dept dept);

    @Select("select * from tlias.dept where id=#{id}")
    Dept select(Integer id);
}
