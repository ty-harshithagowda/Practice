package com.springxmlannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springxmlannotations.bean.Bharath;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bharath.xml");
	Bharath b=applicationContext.getBean(Bharath.class);
	System.out.println(b.getName());
	System.out.println(b.getLov().getName());
	System.out.println(b.getLov().getS_no());
	System.out.println(b.getGf().getName());
	}

}
