package com.lshsd.appinfo.service.backUser;

import com.lshsd.appinfo.pojo.BackUser;
import com.lshsd.appinfo.util.PageUtil;

import java.util.List;

/**
 * (BackUser)表服务接口
 *
 * @author mr.sun
 * @since 2021-04-25 15:10:14
 */
public interface BackUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackUser queryById(Integer id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param backUser 实例对象
     * @return 对象列表
     */
    List<BackUser> queryAll(BackUser backUser);

    /**
     * 查询多条数据
     */
    void queryAllByLimit(PageUtil<BackUser> page);

    /**
     * 新增数据
     *
     * @param backUser 实例对象
     * @return 实例对象
     */
    int insert(BackUser backUser);

    /**
     * 修改数据
     *
     * @param backUser 实例对象
     * @return 实例对象
     */
    int update(BackUser backUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    int deleteById(Integer id);

}