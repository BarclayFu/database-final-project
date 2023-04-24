package com.itheima.service;

import com.itheima.pojo.Time;

import java.util.List;

/**
 * 部门管理
 */
public interface TimeService {
    /**
     * 查询全部部门数据
     * @return
     */
    List<Time> list();

    /**
     * 删除部门
     * @param id
     */
    void delete(Integer id);

    /**
     * 新增部门
     * @param time
     */
    void add(Time time);
}
