package org.example;

public class ObjectOrientedDemo {
    public static void main(String[] args)
    {
        Staff staff1 = new Staff("Madison");
        staff1.setHoursWorked(173);
        int pay = staff1.calculatePay(2500,400);
        System.out.println("Pay = " + pay);

        Staff staff2 = new Staff("Nikita", "Palmer");
        staff2.setHoursWorked(125);
        pay = staff2.calculatePay();
        System.out.println("Pay = " + pay);
    }
}
