package class9;

import java.util.Scanner;

public class CodingTask6 {
    //Write a java program to check whether a given number is prime or not?
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number");
        int number  = input.nextInt();
        int counter = 0;
        for (int i = number; i >= 1; i--) {
            if (number % i == 0) {
                counter +=  1;
            }
        }
        if (counter == 2) {
            System.out.println( number + " is a prime number");
        } else {
            System.out.println( number  + " is not a prime number");
        }

    }


}
