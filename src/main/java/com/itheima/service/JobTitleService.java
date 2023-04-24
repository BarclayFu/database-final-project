package com.itheima.service;

import com.itheima.pojo.Dept;
import com.itheima.pojo.JobTitle;

import java.util.List;

/**
 * 部门管理
 */
public interface JobTitleService {
    /**
     * 查询全部部门数据
     * @return
     */
    List<JobTitle> list();

    /**
     * 删除部门
     * @param id
     */
    void delete(Integer id);

    /**
     * 新增部门
     * @param job
     */
    void add(JobTitle job);
}
