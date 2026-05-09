package org.pavan;

import org.springframework.beans.factory.annotation.Value;

public class Student {

    private String name;
    private String interestedCourse;
    private String hobby;

    @Value("${student.name}")
    public void setName(String name) {
        this.name = name;
    }

    @Value("${student.interestedCourse}")
    public void setInterestedCourse(String interestedCourse) {
        this.interestedCourse = interestedCourse;
    }

    @Value("${student.hobby}")
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public String getInterestedCourse() {
        return interestedCourse;
    }

    public String getHobby() {
        return hobby;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "\nInterestedCourse: " + interestedCourse + "\nHobby: " + hobby);
    }
}
