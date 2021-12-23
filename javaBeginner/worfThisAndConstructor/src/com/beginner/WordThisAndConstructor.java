package com.beginner;

public class WordThisAndConstructor {

    public static void main(String[] args) {
	Human human1 = new Human();
	Human human2 = new Human("Leo");
	Human human3 = new Human("Richard", 54);
    human1.hi();
    human2.hi();
    human3.hi();
    }
}
class Human{
    private String name;
    private int age;

    public Human(){
        System.out.println("Hi, from default constructor");
        this.name = "Bob";
        this.age = 1;
    }

    public Human(String name){
        System.out.println("Hi, from 2nd constructor");
        this.setName(name);
    }

    public Human(String name, int age) {
        System.out.println("Hi, from 3d constructor");
        this.setName(name);
        this.setAge(age);
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
}
