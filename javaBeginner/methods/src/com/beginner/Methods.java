package com.beginner;

public class Methods {

    public static void main(String[] args) {
        Person person1 = new Person("Василий", 43);
        Person person2 = new Person("Виталик", 21);
        person1.speak();
        person2.speak();
        person1.sayHello();
        System.out.println("Человеку до пенсии: "+person1.calculateYearsToRetirement()+" лет");
        System.out.println("Человеку до пенсии: "+person2.calculateYearsToRetirement()+" лет");
    }

static class Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        void speak(){
            System.out.println("Меня зовут "+this.name+", мне "+this.age+" лет");
        }
        void sayHello(){
            System.out.println("Hello");
        }
        int calculateYearsToRetirement(){
            return 65-age;
        }

    }
}
