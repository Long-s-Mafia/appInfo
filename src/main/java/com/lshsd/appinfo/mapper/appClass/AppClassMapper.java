package com.lshsd.appinfo.mapper.appClass;

import com.lshsd.appinfo.pojo.AppClass;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (AppClass)表数据库访问层
 *
 * @author mr.sun
 * @since 2021-04-25 15:09:52
 */
@Repository
public interface AppClassMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AppClass queryById(Integer id);

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
    List<AppClass> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param appClass 实例对象
     * @return 对象列表
     */
    List<AppClass> queryAll(AppClass appClass);

    /**
     * 新增数据
     *
     * @param appClass 实例对象
     * @return 影响行数
     */
    int insert(AppClass appClass);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<AppClass> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<AppClass> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<AppClass> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<AppClass> entities);

    /**
     * 修改数据
     *
     * @param appClass 实例对象
     * @return 影响行数
     */
    int update(AppClass appClass);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}