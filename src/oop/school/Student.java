package oop.school;

public class Student extends Person{
    private double gpa;
    private static int totalStudents;

    public Student(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
        totalStudents++;
    }
    public static int getTotalStudents(){
        return totalStudents;
    }
    @Override
    public void introduce(){
        System.out.println("I am " + getName() + " I am a student. my gpa is " + this.gpa);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void study(){
        System.out.println(getName() + " is studying.");
    }
    public void calculateGpa() {
        System.out.println("the gpa is " + this.gpa);
    }
}
