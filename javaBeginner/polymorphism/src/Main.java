public class Main {

    public static void main(String[] args) {
	// write your code here
    Animal animal = new Animal();
    Dog dog = new Dog();
    Cat cat = new Cat();
    test(animal);
    test(dog);
    test(cat);
    }
    public static void test(Animal animal){
        animal.eat();
    }
}
