package com.databaseFinal.mapper;

import com.databaseFinal.pojo.Login;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface LoginMapper {
    /**
     * 查询全部部门
     * @return
     */
    @Select("select * from login_accounts")
    List<Login> list();

    /**
     * 根据ID删除部门
     * @param id
     */
    @Delete("delete from login_accounts where login_account_id = #{id}")
    void deleteById(Integer id);

    /**
     * 新增部门
     * @param login
     */
    @Insert("insert into login(id, name) values(#{id},#{name})")
    void insert(Login login);

    @Select("SELECT * FROM login_accounts  WHERE account_name = #{accountName} AND passwords = #{passwords} ")
    Login getByUsernameAndPassword(Login login);
}
