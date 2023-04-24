package com.itheima.service;

import com.itheima.pojo.Perf;

import java.util.List;

/**
 * 部门管理
 */
public interface PerfService {
    /**
     * 查询全部部门数据
     * @return
     */
    List<Perf> list();

    /**
     * 删除部门
     * @param id
     */
    void delete(Integer id);
//
//    /**
//     * 新增部门
//     * @param perf
//     */
//    void add(Perf perf);
}
