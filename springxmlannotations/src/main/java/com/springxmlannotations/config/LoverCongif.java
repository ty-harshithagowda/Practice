package com.springxmlannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springxmlannotations.bean.Lover;

@Configuration
public class LoverCongif {
	@Bean
	public Lover getLover() {
    Lover l=new Lover();
    l.setName("chandini");
    l.setS_no(1);
    return l;
   
	
	}
}
