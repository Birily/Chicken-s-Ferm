import java.io.*;

public class ByteReader {
    public static void main(String[] args) {
        FileInputStream myFile = null;
        BufferedInputStream buff = null;
        try {
            myFile = new FileInputStream("pepe.gif");
            buff = new BufferedInputStream(myFile);
            while (true){
                int valueOfByte = buff.read();
                System.out.println(valueOfByte + " ");
                if (valueOfByte == -1){
                    break;
                }
            }
        } catch (IOException e){
            System.out.println("Невозможно прочитать файл: "+e.toString());
        } finally {
            try {
                buff.close();
                myFile.close();
            } catch (Exception e1){
                System.out.println("Чтение файла успешно завершено");
            }
        }
        int someData[] = {56,230,123,43,11,37};
        FileOutputStream myFile1 = null;
        BufferedOutputStream buff1 = null;
        try {
            myFile1 = new FileOutputStream("xyz.dat");
            buff1 = new BufferedOutputStream(myFile1);
            for (int i=0;i<someData.length;i++){
                buff1.write(someData[i]);
            }
        } catch (IOException e){
            System.out.println("Невозможно записать данные в файл: "+e.toString());
        } finally {
            try {
                buff1.flush();
                buff1.close();
                myFile1.close();
            } catch (Exception e1){
                e1.printStackTrace();
            }
        }
    }
}
