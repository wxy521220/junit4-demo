package com.testcase;

import org.junit.Test;

public class buyTest extends baseTest {

    @Test
    public void fun2(){
        if(dataMap.get("login").equals("登录成功")){
            System.out.println("登录成功，可以购买");
        }else{
        System.out.println("请先登录");
        }
    }
}
