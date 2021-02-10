package com.wing.spring.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
public class XmlMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:com/wing/spring/beans/beans.xml");
		//获得被Factory修饰后的getobject返回的对象
		System.out.println(ioc.getBean("car"));

		//获得Bean本身
		// System.out.println(ioc.getBean("&car"));
		// factoryBean
	}
}
