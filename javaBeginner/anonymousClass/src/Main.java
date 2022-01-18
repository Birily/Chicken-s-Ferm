public class Main {

    public static void main(String[] args) {

        /*Animal animal = new Animal();
        animal.eat();

        Animal animal1 = new Animal(){
            @Override
            public void eat() {
                System.out.println("OtherAnimal is eating...");
            }
        };
        animal1.eat(); */

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };
        ableToEat.eat();
    }
}

/*class Animal{
    public void eat(){
        System.out.println("Animal is eating...");
    }
}
class OtherAnimal extends Animal{
    @Override
    public void eat() {
        System.out.println("OtherAnimal is eating...");
    }
}*/
interface AbleToEat{
    public void eat();
}
