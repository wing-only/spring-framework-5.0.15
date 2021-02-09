package com.wing.spring.circulardependencies;

import org.springframework.context.annotation.*;

/**
 * Created by xsls on 2019/5/29.
 */
@Configuration
@ComponentScan(basePackages = {"com.wing.spring.circulardependencies"})
//@ImportResource(value = {"classpath:beans/beans-lifecycle.xml"})
@EnableAspectJAutoProxy
public class MainConfig {



}
