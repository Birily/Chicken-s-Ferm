import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FishMaster {
    public static void main(String[] args) {
        Fish myFish = new Fish();

        String feetString = "";

        int feet;
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Готова к погружению. На какую глубину?");
            try{
                feetString = stdin.readLine();
                if (feetString.equals("Q")){
                    System.out.println("Пока!");
                    System.exit(0);
                } else {
                    feet = Integer.parseInt(feetString);
                    myFish.dive(feet);
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
