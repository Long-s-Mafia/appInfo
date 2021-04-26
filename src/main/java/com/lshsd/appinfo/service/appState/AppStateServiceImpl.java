package com.lshsd.appinfo.service.appState;

import com.lshsd.appinfo.mapper.appState.AppStateMapper;
import com.lshsd.appinfo.pojo.AppState;

import com.lshsd.appinfo.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (AppState)表服务实现类
 *
 * @author mr.sun
 * @since 2021-04-26 08:44:01
 */
@Service("appStateService")
public class AppStateServiceImpl implements AppStateService {
    @Resource
    private AppStateMapper appStateMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AppState queryById(Integer id) {
        return this.appStateMapper.queryById(id);
    }

    /**
     * 通过实体类查询数据
     *
     * @param appState 主键
     * @return 实例对象
     */
    @Override
    public List<AppState> queryAll(AppState appState) {
        return this.appStateMapper.queryAll(appState);
    }

    /**
     * 查询多条数据
     */
    @Override
    public void queryAllByLimit(PageUtil<AppState> page) {
        int count = this.appStateMapper.queryCount();
        if (count > 0) {
            page.setCounts(count);
            if (page.getPageindex() > page.getPagecount()) {
                page.setPageindex(page.getPagecount());
            }
            int offset = (page.getPageindex() - 1) * page.getPagesize();
            int limit = page.getPagesize();
            page.setLists(this.appStateMapper.queryAllByLimit(offset, limit));
        } else {
            page.setLists(new ArrayList<AppState>());
        }
    }

    /**
     * 新增数据
     *
     * @param appState 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(AppState appState) {
        return this.appStateMapper.insert(appState);
    }

    /**
     * 修改数据
     *
     * @param appState 实例对象
     * @return 实例对象
     */
    @Override
    public int update(AppState appState) {
        return this.appStateMapper.update(appState);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Integer id) {
        return this.appStateMapper.deleteById(id);
    }
}