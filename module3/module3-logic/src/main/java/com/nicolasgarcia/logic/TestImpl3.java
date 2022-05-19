package com.nicolasgarcia.logic;

import com.nicolasgarcia.api.TestApi1;
import com.nicolasgarcia.api.TestApi2;
import com.nicolasgarcia.api.TestApi3;
import org.springframework.stereotype.Service;

@Service
public class TestImpl3 implements TestApi3 {
    private final TestApi1 testApi1;
    private final TestApi2 testApi2;

    public TestImpl3(TestApi1 testApi1, TestApi2 testApi2) {
        this.testApi1 = testApi1;
        this.testApi2 = testApi2;
    }


    @Override
    public void callTestApi1() {
        this.testApi1.foo();
        this.testApi1.bar();
    }

    @Override
    public void callTestApi2() {
        this.testApi2.foo();
        this.testApi2.bar();
    }
}
