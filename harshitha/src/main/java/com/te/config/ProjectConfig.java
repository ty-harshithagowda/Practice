package com.te.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.bean.Project;
@Configuration
public class ProjectConfig {

    @Bean
	public Project getProject() {
		Project p=new Project();
		p.setPid(2);
		p.setName("rahul");
		return p;
}
}