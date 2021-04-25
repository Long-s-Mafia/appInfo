package com.lshsd.appinfo.mapper.appInfo;

import com.lshsd.appinfo.pojo.AppInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (AppInfo)表数据库访问层
 *
 * @author mr.sun
 * @since 2021-04-25 15:09:59
 */
@Repository
public interface AppInfoMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AppInfo queryById(Integer id);

    /**
     * 查询总数
     */
    int queryCount();

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<AppInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param appInfo 实例对象
     * @return 对象列表
     */
    List<AppInfo> queryAll(AppInfo appInfo);

    /**
     * 新增数据
     *
     * @param appInfo 实例对象
     * @return 影响行数
     */
    int insert(AppInfo appInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<AppInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<AppInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<AppInfo> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<AppInfo> entities);

    /**
     * 修改数据
     *
     * @param appInfo 实例对象
     * @return 影响行数
     */
    int update(AppInfo appInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}