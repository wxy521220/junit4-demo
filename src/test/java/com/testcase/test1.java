package com.testcase;

import org.junit.*;

public class test1 {


     @Test
    public void testcase1(){
         System.out.println("第一个测试案例");
     }
     @Test
     @Ignore
    public void testcase2(){
         System.out.println("第二个测试案例");
     }

     @BeforeClass
    public static void BeforeClass(){
         System.out.println("BeforeClass");
     }
     @AfterClass
    public static void AfterClass(){
         System.out.println("AfterClass");
     }
     @Before
    public void Before(){
         System.out.println("Before");
     }
     @After
    public void After(){
         System.out.println("After");
     }
}
