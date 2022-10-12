import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter an integer:");
        int userInteger = scanner.nextInt();
        System.out.printf("You entered %d%n", userInteger);

        System.out.println("Enter three words:");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.printf("%s%n%s%n%s%n", word1, word2, word3);
        System.out.println(word1 + word2 + word3);
        String ghosty = scanner.nextLine();

        System.out.println("enter a sentence here bud: ");
        String userSentence = scanner.nextLine();
        System.out.println("you typed: " + userSentence + " (excellent sentence choice bud)");

        System.out.println("Now we calculatin', buckle up chuck...");
        System.out.println("enter the width of a wall in your classroom: ");
        int widthS1 = Integer.parseInt(scanner.nextLine());
        System.out.println("enter the width of the wall adjoining at the corner: ");
        int widthS2 = Integer.parseInt(scanner.nextLine());
        int perimeter = widthS1 * 2 + widthS2 * 2;
        System.out.println("The perimeter of the classroom is " + perimeter);



    }
}
