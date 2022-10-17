import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        String resp1 = "Sure"; // user input ends with question mark
        String resp2 = "Whoa, chill out!"; // user input ends with exclamation mark
        String resp3 = "Fine. Be that way!"; //empty user input
        String resp4 = "whatever"; // all other input
        Scanner sc = new Scanner(System.in);

        System.out.println("Bob is a poorly made chatbot, talk to Bob");
        String userInput = sc.next();

        if(userInput.contains("?")){
            System.out.println(resp1);
        }
        else if(userInput.contains("!")){
            System.out.println(resp2);
        }
        else if(userInput.contains("")){
            System.out.println(resp3);
        }
        else{
            System.out.println(resp4);
        }


    }
}
