package com.lshsd.appinfo.service.appVersion;

import com.lshsd.appinfo.mapper.appVersion.AppVersionMapper;
import com.lshsd.appinfo.pojo.AppVersion;
import com.lshsd.appinfo.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (AppVersion)表服务实现类
 *
 * @author mr.sun
 * @since 2021-04-25 15:10:11
 */
@Service("appVersionService")
public class AppVersionServiceImpl implements AppVersionService {
    @Resource
    private AppVersionMapper appVersionMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AppVersion queryById(Integer id) {
        return this.appVersionMapper.queryById(id);
    }

    /**
     * 通过实体类查询数据
     *
     * @param appVersion 主键
     * @return 实例对象
     */
    @Override
    public List<AppVersion> queryAll(AppVersion appVersion) {
        return this.appVersionMapper.queryAll(appVersion);
    }

    /**
     * 查询多条数据
     */
    @Override
    public void queryAllByLimit(PageUtil<AppVersion> page) {
        int count = this.appVersionMapper.queryCount();
        if (count > 0) {
            page.setCounts(count);
            if (page.getPageindex() > page.getPagecount()) {
                page.setPageindex(page.getPagecount());
            }
            int offset = (page.getPageindex() - 1) * page.getPagesize();
            int limit = page.getPagesize();
            page.setLists(this.appVersionMapper.queryAllByLimit(offset, limit));
        } else {
            page.setLists(new ArrayList<AppVersion>());
        }
    }

    /**
     * 新增数据
     *
     * @param appVersion 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(AppVersion appVersion) {
        return this.appVersionMapper.insert(appVersion);
    }

    /**
     * 修改数据
     *
     * @param appVersion 实例对象
     * @return 实例对象
     */
    @Override
    public int update(AppVersion appVersion) {
        return this.appVersionMapper.update(appVersion);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Integer id) {
        return this.appVersionMapper.deleteById(id);
    }
}