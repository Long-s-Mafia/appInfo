package com.lshsd.appinfo.controller;

import com.lshsd.appinfo.pojo.AppVersion;
import com.lshsd.appinfo.service.appVersion.AppVersionService;
import com.lshsd.appinfo.util.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * (AppVersion)表控制层
 *
 * @author mr.sun
 * @since 2021-04-25 15:10:12
 */
@Controller
@RequestMapping("appVersion")
public class AppVersionController {
    /**
     * 服务对象
     */
    @Resource
    private AppVersionService appVersionService;



    @GetMapping("page")
    @ResponseBody
    public Object page(Integer index) {
        if (index == null) index = 1;
        if (index < 1) {
            index = 1;
        }
        PageUtil<AppVersion> page = new PageUtil<AppVersion>();
        page.setPageindex(index);
        page.setPagesize(5);
        this.appVersionService.queryAllByLimit(page);
        return page;
    }


    @PostMapping("insert")
    public String insert(@Valid @ModelAttribute AppVersion appVersion, BindingResult bindingResult) {
        if (this.appVersionService.insert(appVersion) > 0) {
            return "redirect:/";
        } else {
            return "";
        }
    }

    @PostMapping("update")
    public String update(@Valid @ModelAttribute AppVersion appVersion, BindingResult bindingResult) {
        if (this.appVersionService.update(appVersion) > 0) {
            return "redirect:/";
        } else {
            return "";
        }
    }

    @GetMapping("selectOne")
    @ResponseBody
    public Object selectOne(Integer id) {
        return this.appVersionService.queryById(id);
    }

    @GetMapping("delete")
    @ResponseBody
    public Object delete(Integer id) {
        return this.appVersionService.deleteById(id);
    }

}