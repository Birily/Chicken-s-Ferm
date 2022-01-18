import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        String animal = (String) animals.get(1);
        System.out.println(animal);

        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat2");
        animals2.add("dog2");
        animals2.add("frog2");
        String animal2 = animals2.get(1);
        System.out.println(animal2);

        List<String> animals3 = new ArrayList<>();
        animals3.add("cat3");
        animals3.add("dog3");
        animals3.add("frog3");
        String animal3 = animals3.get(1);
        System.out.println(animal3);



    }
}
