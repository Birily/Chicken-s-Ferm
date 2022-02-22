import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Long,String> data = new HashMap<>();
        data.put(80293797534L, "Хина");
        data.put(80253547824L, "Михаил");
        data.put(80443873261L, "Савелий");
        data.put(80333549734L, "Павел");

        for (Map.Entry<Long,String> personalData : data.entrySet()){
            System.out.println("Номер телефона: "+personalData.getKey()+" Имя: "+personalData.getValue());
        }
    }
}
