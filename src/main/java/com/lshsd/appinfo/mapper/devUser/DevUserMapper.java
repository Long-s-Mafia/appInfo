package com.lshsd.appinfo.mapper.devUser;

import com.lshsd.appinfo.pojo.DevUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (DevUser)表数据库访问层
 *
 * @author mr.sun
 * @since 2021-04-25 15:10:17
 */
@Repository
public interface DevUserMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DevUser queryById(Integer id);

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
    List<DevUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param devUser 实例对象
     * @return 对象列表
     */
    List<DevUser> queryAll(DevUser devUser);

    /**
     * 新增数据
     *
     * @param devUser 实例对象
     * @return 影响行数
     */
    int insert(DevUser devUser);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<DevUser> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<DevUser> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<DevUser> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<DevUser> entities);

    /**
     * 修改数据
     *
     * @param devUser 实例对象
     * @return 影响行数
     */
    int update(DevUser devUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}