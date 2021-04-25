package com.lshsd.appinfo.controller;

import com.lshsd.appinfo.pojo.DevUser;
import com.lshsd.appinfo.service.devUser.DevUserService;
import com.lshsd.appinfo.util.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * (DevUser)表控制层
 *
 * @author mr.sun
 * @since 2021-04-25 15:10:20
 */
@Controller
@RequestMapping("devUser")
public class DevUserController {
    /**
     * 服务对象
     */
    @Resource
    private DevUserService devUserService;



    @GetMapping("page")
    @ResponseBody
    public Object page(Integer index) {
        if (index == null) index = 1;
        if (index < 1) {
            index = 1;
        }
        PageUtil<DevUser> page = new PageUtil<DevUser>();
        page.setPageindex(index);
        page.setPagesize(5);
        this.devUserService.queryAllByLimit(page);
        return page;
    }


    @PostMapping("insert")
    public String insert(@Valid @ModelAttribute DevUser devUser, BindingResult bindingResult) {
        if (this.devUserService.insert(devUser) > 0) {
            return "redirect:/";
        } else {
            return "";
        }
    }

    @PostMapping("update")
    public String update(@Valid @ModelAttribute DevUser devUser, BindingResult bindingResult) {
        if (this.devUserService.update(devUser) > 0) {
            return "redirect:/";
        } else {
            return "";
        }
    }

    @GetMapping("selectOne")
    @ResponseBody
    public Object selectOne(Integer id) {
        return this.devUserService.queryById(id);
    }

    @GetMapping("delete")
    @ResponseBody
    public Object delete(Integer id) {
        return this.devUserService.deleteById(id);
    }

}