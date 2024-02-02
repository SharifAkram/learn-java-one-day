package org.example;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Chapter 3 Variables and Operators

        byte userAge = 20;
        short numberOfStudents = 45;
        int numberOfEmployees = 500;
        long numberOfInhabitants = 2102131012678L;

        float hourlyRate = 60.5F;
        double numberOfHours = 51250.5;

        char grade = 'A';
        boolean promote = true;

        byte level = 2, userExperience = 5;

        // Chapter 4 Arrays and Strings

        int[] arr1 = {0,2,4,6,8,10};
        int[] arr2 = {0,2,4,6,8,10};
        int[] arr3 = {10,20};

        boolean result1 = Arrays.equals(arr1, arr2);
        boolean result2 = Arrays.equals(arr1, arr3);
        System.out.println(result1);
        System.out.println(result2);

        int[] source = {1,2,3,4,5,6,7,8,9,10};
        int[] dest = Arrays.copyOfRange(source, 3, 7);
        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(dest));

        int[] myInt = {21, 22, 34, 45, 56, 78, 99};
        int foundIndex = Arrays.binarySearch(myInt, 78);
        int foundIndex2 = Arrays.binarySearch(myInt, 39);
        System.out.println(foundIndex);
        System.out.println(foundIndex2);

        // Chapter 5 Interactive Program

        System.out.println("Hello ");
        System.out.println("What's up?");

        System.out.print("Hello ");
        System.out.println("hi there!");

        System.out.println("Sharif".substring(1, 4));

        System.out.printf("The answer for %.3f divided by %d is %.2f.", 5.45, 3, 5.45/3);
        System.out.printf("\n%d", 12);
    }
}