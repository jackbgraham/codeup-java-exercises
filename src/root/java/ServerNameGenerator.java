package root.java;

import java.util.Random;

public class ServerNameGenerator {
    String[] adjectives = {"voracious ", "wicked ", "terrible ", "noxious ", "spicy ", "iron ", "saucy ", "rabid ", "hungry ", "putrid "};
    String[] nouns = {"wombat", "possum", "shrew", "tenerek", "nutria", "capybara", "rat", "porcupine" , "hedgehog", "armadillo"};

    private String name;
    public String getName(){
        return name;
    }
    public static String getRandomElement(String[] array) {
        Random generator = new Random();
        int randomIndex = generator.nextInt(array.length);
        return array[randomIndex];
    }
    public ServerNameGenerator(){
        String adjective = getRandomElement(adjectives);
        String noun = getRandomElement(nouns);
        String combined = adjective + noun;
        this.name = combined;
    }
    public String toString(){
        return name;
    }
}
