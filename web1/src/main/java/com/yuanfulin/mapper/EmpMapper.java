package com.yuanfulin.mapper;

import com.yuanfulin.pojo.Emp;
import com.yuanfulin.pojo.PageBean;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName:EmpMapper
 * Package:com.yuanfulin.mapper
 * Description:
 *
 * @DATE:2023/7/27 17:24
 * @Author:袁福林
 */
@Mapper
public interface EmpMapper {


    /**
     * 查询总记录数
     * @return
     */
//    @Select("select count(*) from tlias.emp")
//    public Integer count();

    /**
     * 分页查询,获取列表数据
     *
     * @param
     * @param
     * @return
     */
//    @Select("select * from tlias.emp limit #{start},#{pageSize}")
//    public List<Emp> Page(Integer start, Integer pageSize);
    @Select("select * from tlias.emp ")
    public List<Emp> list();

    @Select("select * from tlias.emp where username=#{username} and password = #{password}")
    Emp getUsernmaeAndPassword(Emp emp);

    @Delete("delete  from tlias.emp where dept_id=#{id}")
    void delete(Integer id);
}
