package root.java.rpg;

import java.util.Scanner;
//from tutorial
//https://www.youtube.com/watch?v=L4eqsWCvoB0&list=PLiuAYTl0L-gHgqyWtUKAAhtrTymOLHd28&index=2
public class GameLogic {
    static Scanner scanner = new Scanner(System.in);

    static Player player;

    public static boolean isRunning;

    //random encounters
    public static String[] encounters = {"Battle", "Battle", "Battle", "Rest", "Rest"};

    //enemy names
    public static String[] enemies = {"Angry Chihuahua", "Nuerolink Zombie", "Aggressive Squirrel", "Weaponized Roomba", "Pro Gamer", "Hungry Raccoon"};

    //Story elements
    public static int place = 0, act = 1;
    public static String[] places = {"The Parking Lot of Desolation", "The Dank Drainage Tunnels", "The Trailer Park of Sorrow", "Taco Bell"};

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
        System.out.println("Taco Quest");
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

        //print story intro
        Story.printIntro();

        //create new player object with the name
        player = new Player();

        //print Act 1
        Story.printFirstActIntro();

        //set isRunning to true, to continue the game loop
        isRunning = true;

        //start main game loop (next part)
        gameloop();
    }

    //changes the game value based on player xp
    public static void checkAct(){
        //updates act based on xp
        if(player.xp >= 10 && act == 1){
            //level up and advance plot and location
            act = 2;
            place = 1;
            Story.printFirstActOutro();
            player.chooseTrait();
            Story.printSecondActIntro();
            //assign new values to enemies
            enemies[0] = "Some Guy";
            enemies[1] = "Some Guy";
            enemies[2] = "Some Guy";
            enemies[3] = "Some Guy";
            enemies[4] = "Some Guy";
            //assign new values to encounters
            encounters[0] = "Battle";
            encounters[1] = "Battle";
            encounters[2] = "Battle";
            encounters[3] = "Rest";
            encounters[4] = "Shop";
            player.hp = player.maxHP;
        }else if(player.xp >= 50 && act == 2){
            //level up and advance plot and location
            act = 3;
            place = 2;
            Story.printSecondActOutro();
            player.chooseTrait();
            Story.printThirdActIntro();
            player.hp = player.maxHP;
        }else if(player.xp >= 100 && act == 3){
            //level up and advance plot and location
            act = 4;
            place = 3;
            Story.printThirdActOutro();
            player.chooseTrait();
            Story.printFourthActIntro();
            player.hp = player.maxHP;
            //boss battle
            //finalBattle();
        }
    }

    //random encounter generator
    public static void randomEncounter(){
        //random number between 0 and length of the encounters array
        //Math.random() returns a double, so it is changed to int here
        int encounter = (int) (Math.random()* encounters.length);
        if(encounters[encounter].equals("Battle")) {
            //randomBattle();
        }else if(encounters[encounter].equals("Rest")) {
            //rest();
        }else {
            //shop();
        }
    }


    //continue method
    public static void continueJourney(){
        //check what act we're in and see if it needs to get advanced
        checkAct();
        //check if game is not in last act
        if(act != 4)
            randomEncounter();
    }

    //printing character info
    public static void characterInfo(){
        clearConsole();
        printHeading("CHARACTER INFO");
        System.out.println(player.name + "\tHP: " + player.hp + "/" + player.maxHP);
        printSeparator(20);
        System.out.println("XP: " + player.xp);

        //player selected upgrades
        if(player.numAtkUpgrades > 0){
            System.out.println("Offensive trait: " + player.atkUpgrades[player.numAtkUpgrades - 1]);
            printSeparator(20);
        }
        if(player.numDefUpgrades > 0){
            System.out.println("Offensive trait: " + player.defUpgrades[player.numDefUpgrades - 1]);
        }
        anythingToContinue();
    }

    public static void randomBattle(){
        clearConsole();
        printHeading("You encountered an enemy, prepare for combat!");
        anythingToContinue();
        //generate an enemy
        battle(new Enemy(enemies[(int)(Math.random()* enemies.length)]), player.xp);
    }

    //battle method
    public static void battle(Enemy enemy){
        //main battle loop
        while(true){
            clearConsole();
            printHeading(enemy.name + "\nHP: " + enemy.hp + "/" + enemy.maxHP);
            printHeading(player.name + "\nHP: " + player.hp + "/" + player.hp);
            System.out.println("Choose an action: ");
            printSeparator(20);
            System.out.println("(1) Fight\n(2) Use Item\n(3) Run Away");
            int input = readInt("-> ", 3);
            //react to player input
            if(input == 1){
                //fight, calculate damage to player and enemy
                int dmg = player.attack() - enemy.defend();
                int dmgTaken = enemy.attack() - player.defend();
                //check if damage isn't negative
                if(dmgTaken < 0){
                    //automatic counter-attack if player defends well
                    dmg -= dmgTaken/2;
                    dmgTaken = 0;
                }
                if(dmg < 0)
                    dmg = 0;
                //deal damage to both characters

            }else if(input == 2){
                //item
            }else{
                //run away
            }
        }
    }

    //main menu
    public static void printMenu(){
        clearConsole();
        printHeading(places[place]);
        System.out.println("Choose an action: ");
        printSeparator(20);
        System.out.println("(1) Continue on your journey");
        System.out.println("(2) Character Info");
        System.out.println("(3) Exit Game");
    }

    //the main loop
    public static void gameloop(){
        while(isRunning){
            printMenu();
            int input = readInt("-> ", 3);
            if(input == 1)
                continueJourney();
            else if(input == 2)
                characterInfo();
            else
                isRunning = false;
        }
    }
}
