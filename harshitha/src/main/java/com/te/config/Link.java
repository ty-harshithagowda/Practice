package com.te.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Import({ProjectConfig.class,TechnologyConfig.class})
@Configuration
public class Link {

}
