package org.pavan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.pavan")
public class CollegeConfig {
/*
    @Bean
    public Principal principalBean() {
        return new Principal();
    }

    @Bean
    public College collegeBean() {        // method name(collegeBean) = bean id
        College college = new College();
        college.setPrincipal(principalBean());
        college.setTeacher(mathTeacherBean());
        return college;
    }

    @Bean
    public Teacher mathTeacherBean() {
        return new MathTeacher();
    }
    */
}
