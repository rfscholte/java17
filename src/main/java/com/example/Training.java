package com.example;

import java.util.List;

public record Training(String name, List<Student> studentList) {
//    public Training {
//        if(studentList != null) {
//            studentList = List.copyOf( studentList );
//        }
//    }
}
