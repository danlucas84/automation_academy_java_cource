package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {

        // 1 get number of hours worked
        System.out.println("Enter number of hours the Employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // 2 get hourly pay rate
        System.out.println("Enter the Employee's pay rate.");
        double payRate = scanner.nextDouble();
        scanner.close();

        // 3 multiplay hours and pay rate


        double grossPay = hours * payRate;

        // 4 display result
        System.out.println("Total gross pay is:" + grossPay);


    }
}
