package com.itheima.service;

import com.itheima.pojo.JobHis;

import java.util.List;

/**
 * 部门管理
 */
public interface JobHisService {
    /**
     * 查询全部部门数据
     * @return
     */
    List<JobHis> list();

//    /**
//     * 删除部门
//     * @param id
//     */
//    void delete(Integer id);
//
//    /**
//     * 新增部门
//     * @param job
//     */
//    void add(JobHis job);
}
