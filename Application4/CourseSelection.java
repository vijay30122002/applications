package com.evergent.corejava.vijay.Application4;

import java.util.Scanner;

import com.evergent.corejava.vijay.Application4.CourseSelectionModule;

class CourseSelection implements CourseSelectionModule {
    static int courseCost;
    static String courseName;
    static String courseDescription;

    @Override
    public void selectCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Course Selection Module");
        System.out.println("======================");
        System.out.println("1 - Java Programming (Rs1500)");
        System.out.println("2 - Data Structures (Rs1200)");
        System.out.println("3 - Web Development (Rs1800)");
        System.out.println("======================");
        System.out.println("Enter your Course option (1, 2, 3): ");
        String option = scanner.nextLine();
        switch (option) {
            case "1":
                courseCost = 1500;
                courseName = "Java Programming";
                courseDescription = "Learn Java programming from scratch.";
                break;
            case "2":
                courseCost = 1200;
                courseName = "Data Structures";
                courseDescription = "Understand the fundamental data structures.";
                break;
            case "3":
                courseCost = 1800;
                courseName = "Web Development";
                courseDescription = "Build modern web applications.";
                break;
            default:
                System.out.println("Invalid option. Defaulting to Java Programming.");
                courseCost = 1500;
                courseName = "Java Programming";
                courseDescription = "Learn Java programming from scratch.";}
        
        
        System.out.println("Selected Course: " + courseName);
        System.out.println("Course Description: " + courseDescription);
        System.out.println("Course Cost: Rs" + courseCost);
    
}}

