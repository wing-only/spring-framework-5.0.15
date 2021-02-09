package com.wing.spring.event;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xsls on 2019/7/15.
 */
@Configuration
@ComponentScan(basePackages = {"com.wing.spring.event"})
//@EnableAsync  异步事件
public class MainConfig {

   /*往SimpleApplicationEventMulticaster设置taskExecutor则为异步事件
     或者使用@Async
    @Bean(name = "applicationEventMulticaster")
    public ApplicationEventMulticaster simpleApplicationEventMulticaster() {
        SimpleApplicationEventMulticaster eventMulticaster
                = new SimpleApplicationEventMulticaster();

        eventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
        return eventMulticaster;
    }*/
}
