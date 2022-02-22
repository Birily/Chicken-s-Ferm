import java.io.*;
import java.util.ArrayList;

public class FileCopy {
    public static void main(String[] args) {

        FileReader myFile = null;
        BufferedReader buff = null;
        FileWriter myFile1 = null;
        BufferedWriter buff1 = null;

        try {
            myFile = new FileReader(args[0]);
            buff = new BufferedReader(myFile);
            myFile1 = new FileWriter(args[1]);
            buff1 = new BufferedWriter(myFile1);
            while (true) {
                String line = buff.readLine();
                if (line == null) break;
                buff1.write(line+"\n");
                System.out.println("Считано и записано: "+line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert buff != null;
                buff.close();
                myFile.close();
                assert buff1 != null;
                buff1.flush();
                buff1.close();
                myFile1.close();
            } catch (IOException e1){
                e1.printStackTrace();
            }
        }
    }
}
