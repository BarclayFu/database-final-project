package com.databaseFinal.service;

import com.databaseFinal.pojo.Pay;

import java.util.List;

/**
 * 部门管理
 */
public interface PayService {
    /**
     * 查询全部部门数据
     * @return
     */
    List<Pay> list();

    /**
     * 删除部门
     * @param id
     */
    void delete(Integer id);

    /**
     * 新增部门
     * @param pay
     */
    void add(Pay pay);

    void update(Pay pay);
}
