package com.lshsd.appinfo.controller;

import com.lshsd.appinfo.pojo.AppClass;
import com.lshsd.appinfo.service.appClass.AppClassService;
import com.lshsd.appinfo.util.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * (AppClass)表控制层
 *
 * @author mr.sun
 * @since 2021-04-25 15:09:56
 */
@Controller
@RequestMapping("/appClass")
public class AppClassController {
    /**
     * 服务对象
     */
    @Resource
    private AppClassService appClassService;

    @RequestMapping("/index")
    public String index(){
        return "developer/index";
    }


    @GetMapping("page")
    @ResponseBody
    public Object page(Integer index) {
        if (index == null) index = 1;
        if (index < 1) {
            index = 1;
        }
        PageUtil<AppClass> page = new PageUtil<AppClass>();
        page.setPageindex(index);
        page.setPagesize(5);
        this.appClassService.queryAllByLimit(page);
        return page;
    }


    @PostMapping("insert")
    public String insert(@Valid @ModelAttribute AppClass appClass, BindingResult bindingResult) {
        if (this.appClassService.insert(appClass) > 0) {
            return "redirect:/";
        } else {
            return "";
        }
    }

    @PostMapping("update")
    public String update(@Valid @ModelAttribute AppClass appClass, BindingResult bindingResult) {
        if (this.appClassService.update(appClass) > 0) {
            return "redirect:/";
        } else {
            return "";
        }
    }

    @GetMapping("selectOne")
    @ResponseBody
    public Object selectOne(Integer id) {
        return this.appClassService.queryById(id);
    }

    @GetMapping("delete")
    @ResponseBody
    public Object delete(Integer id) {
        return this.appClassService.deleteById(id);
    }

}