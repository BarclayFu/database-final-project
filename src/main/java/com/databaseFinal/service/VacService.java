package com.databaseFinal.service;

import com.databaseFinal.pojo.Vac;

import java.util.List;

/**
 * 部门管理
 */
public interface VacService {
    /**
     * 查询全部部门数据
     * @return
     */
    List<Vac> list();

    /**
     * 删除部门
     * @param id
     */
    void delete(Integer id);

    /**
     * 新增部门
     * @param vac
     */
    void add(Vac vac);
}
