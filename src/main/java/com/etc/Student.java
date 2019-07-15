package com.etc;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;

    public Student(){
        System.out.println("Student的无参构造");
    }
    public Student(String name) {
        System.out.println("Student的有参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
