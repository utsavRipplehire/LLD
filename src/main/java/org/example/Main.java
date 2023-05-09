package org.example;

import scalar.lld.scalar.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Student s = new Student("Tatia Tope", "tatia@gmail.com", 99, "AprilBatchName", 123L, "7521936988");
        s.printDetails();
        System.out.println(s.getStudentStatus());
        System.out.println(s.getRollNumber());
        ArrayList<Integer> randomList= null;
        randomList.add(1);
        //sdfsdf
    }
}