package com.lshsd.appinfo.mapper.backUser;

import com.lshsd.appinfo.pojo.BackUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (BackUser)表数据库访问层
 *
 * @author mr.sun
 * @since 2021-04-25 15:10:13
 */
@Repository
public interface BackUserMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    BackUser queryById(Integer id);

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
    List<BackUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param backUser 实例对象
     * @return 对象列表
     */
    List<BackUser> queryAll(BackUser backUser);

    /**
     * 新增数据
     *
     * @param backUser 实例对象
     * @return 影响行数
     */
    int insert(BackUser backUser);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackUser> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<BackUser> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<BackUser> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<BackUser> entities);

    /**
     * 修改数据
     *
     * @param backUser 实例对象
     * @return 影响行数
     */
    int update(BackUser backUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}