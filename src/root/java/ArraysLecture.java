package root.java;

import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[5];
        numbers[0] = 78;
        numbers[1] = 253;
        numbers[2] = 48;
        numbers[3] = 98;
        numbers[4] = 55;
        System.out.println(numbers[0]);
        Arrays.sort(numbers);
        System.out.println(numbers[0]);
        System.out.println(Arrays.toString(numbers));

        String[] wordsForWeird = {"strange", "odd", "gharib", "unusual", "peculiar"};
        System.out.println(wordsForWeird[2]);

        for (String wordForWeird : wordsForWeird){
            System.out.println(wordForWeird);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        for (int i = 0; i < numbers.length; i++){
            System.out.printf("the number at index %d is %d%n", i, numbers[i]);
        }

    }
}
