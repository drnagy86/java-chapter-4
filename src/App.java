/*
Author: Derrick Nagy
Date: 2021-03-25


Notes:

*** clean up scanners. Pass the scanner into the method. Neat!
*** get rid of the chapter methods I added
*** add a loop to milestone3, chapter 3
*/

import java.util.Scanner;
//import java.util.concurrent.ThreadLocalRandom;

class Chapter2 {
    void milestone1(int num) {
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    
    // Declare the Chapter 2 Milestone 2 method here
    void milestone2(double milestone2){
        
        /*
        Milestone 2:
        Iput a double value and print the integer part on one line and the first two digits after the decimal point on another line. You must use numeric casting to get credit.
        */

        // get double input
        //System.out.println("Milestone 2 \nPlease input a decimal number: ");
        

        // cast input as int, print
        int milestone2Cast = (int) milestone2;
        System.out.println(milestone2Cast);        

        // take input, minus itself cast as an int, the the value of the first two decimal places as an int
        double ms2Double = milestone2 - milestone2Cast;
        ms2Double *= 100;
        System.out.println((int)ms2Double);

    }

    // Declare the Chapter 2 Milestone 3 method here
    void milestone3(){


        /*
        Milestone 3:
        Write a program that finds all the prime numbers between 2 and 100. You must use a nested for loop and the % operator to get credit.
        */
        
        System.out.println("Milestone 3: \nAll prime numbers between 2 and 100.");

        for (int testNum = 2; testNum <=100; testNum++)
        {
            //for a hundred or so times, check to see if the count variable is
            // a prime number. If so, print it.
            //prime numbers can only be divided by one and itself

            // create a boolean to control the print statement. Starts true for
            // each test
            boolean prime = true;

            // inside loop that takes the test number and divides it for each
            // whole number up to half the test number
            for(int divisor = 2; divisor <= testNum/2; divisor++)
            {
                //test to see if there is ever a remainder, change prime to
                //false, stop the loop                
                if (testNum % divisor == 0) {
                    prime = false;
                    break;
                }
            }
            // if the divisor test never changes prime to false, print the
            //number
            if (prime)
            {
                System.out.print(testNum + " ");
            }                
                        
        }
        System.out.println();

    }
       
    // Declare the Chapter 2 Milestone 4 method here
    void milestone4(int seconds){
         /* 
        Milestone 4:
        Write a program that accepts an integer number of seconds and converts it into days, hours, minutes, and seconds.
        */
        
        // set up vars for seconds, minutes, hours, days and constants 
        int minutes, hours, days;
        
        // no longer needed for chapter 4 assignment
        //long seconds;

        final int SECONDS_IN_MINUTE = 60;
        final int SECONDS_IN_DAY = 86400;
        final int SECONDS_IN_HOUR = 3600;

        //get input
        System.out.println("Milestone 4:\nEnter a number for seconds: ");
        

        // no longer needed for chapter 4 assignment
        //seconds = scanner.nextLong();

        // days with the remainder cut off
        days = (int)(seconds / SECONDS_IN_DAY);

        // number of seconds left after removing days
        seconds %= SECONDS_IN_DAY;
        
        // number of hours after days are removed
        hours = (int)(seconds /SECONDS_IN_HOUR);

        // number of seconds left after removing hours
        seconds %= SECONDS_IN_HOUR;

        // number of minutes after hours are removed
        minutes = (int)(seconds / SECONDS_IN_MINUTE);

        // number of seconds left after removing minutes
        seconds %= SECONDS_IN_MINUTE;

        //Print the results
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

    }

    

}

public class App {
    
    static void chapter1milestone1(double num1, double num2) {
        System.out.print("Largest is: ");
        if (num1 > num2)
            System.out.println(num1);
        else
            System.out.println(num2);
    }
    
    // Declare the Chapter 1 Milestone 2 method here
    static void chapter1milestone2(double ms2FirstNumber, double ms2SecondNumber){

                /*
        Milestone 2
        Input two decimal numbers and print the average.
        */        

        //Calculate the average, format to two(?) decimal places
        double ms2Average = (ms2FirstNumber + ms2SecondNumber)/2;

        //print answer
        System.out.println("The average of " + ms2FirstNumber + " and " + 
            ms2SecondNumber + " is " + String.format("%.2f", ms2Average));
    }

    // Declare the Chapter 1 Milestone 3 method here
    static void chapter1milestone3(double radius){
        
        /* 
        Milestone 3
        Iput the radius of a circle and print the circumference and area. The answer should be a decimal value. The formula for circumference is 2*pi*r and the formaula for area is pi*r*r. You can use 3.14 for the vaule of pi in this activity.

        Notes:
        Round off the answer
        */

        //1. set the variables

        double circumference, area;
        final double pie = 3.14;
    

        //3. Perform the two calculations and display the anwser

        circumference = 2 * pie * radius;
        area = pie * (Math.pow(radius, 2));


        System.out.println("The circumference of this circle is approximately: " +
        String.format("%.2f", circumference));
        System.out.println("The area of this circle is approximately: " + String.format("%.2f", area));
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //Broke into pieces for the purpose of testing.

        chapter1Milestones(scanner);

        chapter2Milestones(scanner);

        chapter3Milestones(scanner);

        scanner.close();
    }

    static void chapter1Milestones(Scanner scanner){

        

        System.out.println("** CHAPTER 1 MILESTONE 1 **");
        System.out.println("Please enter two numbers:");
        double num1_1a = scanner.nextDouble();
        double num1_1b = scanner.nextDouble();
        // Call the Chapter 1 Milestone 1 method here
        chapter1milestone1(num1_1a, num1_1b);

        System.out.println("\n** CHAPTER 1 MILESTONE 2 **");
        System.out.println("Please enter two numbers:");
        double num1_2a = scanner.nextDouble();
        double num1_2b = scanner.nextDouble();
        // Call the Chapter 1 Milestone 2 method here
        chapter1milestone2(num1_2a, num1_2b);

        System.out.println("\n** CHAPTER 1 MILESTONE 3 **");
        System.out.print("Enter a radius: ");
        double radius = scanner.nextDouble();

        // I am confused about this because the circumference is calculated from the radius
        // System.out.print("Circumference: ");
        // double circumference = scanner.nextDouble();

        // Call the Chapter 1 Milestone 3 method here
        chapter1milestone3(radius);

    }

    static void chapter2Milestones(Scanner scanner){
        

        System.out.println("\n** CHAPTER 2 MILESTONE 1 **");
        System.out.println("Enter a Number:");
        int num2_1 = scanner.nextInt();
        // Call the Chapter 2 Milestone 1 method here
        Chapter2 chapter2 = new Chapter2();
        chapter2.milestone1(num2_1);

        System.out.println("\n** CHAPTER 2 MILESTONE 2 **");
        System.out.println("Please input a decimal number:");
        double num2_2 = scanner.nextDouble();
        // Call the Chapter 2 Milestone 2 method here
        chapter2.milestone2(num2_2);

        System.out.println("\n** CHAPTER 2 MILESTONE 3 **");
        // Call the Chapter 2 Milestone 3 method here
        chapter2.milestone3();

        System.out.println("\n** CHAPTER 2 MILESTONE 4 **");
        System.out.println("Enter a number for seconds:");
        int seconds = scanner.nextInt();
        // Call the Chapter 2 Milestone 4 method here
        chapter2.milestone4(seconds);


    }

    static void chapter3Milestones(Scanner scanner){
        
        Chapter3 chapter3 = new Chapter3();

        System.out.println("\n** CHAPTER 3 MILESTONE 1 **");
        System.out.println("Enter two numbers:");
        int num3_1a = scanner.nextInt();
        int num3_1b = scanner.nextInt();
        chapter3.milestone1(num3_1a, num3_1b);

        
        System.out.println("\n** CHAPTER 3 MILESTONE 2 **");
        //System.out.println("Enter a number:");

        //int num3_2 = scanner.nextInt();
        // Call the Chapter 3 Milestone 2 method here
        chapter3.milestone2(scanner);



        System.out.println("\n** CHAPTER 3 MILESTONE 3 **");
        // int min = 1;
        // int max = 12;
        // int randNum1 = ThreadLocalRandom.current().nextInt(min, max + 1);
        // int randNum2 = ThreadLocalRandom.current().nextInt(min, max + 1);
        // System.out.println(randNum1);
        // System.out.println(randNum2);
        // System.out.println("What is the product of these two numbers?");
        // int num3_3 = scanner.nextInt();

        // Call the Chapter 3 Milestone 3 method here
        chapter3.milestone3(scanner);






    }


}
