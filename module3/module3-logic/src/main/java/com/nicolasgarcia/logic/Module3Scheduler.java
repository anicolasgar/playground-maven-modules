package com.nicolasgarcia.logic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class Module3Scheduler {
    private static final Logger log = LoggerFactory.getLogger(Module3Scheduler.class);
    private final TestImpl3 testImpl3;

    public Module3Scheduler(TestImpl3 testImpl3) {
        this.testImpl3 = testImpl3;
    }

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("Testing scheduler");
        testImpl3.callTestApi1();
        testImpl3.callTestApi2();
        log.info("Finish testing");
    }
}
