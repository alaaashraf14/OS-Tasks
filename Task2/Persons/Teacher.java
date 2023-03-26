package Persons;
import java.util.ArrayList;

public class Teacher extends Person{
    public Teacher(String name, String address) {
        super(name, address);
    }
    int numCourses=0;
    ArrayList<String> courses = new ArrayList<>();

    public boolean addCourse(String course){
        if (!courses.contains(course)){
            courses.add(course);
            numCourses+=1;
            return true;
        }
        return false;
    }
    public boolean removeCourse(String course){
        if (courses.contains(course)){
            courses.remove(course);
            numCourses-=1;
            return true;
        }
        return false;
    }
    @Override
    public String ToString(){
        return "Teacher name: "+ getName() +", Address= "+ getAddress();
    }
}