package com.beginner;

public class Methods {

    public static void main(String[] args) {
        Person person1 = new Person("Василий", 43);
        Person person2 = new Person();
        person1.speak();
        person2.setName("");
        person2.setAge(-6);
        person2.speak();
    }

static class Person{
        private String name;
        private int age;

        public Person(){

        }

        public Person(String name, int age) {
            this.setName(name);
            this.setAge(age);
        }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("Вы ввели пустое имя");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("Возраст не можент быть меньше нуля");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setNameAndAge(String nameX, int ageX){
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
