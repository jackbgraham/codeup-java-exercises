package grades;

import java.util.ArrayList;
import java.util.List;




public class Student {

    private String name;

    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.addAll(new ArrayList<>(List.of(grade)));
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        int total = 0;
        for (int i = 0; i < grades.size(); i++){
            total += grades.get(i);
        }
        return (double) total / grades.size();
    }
}
