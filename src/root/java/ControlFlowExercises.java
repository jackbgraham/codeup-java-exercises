package root.java;

import java.util.Formatter;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //For all of the following exercises, create a new class named ControlFlowExercises with a main method.
        // After each exercise, commit your changes, then replace your code in the main method with the next exercise.

/////Section 1//////Loop Basics//////////////////
//    int i = 5;
//    while (i <= 15){
//        System.out.println("loop time bebe " + i);
//        i++;
//    };
////////////////////////////////////////
//        for (int m = 5; m <= 15; m++){
//            System.out.println(m);
//        }
//////////////////////////////////////
//    int j = 0;
//        do{
//            System.out.println(j);
//            j = j+2;
//        }while(j<=100);
///////////////////////////////////////
//          for (int n = 0; n <= 100; n+=2){
//               System.out.println(n);
//          }
///////////////////////////////////////
//        int k = 100;
//        do{
//            System.out.println(k);
//            k = k-5;
//        }while(k>= -10);
//////////////////////////////////////
//        for (int o = 100; o >= -10; o-=5){
//            System.out.println(o);
//        }
///////////////////////////////////////
//        long l = 2;
//        do{
//            System.out.println(l);
//            l = l*l;
//        }while(l<1000000);
//////////////////////////////////////
//        for (long p = 2; p < 1000000; p*=p){
//            System.out.println(p);
//        }
/////Section 2//////Fizzbuzz//////////////////
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for (int i = 0; i < 100; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("FizzBuzz");
//            }
//            else if (i % 3 == 0){
//                    System.out.println("Fizz");
//            }
//            else if(i % 5 == 0){
//                    System.out.println("Buzz");
//            }
//            else {
//                    System.out.println(i);
//                    }
//                }
/////Section 3//////Display Table of Powers//////////////////

        //formatter and scanner utils imported at top of document

        //example array below
        //int num[] = {10, 21, 13, 4, 15, 6, 27, 8, 19};

//        Formatter fmt = new Formatter();
//        Scanner scanner = new Scanner(System.in);
////        int num[] = {1};
//        String userChoice;
//            do {
//                System.out.println("Enter an integer:");
//                int userInput = scanner.nextInt();
//                System.out.println("Here's your table");
//                System.out.println("");
//                System.out.println("number | squared | cubed");
//                System.out.println("------ | ------- | ------");
//                for (int i = 1; i <= userInput; i++) {
//                    System.out.printf("%-7d| %-8d| %-7d%n", i, i * i, i * i * i);
//                }
//                System.out.println("continue? (y/n)");
//                userChoice = scanner.next();
//            } while (userChoice.equals("y"));

//below is a frankensteined mess
//        //table generator for loop goes here
//
//        fmt.format("%15s %15s %15s\n", "Number", "Square", "Cube");
//        for (int n : num)
//        {
//            fmt.format("%14s %14s %17s\n", n, (n*n), (n*n*n));
//        }
//        System.out.println(fmt);
//
//
//        System.out.println("Would you like to enter a new integer for the table?");
//        System.out.println("y/n?");
//        // add an if statement here
//        // y = enter your number, then add number to the num[] array
//        // n = print table and break
//
//        String yn = scanner.nextLine();
//        if (yn == "y"){
//            System.out.println("Enter an integer: ");
//            //num[i] = input.nextInt();
//            String skipLine = scanner.nextLine();
//        }
/////Section 4//////Convert given number grades into letter grades//////////////////

        System.out.println("Enter a numerical grade from 0 to 100:");
        Scanner scanner = new Scanner(System.in);
        byte grade = scanner.nextByte();
        char letterGrade;
        if (grade >= 0 && grade <= 59){
            letterGrade = 'F';
        } else if (grade > 59 && grade <= 66){
            letterGrade = 'D';
        } else if (grade > 66 && grade <= 79){
            letterGrade = 'C';
        } else if (grade > 79 && grade <= 87){
            letterGrade = 'B';
        } else {
            letterGrade = 'A';
        }
        System.out.println("The letter grade is " + letterGrade);





    }
}
