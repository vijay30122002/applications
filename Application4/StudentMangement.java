package com.evergent.corejava.vijay.Application4;

import java.util.Scanner;

import com.evergent.corejava.ram.Application1.StudentManagementModule;

class StudentManagement implements StudentManagementModule {
    private String studentName;
    private int studentID;

    @Override
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Add Student Module");
        System.out.println("======================");
        System.out.println("Enter student name: ");
        studentName = scanner.nextLine();
        System.out.println("Enter student ID: ");
        studentID = Integer.parseInt(scanner.nextLine());
        System.out.println("Student added successfully!");
    }

    @Override
    public void viewStudent() {
        System.out.println(" View Student Module");
        System.out.println("======================");
        if (studentName == null || studentID == 0) {
            System.out.println("No student added yet.");
        } else {
            System.out.println("Student:");
            System.out.println("- " + studentName + " (ID: " + studentID + ")");
        }
    }
}