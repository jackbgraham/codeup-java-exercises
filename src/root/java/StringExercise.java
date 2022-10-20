package root.java;

public class StringExercise {
    public static void main(String[] args) {

        String string1 = "We don't need no education \nWe don't need no thought control";
        // the escape character \ and n create a new line
        System.out.println(string1);

        String string2 = "Check \"this\" out!, \" inside of the \"s! ";
        // the escape character \ before a quote "  allows the quotes to be displayed inside the string
        System.out.println(string2);

        String string3 = "In windows, the main drive is usually C:\\ ";
        // an escape character \ before the slash \ allows it to be displayed
        System.out.println(string3);

        String string4 = "I can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\!";
        System.out.println(string4);
    }

}
