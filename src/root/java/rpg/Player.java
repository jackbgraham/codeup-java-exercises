package root.java.rpg;



public class Player extends Character {
    //integers to store number of upgrades/skills in each path
    public int numAtkUpgrades, numDefUpgrades;

    //Array to store skill names/stat upgrades
    public String[] atkUpgrades = {"Str +1", "Str +2", "Str +3", "Str +4"};
    public String[] defUpgrades = {"Def +1", "Def +2", "Def +3", "Def +4"};

    //Player specific constructor
    public Player(){
        super();
        this.name = "";
        this.maxHP = 100;
        this.xp = 0;
        //super accesses the properties of the superclass

        //unlockable upgrades
        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0;
        //let the player choose a starting bonus
        chooseTrait();
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }

    public void chooseTrait(){
        GameLogic.clearConsole();
        GameLogic.printHeading("Choose a trait: ");
        System.out.println("(1) " + atkUpgrades[numAtkUpgrades]);
        System.out.println("(2) " + defUpgrades[numDefUpgrades]);
        //get player choice
        int input = GameLogic.readInt("-> ", 2);
        GameLogic.clearConsole();
        //deal with both cases
        if(input == 1){
            GameLogic.printHeading("You chose " + atkUpgrades[numAtkUpgrades] + "!");
            numAtkUpgrades++;
        }else{
            GameLogic.printHeading("You chose " + defUpgrades[numDefUpgrades] + "!");
            numDefUpgrades++;
        }
        GameLogic.anythingToContinue();
    }
}
