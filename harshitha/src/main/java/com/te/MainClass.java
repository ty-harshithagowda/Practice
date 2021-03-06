package com.te;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.bean.Project;
import com.te.config.Link;

public class MainClass {

	public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Link.class);
	Project project=applicationContext.getBean(Project.class);
	System.out.println(project.getPid());
	System.out.println(project.getName());
	System.out.println(project.getTech().getTechid());
	System.out.println(project.getTech().getTechname());

	}

}
