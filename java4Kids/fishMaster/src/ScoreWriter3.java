import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class ScoreWriter3 {
    public static void main(String[] args) {
        FileWriter myFile = null;
        BufferedWriter buff = null;

        Date today = new Date();
        ArrayList scores = new ArrayList();
        scores.add(new Score("Сергий","Власов",290,today));
        scores.add(new Score("Иннокентий","Коряжников",350,today));
        scores.add(new Score("Федосий","Гудков",160,today));
        scores.add(new Score("Самуил","Гончаров",460,today));

        try {
            myFile = new FileWriter("scores3.txt");
            buff = new BufferedWriter(myFile);

            for (int i=0;i<scores.size();i++){
                buff.write(scores.get(i).toString());
            }
            System.out.println("Запись прошла успешно.");
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                buff.flush();
                buff.close();
                myFile.close();
            } catch (IOException e1){
                e1.printStackTrace();
            }
        }

    }
}
