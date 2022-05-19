package com.nicolasgarcia;

import com.nicolasgarcia.logic.Module3Scheduler;
import com.nicolasgarcia.logic.TestImpl1;
import com.nicolasgarcia.logic.TestImpl2;
import com.nicolasgarcia.logic.TestImpl3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Import({
//        TestImpl1.class,
//        TestImpl2.class,
//        TestImpl3.class,
})
public class PlaygroundApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlaygroundApplication.class, args);
    }

}
