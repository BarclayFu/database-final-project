package com.databaseFinal.service;

import com.databaseFinal.pojo.Login;

import java.util.List;

/**
 * 部门管理
 */
public interface LoginService {
    /**
     * 查询全部部门数据
     * @return
     */
    List<Login> list();

    /**
     * 删除部门
     * @param id
     */
    void delete(Integer id);

    /**
     * 新增部门
     * @param login
     */
    void add(Login login);

    Login logCheck(Login login);
}
