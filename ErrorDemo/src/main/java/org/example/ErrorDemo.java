package org.example;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ErrorDemo {
    public static void main(String[] args) {

        double num, deno;

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Please enter the numerator: ");
            num = input.nextDouble();

            System.out.print("Please enter the denominator: ");
            deno = input.nextDouble();

            double result = num / deno;

            // Round to three decimal places
            DecimalFormat df = new DecimalFormat("#.###");

            System.out.println("The result is: " + df.format(result));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("---- End of Error Handling Example ----");
        }
    }
}
