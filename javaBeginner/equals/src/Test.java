import java.util.Objects;

public class Test {

    public static void main(String[] args) {
	    Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        System.out.println(animal1.equals(animal2));
        String string1 = "Hello";
        String string2 = "Hello";
        System.out.println(string1.equals(string2));
        String string3= "Hello";
        String string4 = "Hello123".substring(0, 5);
        System.out.println(string3.equals(string4));

    }

}
 class Animal{
    private int id;

    public Animal(int id){
        this.id = id;
    }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Animal animal = (Animal) o;
         return id == animal.id;
     }

     @Override
     public int hashCode() {
         return Objects.hash(id);
     }
 }