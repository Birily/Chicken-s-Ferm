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
        Person person3 = new Person();
        person3.setNameAndAge("Игорь", 29);
        person3.speak();
        person3.setName("Артемон");
        person3.speak();
        person3.setAge(24);
        person3.speak();
        System.out.println("Nixya, pomolodel");
    }

static class Person{
        String name;
        int age;

        public Person(){

        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNameAndAge(String nameX,int ageX){
            this.name = nameX;
            this.age = ageX;
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
