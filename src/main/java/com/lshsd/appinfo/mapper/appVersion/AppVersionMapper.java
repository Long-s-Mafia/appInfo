package com.lshsd.appinfo.mapper.appVersion;

import com.lshsd.appinfo.pojo.AppVersion;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (AppVersion)表数据库访问层
 *
 * @author mr.sun
 * @since 2021-04-25 15:10:09
 */
@Repository
public interface AppVersionMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AppVersion queryById(Integer id);

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
    List<AppVersion> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param appVersion 实例对象
     * @return 对象列表
     */
    List<AppVersion> queryAll(AppVersion appVersion);

    /**
     * 新增数据
     *
     * @param appVersion 实例对象
     * @return 影响行数
     */
    int insert(AppVersion appVersion);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<AppVersion> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<AppVersion> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<AppVersion> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<AppVersion> entities);

    /**
     * 修改数据
     *
     * @param appVersion 实例对象
     * @return 影响行数
     */
    int update(AppVersion appVersion);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}