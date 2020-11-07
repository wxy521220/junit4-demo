package com.suiteDemo;

import com.testcase.buyTest;
import com.testcase.loginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                //按照文件配置顺序执行
                loginTest.class,
                buyTest.class
        }
)
public class junitSuit {


}
