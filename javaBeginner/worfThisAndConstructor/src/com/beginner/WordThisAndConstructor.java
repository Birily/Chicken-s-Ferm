package com.beginner;

public class WordThisAndConstructor {

    public static void main(String[] args) {
        System.out.println("All humans in console is "+Human.getCounter());
        Human human1 = new Human();
        human1.hi();
        System.out.println("All humans in console is "+Human.getCounter());
        Human human2 = new Human("Leo");
        human2.hi();
        System.out.println("All humans in console is "+Human.getCounter());
        Human human3 = new Human("Richard", 54);
        human3.hi();
        System.out.println("All humans in console is "+Human.getCounter());
    }
}
class Human{
    private String name;
    private int age;
    private static int counter;

    public Human(){
        System.out.println("Hi, from default constructor");
        this.name = "Bob";
        this.age = 18;
        counter++;
    }

    public Human(String name){
        System.out.println("Hi, from 2nd constructor");
        this.setName(name);
        counter++;
    }

    public Human(String name, int age) {
        System.out.println("Hi, from 3d constructor");
        this.setName(name);
        this.setAge(age);
        counter++;
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
    public void hi(){
        System.out.println("Hi, I'm "+this.name+" and my age is "+this.age);
    }
    public static int getCounter(){
        return counter;
    }
}
