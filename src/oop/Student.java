package oop;

public class Student {
    private String name;
    private int age;
    private double gpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
        this.age = age;}
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student() {
    }

    public Student(String name, int age, double gpa) {
        this.name = name;
        if (age > 0) {
            this.age = age;}
        this.gpa = gpa;
    }

    public Student(String name) {
        this.name = name;
    }

    public void study(){
        System.out.println(this.name + " is studying.");
    }
    public void calculateGpa() {

        System.out.println("the gpa is " + this.gpa);
    }
}
