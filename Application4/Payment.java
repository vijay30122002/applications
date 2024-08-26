package com.evergent.corejava.vijay.Application4;



class Payment implements PaymentModule {
    static int totalAmountBeforeDiscount;
    static int totalAmountAfterDiscount;

    @Override
    public void viewTotalAmount() {
        totalAmountBeforeDiscount = CourseSelection.courseCost;
        totalAmountAfterDiscount = CourseSelection.courseCost;
        System.out.println("Total Amount before Discount: Rs" + totalAmountBeforeDiscount);
        System.out.println("Total Amount after Discount: Rs" + totalAmountAfterDiscount);
    }

    @Override
    public void makePayment() {
        totalAmountAfterDiscount = CourseSelection.courseCost;
        System.out.println("Amount to be Paid after Discount: Rs" + totalAmountAfterDiscount);
    }
}