package com.nicolasgarcia.logic;


//import com.nicolasgarcia.api.TestApi1;
import com.nicolasgarcia.api.TestApi2;
import org.springframework.stereotype.Service;

@Service
public class TestImpl2 implements TestApi2 {
//    private final TestApi1 testApi1;

//    public TestImpl2(TestApi1 testApi1) {
//        this.testApi1 = testApi1;
//    }

    @Override
    public void foo() {
//        testApi1.foo();
    }

    @Override
    public void bar() {
//        testApi1.bar();
    }
}
