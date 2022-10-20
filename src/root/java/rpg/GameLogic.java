package root.java.rpg;
import java.util.Scanner;
//from tutorial
//https://www.youtube.com/watch?v=L4eqsWCvoB0&list=PLiuAYTl0L-gHgqyWtUKAAhtrTymOLHd28&index=2
public class GameLogic {
    static Scanner scanner = new Scanner(System.in);

    static Player player;

    public static boolean isRunning;

    //take user input
    public static int readInt(String prompt, int userChoices){
        int input;

        do {
            System.out.println(prompt);
            try{
                input = Integer.parseInt(scanner.next());
            }catch(Exception e){
                input = -1;
                System.out.println("Please enter an integer");
            }

        }while(input < 1 || input > userChoices);
        return input;
    }

    //simulate clearing the console by printing a bunch of blank lines
    public static void clearConsole(){
        for(int i = 0; i < 100; i++)
            System.out.println();
    }

    //print a separator with length of n
    public static void printSeparator(int n){
        for(int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }

    //print a heading
    public static void printHeading(String title){
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
    }

    //method to wait on user input
    public static void anythingToContinue(){
        System.out.println("\nEnter anything to continue...");
        scanner.next();
    }

    //start the game
    public static void startGame(){
        boolean nameSet = false;
        String name;
        //print title
        clearConsole();
        printSeparator(40);
        printSeparator(30);
        System.out.println("Gobbo Adventure");
        System.out.println("a text based RPG");
        printSeparator(30);
        printSeparator(40);
        anythingToContinue();

        //get player name entry
        do{
            clearConsole();
            printHeading("What's your name?");
            name = scanner.next();
            //double check
            clearConsole();
            printHeading("Your name is " + name + ".\n Is that right?");
            System.out.println("(1) Yes");
            System.out.println("(2) No, I changed my mind");
            int input = readInt("-> ", 2);
            if(input == 1)
                nameSet = true;
        }while(!nameSet);

        //create new player object with the name
        player = new Player();

        //set isRunning to true, to continue the game loop
        isRunning = true;

        //start main game loop (next part)
        gameloop();
    }
    public static void gameloop(){

    }
}