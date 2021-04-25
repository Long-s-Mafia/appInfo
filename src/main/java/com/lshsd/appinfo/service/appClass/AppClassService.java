package com.lshsd.appinfo.service.appClass;

import com.lshsd.appinfo.pojo.AppClass;
import com.lshsd.appinfo.util.PageUtil;

import java.util.List;

/**
 * (AppClass)表服务接口
 *
 * @author mr.sun
 * @since 2021-04-25 15:09:54
 */
public interface AppClassService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AppClass queryById(Integer id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param appClass 实例对象
     * @return 对象列表
     */
    List<AppClass> queryAll(AppClass appClass);

    /**
     * 查询多条数据
     */
    void queryAllByLimit(PageUtil<AppClass> page);

    /**
     * 新增数据
     *
     * @param appClass 实例对象
     * @return 实例对象
     */
    int insert(AppClass appClass);

    /**
     * 修改数据
     *
     * @param appClass 实例对象
     * @return 实例对象
     */
    int update(AppClass appClass);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    int deleteById(Integer id);

}