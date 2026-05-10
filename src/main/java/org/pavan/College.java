package org.pavan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

    @Autowired
    private Principal principal;

    @Autowired
    private Teacher teacher;

    @Value("${college.name}")
    private String collegeName;

    public void test() {
        principal.principalInfo();
        teacher.teach();
        System.out.println("College Name: " + collegeName);
        System.out.println("testing college methods");
    }
}
