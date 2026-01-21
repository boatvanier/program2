package oop.school;

public class Teacher extends Person{
    private double salary;
    private static int totalTeachers;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
        totalTeachers++;
    }

    public static int getTotalTeachers(){
        return totalTeachers;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void teach(){
        System.out.println(getName() + " is teaching.");
    }
}
