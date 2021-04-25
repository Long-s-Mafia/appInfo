package com.lshsd.appinfo.service.appInfo;

import com.lshsd.appinfo.mapper.appInfo.AppInfoMapper;
import com.lshsd.appinfo.pojo.AppInfo;
import com.lshsd.appinfo.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (AppInfo)表服务实现类
 *
 * @author mr.sun
 * @since 2021-04-25 15:10:02
 */
@Service("appInfoService")
public class AppInfoServiceImpl implements AppInfoService {
    @Resource
    private AppInfoMapper appInfoMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AppInfo queryById(Integer id) {
        return this.appInfoMapper.queryById(id);
    }

    /**
     * 通过实体类查询数据
     *
     * @param appInfo 主键
     * @return 实例对象
     */
    @Override
    public List<AppInfo> queryAll(AppInfo appInfo) {
        return this.appInfoMapper.queryAll(appInfo);
    }

    /**
     * 查询多条数据
     */
    @Override
    public void queryAllByLimit(PageUtil<AppInfo> page) {
        int count = this.appInfoMapper.queryCount();
        if (count > 0) {
            page.setCounts(count);
            if (page.getPageindex() > page.getPagecount()) {
                page.setPageindex(page.getPagecount());
            }
            int offset = (page.getPageindex() - 1) * page.getPagesize();
            int limit = page.getPagesize();
            page.setLists(this.appInfoMapper.queryAllByLimit(offset, limit));
        } else {
            page.setLists(new ArrayList<AppInfo>());
        }
    }

    /**
     * 新增数据
     *
     * @param appInfo 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(AppInfo appInfo) {
        return this.appInfoMapper.insert(appInfo);
    }

    /**
     * 修改数据
     *
     * @param appInfo 实例对象
     * @return 实例对象
     */
    @Override
    public int update(AppInfo appInfo) {
        return this.appInfoMapper.update(appInfo);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Integer id) {
        return this.appInfoMapper.deleteById(id);
    }
}