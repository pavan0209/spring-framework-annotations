package org.pavan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//        Student pavan = context.getBean("student", Student.class);
//        pavan.displayInfo();

        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);

        College college = context.getBean("collegeBean", College.class);
        System.out.println(college);

    }
}