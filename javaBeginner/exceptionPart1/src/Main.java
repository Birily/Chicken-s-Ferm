import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("saf");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Something if going wrong[1]");
        }
        File file1 = new File("src/test");
        try {
            Scanner scanner1 = new Scanner(file1);
        } catch (FileNotFoundException e) {
            System.out.println("Something if going wrong[2]");
        }
        System.out.println("All is under control..");

    }
}
