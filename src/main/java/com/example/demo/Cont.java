package com.example.demo;

import com.example.demo.mapper.TestMapper;

public class Cont {

    public static void main(String[] args) {
        System.out.println(TestMapper.class.getClassLoader().getResource("").getPath());
    }
}
