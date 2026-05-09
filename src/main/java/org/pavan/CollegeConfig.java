package org.pavan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {

    @Bean
    public Principal principalBean() {
        return new Principal();
    }

    @Bean
    public College collegeBean() {        // method name(collegeBean) = bean id
        College college = new College();
        college.setPrincipal(principalBean());
        return college;
    }
}
