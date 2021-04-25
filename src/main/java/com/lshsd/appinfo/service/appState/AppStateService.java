package com.lshsd.appinfo.service.appState;

import com.lshsd.appinfo.pojo.AppState;
import com.lshsd.appinfo.util.PageUtil;

import java.util.List;

/**
 * (AppState)表服务接口
 *
 * @author mr.sun
 * @since 2021-04-25 15:10:06
 */
public interface AppStateService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AppState queryById(Integer id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param appState 实例对象
     * @return 对象列表
     */
    List<AppState> queryAll(AppState appState);

    /**
     * 查询多条数据
     */
    void queryAllByLimit(PageUtil<AppState> page);

    /**
     * 新增数据
     *
     * @param appState 实例对象
     * @return 实例对象
     */
    int insert(AppState appState);

    /**
     * 修改数据
     *
     * @param appState 实例对象
     * @return 实例对象
     */
    int update(AppState appState);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    int deleteById(Integer id);

}