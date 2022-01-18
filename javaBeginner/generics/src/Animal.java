public class Animal {
    int id;

    public Animal(int id){
        this.id = id;
    }
    public void eat(){
        System.out.println("Animal "+id+"is eating...");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }
}
