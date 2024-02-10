package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = {10, 11, 12, 13, 14, 15};
        String userInput = "";

        while (!userInput.equalsIgnoreCase("exit")) {
            System.out.print("Please enter the index of the array (type 'exit' to quit): ");
            userInput = input.next();

            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int choice = Integer.parseInt(userInput);
                System.out.printf("numbers[%d] = %d%n", choice, numbers[choice]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Index is invalid.");
            } catch (NumberFormatException e) {
                System.out.println("Error: You did not enter an integer.");
            }
        }
    }
}
