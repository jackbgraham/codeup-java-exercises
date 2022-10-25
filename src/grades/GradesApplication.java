package grades;
import java.util.HashMap;
import java.util.Scanner;
public class GradesApplication {
    public static void main(String[] args){

        Student student1 = new Student("Alejandro");
        student1.addGrade(40);
        student1.addGrade(85);
        student1.addGrade(78);
        student1.addGrade(99);
        Student student2 = new Student("Steve-Dave");
        student2.addGrade(88);
        student2.addGrade(90);
        student2.addGrade(79);
        student2.addGrade(96);
        Student student3 = new Student("Regis");
        student3.addGrade(99);
        student3.addGrade(80);
        student3.addGrade(86);
        student3.addGrade(69);
        Student student4 = new Student("Pete");
        student4.addGrade(93);
        student4.addGrade(66);
        student4.addGrade(87);
        student4.addGrade(93);

        HashMap<String, Student> students = new HashMap<>();

        // Add keys and values (github UN, student obj)
        students.put("Robtastic1992", student1);
        students.put("PenguinsFan99", student2);
        students.put("DarkLord11", student3);
        students.put("ToasterStrudel4Eva", student4);
        System.out.println(students);
//
//Print the list of GitHub usernames out to the console, and ask the user which student they would like to see more information about. The user should enter a GitHub username (i.e. one of the keys in your map). If the given input does not match up with a key in your map, tell the user that no users with that username were found. If the given username does exist, display information about that student, including their name and their grades.
//
//After the information is displayed, the application should ask the user if they want to continue, and keep running so long as the answer is yes.

        System.out.println("Student Usernames:");
        System.out.println("Robtastic1992 | PenguinsFan99 | DarkLord11 | ToasterStrudel4Eva");
        System.out.println("View Username data? y/n");
        Scanner sc = new Scanner(System.in);
        String yesOrNo = "y";
        while (yesOrNo.equalsIgnoreCase("y")){
            System.out.println("Enter a username:");
            String userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("Robtastic1992")) {
                System.out.println("Name: " + student1.getName());
                System.out.println("Grades: " + student1.getGrades());
                System.out.println("GPA: " + student1.getGradeAverage());
            } else if(userInput.equalsIgnoreCase( "PenguinsFan99")) {
                System.out.println("Name: " + student2.getName());
                System.out.println("Grades: " + student2.getGrades());
                System.out.println("GPA: " + student2.getGradeAverage());
            } else if(userInput.equalsIgnoreCase( "DarkLord11")) {
                System.out.println("Name: " + student3.getName());
                System.out.println("Grades: " + student3.getGrades());
                System.out.println("GPA: " + student3.getGradeAverage());
            } else if(userInput.equalsIgnoreCase( "ToasterStrudel4Eva")) {
                System.out.println("Name: " + student4.getName());
                System.out.println("Grades: " + student4.getGrades());
                System.out.println("GPA: " + student4.getGradeAverage());
            } else {
                System.out.println("not a valid username");
            }
            System.out.println("Would you like to view another student? y/n");
            yesOrNo = sc.nextLine();
        }








    }
}
