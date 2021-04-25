package com.lshsd.appinfo.service.appInfo;

import com.lshsd.appinfo.pojo.AppInfo;
import com.lshsd.appinfo.util.PageUtil;

import java.util.List;

/**
 * (AppInfo)表服务接口
 *
 * @author mr.sun
 * @since 2021-04-25 15:10:01
 */
public interface AppInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AppInfo queryById(Integer id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param appInfo 实例对象
     * @return 对象列表
     */
    List<AppInfo> queryAll(AppInfo appInfo);

    /**
     * 查询多条数据
     */
    void queryAllByLimit(PageUtil<AppInfo> page);

    /**
     * 新增数据
     *
     * @param appInfo 实例对象
     * @return 实例对象
     */
    int insert(AppInfo appInfo);

    /**
     * 修改数据
     *
     * @param appInfo 实例对象
     * @return 实例对象
     */
    int update(AppInfo appInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    int deleteById(Integer id);

}