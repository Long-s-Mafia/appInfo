package com.lshsd.appinfo.controller;

import com.lshsd.appinfo.pojo.BackUser;
import com.lshsd.appinfo.service.backUser.BackUserService;
import com.lshsd.appinfo.util.PageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * (BackUser)表控制层
 *
 * @author mr.sun
 * @since 2021-04-25 15:10:15
 */
@Controller
@RequestMapping("backUser")
public class BackUserController {
    /**
     * 服务对象
     */
    @Resource
    private BackUserService backUserService;



    @GetMapping("page")
    @ResponseBody
    public Object page(Integer index) {
        if (index == null) index = 1;
        if (index < 1) {
            index = 1;
        }
        PageUtil<BackUser> page = new PageUtil<BackUser>();
        page.setPageindex(index);
        page.setPagesize(5);
        this.backUserService.queryAllByLimit(page);
        return page;
    }


    @PostMapping("insert")
    public String insert(@Valid @ModelAttribute BackUser backUser, BindingResult bindingResult) {
        if (this.backUserService.insert(backUser) > 0) {
            return "redirect:/";
        } else {
            return "";
        }
    }

    @PostMapping("update")
    public String update(@Valid @ModelAttribute BackUser backUser, BindingResult bindingResult) {
        if (this.backUserService.update(backUser) > 0) {
            return "redirect:/";
        } else {
            return "";
        }
    }

    @GetMapping("selectOne")
    @ResponseBody
    public Object selectOne(Integer id) {
        return this.backUserService.queryById(id);
    }

    @GetMapping("delete")
    @ResponseBody
    public Object delete(Integer id) {
        return this.backUserService.deleteById(id);
    }

}