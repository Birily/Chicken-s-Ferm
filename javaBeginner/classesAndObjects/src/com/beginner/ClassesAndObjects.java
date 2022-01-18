package com.beginner;

public class ClassesAndObjects {

    public static void main(String[] args) {
	Person person1 = new Person("Василий", 43);
    Person person2 = new Person("Виталик", 21);
        System.out.println("Меня зовут "+person1.name+", мне "+person1.age+" лет");
        System.out.println("Меня зовут "+person2.name+", мне "+person2.age+" лет");
    }
}

class Person{
    String name;
     int age;

     public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}