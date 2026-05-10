package org.pavan;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

    @Override
    public void teach() {
        System.out.println("Math teacher is teaching math");
    }
}
