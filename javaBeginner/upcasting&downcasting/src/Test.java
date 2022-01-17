public class Test {
    public static void main(String[] args){
        //Upcasting
        Animal animal = new Dog();
        Dog dog = new Dog();
        Animal animal1 = dog;

        //Downcasting
        Dog dog1 = (Dog)animal1;
        dog1.eat();

    }
}
