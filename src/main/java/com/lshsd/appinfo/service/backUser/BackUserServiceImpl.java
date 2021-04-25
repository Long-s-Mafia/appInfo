package com.lshsd.appinfo.service.backUser;

import com.lshsd.appinfo.mapper.backUser.BackUserMapper;
import com.lshsd.appinfo.pojo.BackUser;
import com.lshsd.appinfo.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (BackUser)表服务实现类
 *
 * @author mr.sun
 * @since 2021-04-25 15:10:15
 */
@Service("backUserService")
public class BackUserServiceImpl implements BackUserService {
    @Resource
    private BackUserMapper backUserMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public BackUser queryById(Integer id) {
        return this.backUserMapper.queryById(id);
    }

    /**
     * 通过实体类查询数据
     *
     * @param backUser 主键
     * @return 实例对象
     */
    @Override
    public List<BackUser> queryAll(BackUser backUser) {
        return this.backUserMapper.queryAll(backUser);
    }

    /**
     * 查询多条数据
     */
    @Override
    public void queryAllByLimit(PageUtil<BackUser> page) {
        int count = this.backUserMapper.queryCount();
        if (count > 0) {
            page.setCounts(count);
            if (page.getPageindex() > page.getPagecount()) {
                page.setPageindex(page.getPagecount());
            }
            int offset = (page.getPageindex() - 1) * page.getPagesize();
            int limit = page.getPagesize();
            page.setLists(this.backUserMapper.queryAllByLimit(offset, limit));
        } else {
            page.setLists(new ArrayList<BackUser>());
        }
    }

    /**
     * 新增数据
     *
     * @param backUser 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(BackUser backUser) {
        return this.backUserMapper.insert(backUser);
    }

    /**
     * 修改数据
     *
     * @param backUser 实例对象
     * @return 实例对象
     */
    @Override
    public int update(BackUser backUser) {
        return this.backUserMapper.update(backUser);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Integer id) {
        return this.backUserMapper.deleteById(id);
    }
}