public class Dog extends Animal {

    public Dog(int id){
        super(id);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                '}';
    }
}
