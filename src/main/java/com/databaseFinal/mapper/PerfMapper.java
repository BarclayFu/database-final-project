package com.databaseFinal.mapper;

import com.databaseFinal.pojo.Perf;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface PerfMapper {
    /**
     * 查询全部部门
     * @return
     */
    @Select("select * from performance_reviews")
    List<Perf> list();

    /**
     * 根据ID删除部门
     * @param id
     */
    @Delete("delete from performance_reviews where review_id = #{id}")
    void deleteById(Integer id);

//    /**
//     * 新增部门
//     * @param perf
//     */
//    @Insert("insert into perf(id, name) values(#{id},#{name})")
//    void insert(Perf perf);
}
