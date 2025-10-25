package com.java.student;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Student a1 = new Student(1, "abc", 32, 33, 43, 44, 45);
        Student a2 = new Student(2, "A2", 23, 44, 5, 2, 6);
        Student a3 = new Student(3, "A3", 32, 33, 44, 55, 3);
        list.add(a1);
        list.add(a2);
        list.add(a3);
        
        System.out.println(list);
        int maxMarks = 0; 
        for (Student x : list) {
            int currentMarks = x.getTotalMarks(); 
            if (currentMarks > maxMarks) {
                maxMarks = currentMarks; 
            }
        }

        System.out.println("The maximum marks is: " + maxMarks);
    }
}
