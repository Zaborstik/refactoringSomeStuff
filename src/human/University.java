package src.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private int age;

    private List<Student> students = new ArrayList<>();

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        for (Student student :
                students) {
            if (student.getAverageGrade()==averageGrade){
                return student;
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        double max = 0;
        for (Student student :
                students) {
            if (max<student.getAverageGrade()){
                max=student.getAverageGrade();
            }
        }
        for (Student student :
                students) {
            if (student.getAverageGrade() == max){
                return student;
            }
        }
        return null;
    }

    public Student getStudentWithMinAverageGrade() {
        double min = 100000;
        for (Student student :
                students) {
            if (min > student.getAverageGrade()) {
                min = student.getAverageGrade();
            }
        }
        for (Student student :
                students) {
            if (min == student.getAverageGrade()) {
                return student;
            }
        }
        return null;
    }

    public void expel(Student student){
        students.remove(student);
    }
}