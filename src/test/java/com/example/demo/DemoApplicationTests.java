package com.example.demo;

import com.example.demo.mapper.TestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    TestMapper testMapper;

    @Test
    void contextLoads() {
        System.out.println(11111);
        int i = testMapper.selectONe();
        System.out.println(i);
    }

}
