package com.lshsd.appinfo.controller;

import com.lshsd.appinfo.pojo.AppInfo;
import com.lshsd.appinfo.service.appInfo.AppInfoService;
import com.lshsd.appinfo.util.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * (AppInfo)表控制层
 *
 * @author mr.sun
 * @since 2021-04-25 15:10:04
 */
@Controller
@RequestMapping("appInfo")
public class AppInfoController {
    /**
     * 服务对象
     */
    @Resource
    private AppInfoService appInfoService;



    @GetMapping("page")
    @ResponseBody
    public Object page(Integer index) {
        if (index == null) index = 1;
        if (index < 1) {
            index = 1;
        }
        PageUtil<AppInfo> page = new PageUtil<AppInfo>();
        page.setPageindex(index);
        page.setPagesize(5);
        this.appInfoService.queryAllByLimit(page);
        return page;
    }


    @PostMapping("insert")
    public String insert(@Valid @ModelAttribute AppInfo appInfo, BindingResult bindingResult) {
        if (this.appInfoService.insert(appInfo) > 0) {
            return "redirect:/";
        } else {
            return "";
        }
    }

    @PostMapping("update")
    public String update(@Valid @ModelAttribute AppInfo appInfo, BindingResult bindingResult) {
        if (this.appInfoService.update(appInfo) > 0) {
            return "redirect:/";
        } else {
            return "";
        }
    }

    @GetMapping("selectOne")
    @ResponseBody
    public Object selectOne(Integer id) {
        return this.appInfoService.queryById(id);
    }

    @GetMapping("delete")
    @ResponseBody
    public Object delete(Integer id) {
        return this.appInfoService.deleteById(id);
    }

}