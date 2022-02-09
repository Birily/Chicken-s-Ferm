import javax.swing.*;
import java.awt.*;

public class SimpleCalculatorGrid {

    public static void main(String[] args) {

        //панель создаём

        JPanel windowContent = new JPanel();

        // задаём менеджер отображения панели

        GridLayout gl = new GridLayout(4,2);
        windowContent.setLayout(gl);

        //создаём компоненты впамяти

        JLabel label1 = new JLabel("Number 1");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum: ");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");

        //Добавляем компоненты в панель

        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);

        //Создаём фрейм и задаём панель для него

        JFrame frame = new JFrame("My Fisting Calculator");
        frame.setContentPane(windowContent);

        //Задаём размер фрейма и делаем его видимым

        frame.setSize(500,200);
        frame.setVisible(true);

    }

}
