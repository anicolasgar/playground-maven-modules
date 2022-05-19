package com.nicolasgarcia.logic;

import com.nicolasgarcia.api.TestApi1;
import com.nicolasgarcia.api.TestApi2;
import org.springframework.stereotype.Service;

@Service
public class TestImpl1 implements TestApi1 {
    private final TestApi2 testApi2;

    public TestImpl1( TestApi2 testApi2) {
        this.testApi2 = testApi2;
    }

    @Override
    public void foo() {
        testApi2.foo();
    }

    @Override
    public void bar() {
        testApi2.bar();
    }
}
