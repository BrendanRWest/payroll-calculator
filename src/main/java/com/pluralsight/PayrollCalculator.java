package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.nextLine();

        System.out.println("How many hours have you worked this week?");
        double hours = scan.nextDouble();

        System.out.println("What is your hourly pay rate?");
        double payRate = scan.nextDouble();

        double normalPay, overtimePay, grossPay, overtimeHours;

        if (hours > 40){
            overtimeHours = hours - 40;
            normalPay = 40 * payRate;
            overtimePay = overtimeHours * (1.5 * payRate);
            grossPay = normalPay + overtimePay;
        } else {
            grossPay = hours * payRate;
        }

        System.out.printf("Hello %s,, you made $%.2f this week.", name, grossPay);
        scan.close();
    }
}
