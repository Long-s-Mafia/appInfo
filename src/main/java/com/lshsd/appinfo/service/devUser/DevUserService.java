package com.lshsd.appinfo.service.devUser;

import com.lshsd.appinfo.pojo.DevUser;
import com.lshsd.appinfo.util.PageUtil;

import java.util.List;

/**
 * (DevUser)表服务接口
 *
 * @author mr.sun
 * @since 2021-04-25 15:10:18
 */
public interface DevUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DevUser queryById(Integer id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param devUser 实例对象
     * @return 对象列表
     */
    List<DevUser> queryAll(DevUser devUser);

    /**
     * 查询多条数据
     */
    void queryAllByLimit(PageUtil<DevUser> page);

    /**
     * 新增数据
     *
     * @param devUser 实例对象
     * @return 实例对象
     */
    int insert(DevUser devUser);

    /**
     * 修改数据
     *
     * @param devUser 实例对象
     * @return 实例对象
     */
    int update(DevUser devUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    int deleteById(Integer id);

}