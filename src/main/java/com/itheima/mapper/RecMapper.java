package com.itheima.mapper;

import com.itheima.pojo.Rec;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface RecMapper {
    /**
     * 查询全部部门
     * @return
     */
    @Select("select * from employee_training")
    List<Rec> list();

    /**
     * 根据ID删除部门
     * @param id
     */
    @Delete("delete from employee_training where employee_id = #{id}")
    void deleteById(Integer id);

    /**
     * 新增部门
     * @param rec
     */
    @Insert("insert into rec(id, name) values(#{id},#{name})")
    void insert(Rec rec);
}
