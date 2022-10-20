package root.java;

import java.util.Scanner;

public class ConsoleIOlecture {
    public static void main(String[] args) {
//        String cohort = "Weywot";
//        System.out.printf("Hello, %s", cohort); //%s, cohort refers to String cohort
//        //printf is used in several languages "print format"
//        System.out.println("this makes a new line, but printf() doesn't");
//
//        String timeOfDay = "morning";
//        System.out.printf("Good %s %s!%n", timeOfDay, cohort); //%n is line break
//        //when calling string variables, we use printf
//        float someNumber = 123.456F;
//        byte week = 10;
//        System.out.printf("This is the %dth week of %s cohort.%n", week, cohort);
//        // floats and doubles are called with %f, other numbers are called with %d (whole numbers)
//        System.out.printf("The number is %10.2f%n", someNumber); //10 character with two decimal spaces
//        System.out.printf("The number is %010.2f%n", someNumber);//the same, but spaces are replaced with leading zeros
//        System.out.printf("The number is %-10.2f test%n", someNumber); //left justified

        Scanner scanner = new Scanner(System.in);//this has created an instance of the Scanner class named "scanner"
        //a java library is a collection of packages
//        System.out.println("Enter a word:");
//        String userInput = scanner.next();
//        System.out.printf("Your word was %s.%n", userInput);

        System.out.println("Enter a sentence:");
        String userInput2 = scanner.nextLine();
        System.out.printf("printf - Your sentence was: %s%n", userInput2);
        System.out.println("println - Your sentence was: " + userInput2);

        System.out.println("Enter a number");
        int userNumber = scanner.nextInt();
        //or = Integer.parseInt(scanner.nextLine());
        System.out.printf("Your number was: %d", userNumber);

        //if you put scanner.next and then scanner.nextLine, both of those will draw from the same line entry

        //java apps can run on windows, mac and linux
        //java is a "higher level language" it is source code

        //class contains everything, has members
        //methods part of the class which does something
        //statements - tell the computer something
        //properties - store something

        //"public" access modifier, who can use it
        //"static" means no instance of this class is needed
        //"object" instance of a class
        //"main" this is the main method, it is required or the program will not run, main is not required if making a library

        //src folder contains source code
        //bin folder contains compiled code, I think out is the equivalent in IntelliJ, but maybe not

        // try catch prevents the system from throwing errors when the wrong data type is entered
        //the stuff below doesn't work correctly right now

//        int age;
//
//        System.out.println("Please enter your age:");
//        age = scanner.nextInt();
//
////        float floatAge;
//
//        try {
//            age = scanner.nextInt();
//        }
//        catch (NumberFormatException nfe) {
//            System.out.println("Hey, you didn't enter a number");
//        }
//        System.out.println("Your age is " + age);

    }
}
