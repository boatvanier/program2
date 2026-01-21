package oop.school;

public class Person {
    private String name;
    private int age;
    private static int totalPerson;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        totalPerson++;
    }

    public static int getTotalPerson(){
        return totalPerson;
    }
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
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name);
    }
}
