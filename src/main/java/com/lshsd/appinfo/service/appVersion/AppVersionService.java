package com.lshsd.appinfo.service.appVersion;

import com.lshsd.appinfo.pojo.AppVersion;
import com.lshsd.appinfo.util.PageUtil;

import java.util.List;

/**
 * (AppVersion)表服务接口
 *
 * @author mr.sun
 * @since 2021-04-25 15:10:10
 */
public interface AppVersionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AppVersion queryById(Integer id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param appVersion 实例对象
     * @return 对象列表
     */
    List<AppVersion> queryAll(AppVersion appVersion);

    /**
     * 查询多条数据
     */
    void queryAllByLimit(PageUtil<AppVersion> page);

    /**
     * 新增数据
     *
     * @param appVersion 实例对象
     * @return 实例对象
     */
    int insert(AppVersion appVersion);

    /**
     * 修改数据
     *
     * @param appVersion 实例对象
     * @return 实例对象
     */
    int update(AppVersion appVersion);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    int deleteById(Integer id);

}