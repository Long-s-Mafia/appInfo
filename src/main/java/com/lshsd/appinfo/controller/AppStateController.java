package com.lshsd.appinfo.controller;

import com.lshsd.appinfo.pojo.AppState;
import com.lshsd.appinfo.service.appState.AppStateService;

import com.lshsd.appinfo.util.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * (AppState)表控制层
 *
 * @author mr.sun
 * @since 2021-04-26 08:44:02
 */
@Controller
@RequestMapping("appState")
public class AppStateController {
    /**
     * 服务对象
     */
    @Resource
    private AppStateService appStateService;


    @GetMapping("page")
    @ResponseBody
    public Object page(Integer index) {
        if (index == null) index = 1;
        if (index < 1) {
            index = 1;
        }
        PageUtil<AppState> page = new PageUtil<AppState>();
        page.setPageindex(index);
        page.setPagesize(5);
        this.appStateService.queryAllByLimit(page);
        return page;
    }


    @PostMapping("insert")
    public String insert(@Valid @ModelAttribute AppState appState, BindingResult bindingResult) {
        if (this.appStateService.insert(appState) > 0) {
            return "redirect:/";
        } else {
            return "";
        }
    }

    @PostMapping("update")
    public String update(@Valid @ModelAttribute AppState appState, BindingResult bindingResult) {
        if (this.appStateService.update(appState) > 0) {
            return "redirect:/";
        } else {
            return "";
        }
    }

    @GetMapping("selectOne")
    @ResponseBody
    public Object selectOne(Integer id) {
        return this.appStateService.queryById(id);
    }

    @GetMapping("delete")
    @ResponseBody
    public Object delete(Integer id) {
        return this.appStateService.deleteById(id);
    }

}