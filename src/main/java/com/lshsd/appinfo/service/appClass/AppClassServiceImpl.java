package com.lshsd.appinfo.service.appClass;

import com.lshsd.appinfo.mapper.appClass.AppClassMapper;
import com.lshsd.appinfo.pojo.AppClass;
import com.lshsd.appinfo.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (AppClass)表服务实现类
 *
 * @author mr.sun
 * @since 2021-04-25 15:09:55
 */
@Service("appClassService")
public class AppClassServiceImpl implements AppClassService {
    @Resource
    private AppClassMapper appClassMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AppClass queryById(Integer id) {
        return this.appClassMapper.queryById(id);
    }

    /**
     * 通过实体类查询数据
     *
     * @param appClass 主键
     * @return 实例对象
     */
    @Override
    public List<AppClass> queryAll(AppClass appClass) {
        return this.appClassMapper.queryAll(appClass);
    }

    /**
     * 查询多条数据
     */
    @Override
    public void queryAllByLimit(PageUtil<AppClass> page) {
        int count = this.appClassMapper.queryCount();
        if (count > 0) {
            page.setCounts(count);
            if (page.getPageindex() > page.getPagecount()) {
                page.setPageindex(page.getPagecount());
            }
            int offset = (page.getPageindex() - 1) * page.getPagesize();
            int limit = page.getPagesize();
            page.setLists(this.appClassMapper.queryAllByLimit(offset, limit));
        } else {
            page.setLists(new ArrayList<AppClass>());
        }
    }

    /**
     * 新增数据
     *
     * @param appClass 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(AppClass appClass) {
        return this.appClassMapper.insert(appClass);
    }

    /**
     * 修改数据
     *
     * @param appClass 实例对象
     * @return 实例对象
     */
    @Override
    public int update(AppClass appClass) {
        return this.appClassMapper.update(appClass);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Integer id) {
        return this.appClassMapper.deleteById(id);
    }
}