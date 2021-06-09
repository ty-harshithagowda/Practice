package com.te.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.bean.Technology;

@Configuration
public class TechnologyConfig {

	@Bean("1")
//	@Primary
	public Technology getTech() {
		Technology t=new Technology();
		t.setTechid(1);
		t.setTechname("java");
		return t;
		
}
	@Bean("2")
	public Technology getTech1() {
		Technology t=new Technology();
		t.setTechid(1);
		t.setTechname("python");
		return t;
		
}
	@Bean("3")
	public Technology getTech2() {
		Technology t=new Technology();
		t.setTechid(1);
		t.setTechname("js");
		return t;
		
}
}
