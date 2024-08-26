package com.evergent.corejava.vijay.Application4;

import java.util.Scanner;


public class CourseManagementSystem extends BaseModule {
    @Override
    public void showMenu() {
        System.out.println("======================");
        System.out.println(" CMS Main Menu");
        System.out.println("======================");
        System.out.println("C - Course Selection Module");
        System.out.println("S - Student Management Module");
        System.out.println("P - Payment Module");
        System.out.println("E - Quit Module");
        System.out.println("======================");
        System.out.println("Enter your Module (C, S, P, E): ");
    }

    public static void main(String[] args) {
        CourseManagementSystem cms = new CourseManagementSystem();
        cms.displayWelcomeMessage();
        Scanner scanner = new Scanner(System.in);
        CourseSelection courseSelection = new CourseSelection();
        StudentManagement studentManagement = new StudentManagement();
        Payment payment = new Payment();

        while (true) {
            cms.showMenu();
            String module = scanner.nextLine().toUpperCase();
            System.out.println("You entered module: " + module);
            switch (module) {
                case "C":
                    courseSelection.selectCourse();
                    break;
                case "S":
                    System.out.println(" Student Management Module");
                    System.out.println("======================");
                    System.out.println("A - Add Student");
                    System.out.println("V - View Student");
                    System.out.println("======================");
                    System.out.println("Enter your Student option (A, V): ");
                    String studentOption = scanner.nextLine().toUpperCase();
                    switch (studentOption) {
                        case "A":
                            studentManagement.addStudent();
                            break;
                        case "V":
                            studentManagement.viewStudent();
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    break;
                case "P":
                    System.out.println(" Payment Module");
                    System.out.println("======================");
                    System.out.println("V - View Total Amount to be Paid");
                    System.out.println("P - Make Payment");
                    System.out.println("======================");
                    System.out.println("Enter your Payment option (V, P): ");
                    String paymentOption = scanner.nextLine().toUpperCase();
                    switch (paymentOption) {
                        case "V":
                            payment.viewTotalAmount();
                            break;
                        case "P":
                            payment.makePayment();
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    break;
                case "E":
                    System.out.println("Exiting the system...");
                    System.out.println("Thank you visit again");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid module. Please try again.");
                    
            }
        }}}