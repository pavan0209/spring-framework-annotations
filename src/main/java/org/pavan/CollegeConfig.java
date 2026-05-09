package org.pavan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {

    @Bean
    public College collegeBean() {        // method name = bean id
        College college = new College();
        return college;
    }
}
