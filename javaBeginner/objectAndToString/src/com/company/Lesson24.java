package com.company;

public class Lesson24 {

    public static void main(String[] args) {
	Human human1 = new Human("Bob", 34);
        System.out.println(human1);
    }
}
class Human{
    private String name;
    private int age;

    public Human(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return name+", "+age;
    }
}
