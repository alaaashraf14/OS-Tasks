package Persons;

import java.util.ArrayList;

public class Student extends Person{
    public Student(String name, String address) {
        super(name, address);
    }
    private int numCourses=0;

    ArrayList<String> courses = new ArrayList<>();
    ArrayList<Integer> grades = new ArrayList<>();
    public void addCourseGrade(String course,int grade) {
        if (!courses.contains(course)){
            courses.add(course);
            numCourses+=1;
    }
        int i=courses.indexOf(course);
        grades.add(i,grade);
    }
    public void printGrades(){
        System.out.println(courses);
        System.out.println(grades);

    }
    public double getAverageGrade() {
        int sum = 0;
        if (!grades.isEmpty()) {
            for (Integer number : grades) {
                sum += number;
            }
        }
        return sum / numCourses;
    }
    @Override
    public String ToString(){
        return "Student name: "+ getName() +", Address= "+ getAddress();
}
    }