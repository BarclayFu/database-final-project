package com.itheima.mapper;

import com.itheima.pojo.Pay;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface PayMapper {
    /**
     * 查询全部部门
     * @return
     */
    @Select("select * from payroll")
    List<Pay> list();

    /**
     * 根据ID删除部门
     * @param id
     */
    @Delete("delete from payroll where payroll_id = #{id}")
    void deleteById(Integer id);

    /**
     * 新增部门
     * @param pay
     */
    @Insert("insert into pay(id, name) values(#{id},#{name})")
    void insert(Pay pay);
}
