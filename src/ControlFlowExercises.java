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

        for (int i = 0; i < 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0){
                    System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                    System.out.println("Buzz");
            }
            else {
                    System.out.println(i);
                    }
                }


    }
}
