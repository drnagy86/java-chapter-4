import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Chapter3 {
    // Declare the Chapter 3 Milestone 1 method here
    
    public void milestone1(int num1, int num2){
        
    /*
    Milestone 1: Ask the user for two numbers. Print only the even numbers between them. Break the loop when the number printed is divisible by the first number entered.
    */

        System.out.println("Results:");
        for (int i = num1 +1 ; i < num2; i++) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
            if(i % num1 == 0){
                break;
            }
        }

    }

    // Declare the Chapter 3 Milestone 2 method here
    public void milestone2(Scanner scanner){
    /*
    MileStone 2:
    Write a program that will input a list of integers in from the keyboard. When the user enters a negative number, print the average rounded to 2 decimal places.

    */

    System.out.println("Enter a list of positive integers, pressing \"Enter\" after each. \nEnter a negative number to recieve the average rounded to two decimal places.");

    int total = 0;
    double count = 0.0;

    

    do {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num < 0) {
            break;
        }else{
            total += num;
            count ++;
        }
        


    } while (true);

    // make sure there is not a divide by zero error
    if (count == 0) {
        count = 1;
    }

    

    BigDecimal average = new BigDecimal(total/count)
        .setScale(2, RoundingMode.HALF_EVEN);
        
    

    System.out.println("Total is: " + total + "\nCount of numbers: " +
        count + "\nAverage is : " + average);

        

    

    }

    public void milestone3(Scanner scanner) {
        int num1 = ThreadLocalRandom.current().nextInt(1, 13);
        int num2 = ThreadLocalRandom.current().nextInt(1,13);
        String num1Display, num2Display;

        
        // format num1 with a space if needed
        if (num1 < 10) {
            num1Display = " " + num1;
        } else {
            num1Display = "" + num1;
        }

        // format num2 with a space if needed
        if (num2 < 10) {
            num2Display = " " + num2;
        } else {
            num2Display = "" + num2;
        }

        // make the display for multiplication friendly
        if (num1 >= num2 ) {
            System.out.println(" " + num1Display);
            System.out.println((char)27 + "[4mx" + num2Display);
            System.out.print((char)27 + "[0m");
        } else {
            System.out.println(" " + num2Display);
            System.out.println((char)27 + "[4mx" + num1Display);
            System.out.print((char)27 + "[0m");
        }

        
        for (int i = 2; i >= 0; i--) {
            
            //place cursor
            if (num1*num2 < 10) {
                System.out.print("  ");
            } else if (num1*num2 < 100){
                System.out.print(" ");
            }

            // get answer
            int guess = scanner.nextInt();
            if (guess == num1*num2) {
                System.out.println("Correct!");
                break;

            }else if(i == 2 || i == 1){
                
                String attempts = "attempts";

                if (i == 1) {
                    attempts = "attempt";
                }
                System.out.println("Incorrect. You have " + i + " " + attempts
                    + " remaining.");

            }else{
                System.out.println("Incorrect. The answer was " + (num1*num2
                    + "."));
            }

        }
    }

    // Declare the Chapter 3 Milestone 4 method here
}