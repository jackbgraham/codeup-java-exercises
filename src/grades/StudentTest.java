package grades;

public class StudentTest {

    public static void main(String[] args){
        Student Bob = new Student("Bob");
        Bob.addGrade(10);
        Bob.addGrade(100);
        Bob.addGrade(50);
        System.out.println(Bob.getGrades());
        System.out.println(Bob.getGradeAverage());

        Student Roberto = new Student("Roberto");
        Bob.addGrade(15);
        Bob.addGrade(90);
        Bob.addGrade(70);
        System.out.println(Bob.getGrades());
        System.out.println(Bob.getGradeAverage());

        Student Tony = new Student("Tony");
        Bob.addGrade(40);
        Bob.addGrade(100);
        Bob.addGrade(90);
        System.out.println(Bob.getGrades());
        System.out.println(Bob.getGradeAverage());

        Student Sue = new Student("Sue");
        Bob.addGrade(19);
        Bob.addGrade(14);
        Bob.addGrade(57);
        System.out.println(Bob.getGrades());
        System.out.println(Bob.getGradeAverage());
    }
}
