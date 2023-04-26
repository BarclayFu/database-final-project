package com.databaseFinal.mapper;

import com.databaseFinal.pojo.Vac;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface VacMapper {
    /**
     * 查询全部部门
     * @return
     */
    @Select("select * from vacation_requests")
    List<Vac> list();

    /**
     * 根据ID删除部门
     * @param id
     */
    @Delete("delete from vacation_requests where request_id = #{id}")
    void deleteById(Integer id);

    /**
     * 新增部门
     * @param vac
     */
    @Insert("insert into vac(id, name) values(#{id},#{name})")
    void insert(Vac vac);
}
