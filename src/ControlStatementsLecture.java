public class ControlStatementsLecture {
    public static void main(String[] args) {

        int i = 1;
        System.out.println("The loop hasn't started yet. The value of i is " + i);
        while (i < 10){
            System.out.println("Now I'm in the loop. i has incremented and it's value is " + i);
            i++;
            System.out.println("I'm still in the loop. i has incremented and its value is " + i);
        }
        System.out.println("the loop has ended because the condition has tested false. The value is " + i);

        for (int j = 0; j < 10; j++){
            System.out.println(j);
        }



    }
}
