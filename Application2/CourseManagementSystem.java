package com.evergent.corejava.vijay.Application2;



import java.io.IOException;
import java.util.Scanner;

public class CourseManagementSystem {

    enum Module {R, P, S, E};  // R - Register, P - Payment, S - Report, E - Exit
    enum Submodule1 {C, M};    // C - Choose Course, M - Main Menu
    enum Submodule2 {T, M};    // T - Total Amount, M - Main Menu
    enum Submodule3 {I, S, M}; // I - Invoice, S - Summary, M - Main Menu
    static int courseCost;
    static int totalAmount;
    static int discountAmount;

    public static void main(String[] args) throws IOException {
        String module = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\t\t\t\t Welcome To COURSE MANAGEMENT SYSTEM");

        while (true) {
            System.out.println("======================");
            System.out.println(" CMS Main Menu");
            System.out.println("======================");
            System.out.println("R-Register Module");
            System.out.println("P-Payment Module");
            System.out.println("S-Report Module");
            System.out.println("E-Exit Module");
            System.out.println("======================");
            System.out.println("welcome to Naresh technologies"	);
            System.out.println("Enter your Module code (R, P, S, E) : ");

            module = scanner.nextLine();
            System.out.println("You entered module is  : ");

            switch (Module.valueOf(module)) {
                case R:
                    System.out.println(" Register Module");
                    System.out.println("======================");
                    System.out.println("C-to choose a course");
                    System.out.println("M-Return to Main Menu");
                    System.out.println("======================");
                    System.out.println("Enter your Module code (C, M) : ");

                    module = scanner.nextLine();
                    switch (Submodule1.valueOf(module)) {
                        case C:
                            System.out.println("Courses \t Description  \t Cost ");
                            System.out.println("===============================================");
                            System.out.println("1 \t PYTHON Programming \t\t Rs3000.00");
                            System.out.println("2 \t Web Development \t\t Rs4000.00");
                            System.out.println("3 \t Data Science \t\t\t Rs5000.00");
                            System.out.println("===============================================");
                            System.out.println("Enter your Course code (1, 2, 3) : ");

                            module = scanner.nextLine();
                            switch (Integer.parseInt(module)) {
                                case 1:
                                    courseCost = 3000;
                                    break;
                                case 2:
                                    courseCost = 4000;
                                    break;
                                case 3:
                                    courseCost = 5000;
                                    break;
                            }

                            System.out.println("Enter the number of students you want to register for:");
                            int students = Integer.parseInt(scanner.nextLine());
                            System.out.println("You selected for" + students);
                            totalAmount = courseCost * students;

                            System.out.println("Total cost for selected courses before discount is RM" + totalAmount);
                            if (students == 1)
                                discountAmount = totalAmount;
                            else if (students == 2)
                                discountAmount = (int) (totalAmount - (totalAmount * 0.05));
                            else if (students >= 3)
                                discountAmount = (int) (totalAmount - (totalAmount * 0.10));

                            System.out.println("Total cost for selected courses after discount is RM" + discountAmount);
                            break;

                        case M:
                            System.out.println("Returning to Main Menu...");
                            break;
                    }
                    break;

                case P:
                    System.out.println(" Payment Module");
                    System.out.println("======================");
                    System.out.println("T-to display total amount to be paid");
                    System.out.println("M-Return to Main Menu");
                    System.out.println("======================");
                    System.out.println("Enter your Module code (T, M) : ");

                    module = scanner.nextLine();
                    switch (Submodule2.valueOf(module)) {
                        case T:
                            System.out.println("Total Amount to be Paid: Rs" + discountAmount);
                            break;

                        case M:
                            System.out.println("Returning to Main Menu...");
                            break;
                    }
                    break;

                case S:
                    System.out.println(" Report Module");
                    System.out.println("======================");
                    System.out.println("I-to display invoice");
                    System.out.println("S-to display summary");
                    System.out.println("M-Return to Main Menu");
                    System.out.println("======================");
                    System.out.println("Enter your Module code (I, S, M) : ");

                    module = scanner.nextLine();
                    switch (Submodule3.valueOf(module)) {
                        case I:
                            System.out.println("Invoice Display");
                            System.out.println("==================");
                            System.out.println("Course Selected: " + (courseCost == 3000 ? "Java Programming" : courseCost == 4000 ? "Web Development" : "Data Science"));
                            System.out.println("Total Amount to be Paid: Rs" + discountAmount);
                            break;

                        case S:
                            System.out.println("Summary Of Registration");
                            System.out.println("======================");
                            System.out.println("Courses Selected: " + (courseCost == 3000 ? "Java Programming" : courseCost == 4000 ? "Web Development" : "Data Science"));
                            System.out.println("Total Cost: Rs" + totalAmount);
                            System.out.println("Discounted Amount: Rs" + discountAmount);
                            break;

                        case M:
                            System.out.println("Returning to Main Menu...");
                            break;
                    }
                    break;

                case E:
                    System.out.println("Exit Module");
                    System.exit(0);
                    break;
            }
      
        }
    }
}
