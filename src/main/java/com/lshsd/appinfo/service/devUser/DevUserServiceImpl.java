package com.lshsd.appinfo.service.devUser;

import com.lshsd.appinfo.mapper.devUser.DevUserMapper;
import com.lshsd.appinfo.pojo.DevUser;
import com.lshsd.appinfo.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (DevUser)表服务实现类
 *
 * @author mr.sun
 * @since 2021-04-25 15:10:19
 */
@Service("devUserService")
public class DevUserServiceImpl implements DevUserService {
    @Resource
    private DevUserMapper devUserMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DevUser queryById(Integer id) {
        return this.devUserMapper.queryById(id);
    }

    /**
     * 通过实体类查询数据
     *
     * @param devUser 主键
     * @return 实例对象
     */
    @Override
    public List<DevUser> queryAll(DevUser devUser) {
        return this.devUserMapper.queryAll(devUser);
    }

    /**
     * 查询多条数据
     */
    @Override
    public void queryAllByLimit(PageUtil<DevUser> page) {
        int count = this.devUserMapper.queryCount();
        if (count > 0) {
            page.setCounts(count);
            if (page.getPageindex() > page.getPagecount()) {
                page.setPageindex(page.getPagecount());
            }
            int offset = (page.getPageindex() - 1) * page.getPagesize();
            int limit = page.getPagesize();
            page.setLists(this.devUserMapper.queryAllByLimit(offset, limit));
        } else {
            page.setLists(new ArrayList<DevUser>());
        }
    }

    /**
     * 新增数据
     *
     * @param devUser 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(DevUser devUser) {
        return this.devUserMapper.insert(devUser);
    }

    /**
     * 修改数据
     *
     * @param devUser 实例对象
     * @return 实例对象
     */
    @Override
    public int update(DevUser devUser) {
        return this.devUserMapper.update(devUser);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Integer id) {
        return this.devUserMapper.deleteById(id);
    }
}