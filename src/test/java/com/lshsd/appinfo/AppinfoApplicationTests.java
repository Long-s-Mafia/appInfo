package com.lshsd.appinfo;

import com.lshsd.appinfo.mapper.appClass.AppClassMapper;
import com.lshsd.appinfo.pojo.AppClass;
import com.lshsd.appinfo.service.appClass.AppClassService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppinfoApplicationTests {

    @Autowired
    AppClassService appClassService;
    @Autowired
    AppClassMapper appClassMapper;

    @Test
    void contextLoads() {
        /*测试AppClass中共有几行数据*/
        System.out.println(appClassMapper.queryCount());
    }

}
