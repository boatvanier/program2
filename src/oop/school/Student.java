package oop.school;

public class Student extends Person{
    private double gpa;

    public Student(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
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
